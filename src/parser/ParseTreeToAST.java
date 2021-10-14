package parser;
import ast.*;
import ast.variables.Exp;
import ast.variables.Number;
import ast.variables.VarAssignment;
import ast.variables.VarDeclaration;
import ast.variables.VarName;
import ast.variables.VarOperation;
import ast.variables.VarPrint;
import org.antlr.v4.runtime.tree.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParseTreeToAST extends AbstractParseTreeVisitor<Node> implements firstParserVisitor<Node>  {
    List<Code> loc;


    @Override
    public Program visitProgram(firstParser.ProgramContext ctx) {
        loc = new ArrayList<>();
        for (firstParser.CodeContext c : ctx.code()) {
            loc.add(this.visitCode(c));
        }
        return new Program(loc);
    }

    @Override
    public Code visitCode(firstParser.CodeContext ctx) {
        if (ctx.command() != null) {
            return visitCommand(ctx.command());
        } else if (ctx.hold() != null) {
            return visitHold(ctx.hold());
        } else if (ctx.repeat() != null) {
            return visitRepeat(ctx.repeat());
        } else if (ctx.var() != null) {
            return visitVar(ctx.var());
        }
        else {
            throw new RuntimeException("Code parse tree with invalid context information");
        }
    }

    @Override
    public Code visitRepeat(firstParser.RepeatContext ctx) {
        if (ctx.code() != null) {
            repeatHelper(ctx);
            return new Repeat(loc);
        } else {
            throw new RuntimeException("Repeat parse tree with invalid context information");
        }
    }

    private void repeatHelper(firstParser.RepeatContext ctx) {
        int localTimes = Integer.parseInt(ctx.TEXT().getText());
        for (int i = localTimes; i > 0; i--) {
            for (firstParser.CodeContext c : ctx.code()) {
                holdRepeatHelper(c);
            }
        }
    }

    @Override
    public Code visitHold(firstParser.HoldContext ctx) {
        if (ctx.code() != null) {
            holdHelper(ctx, true);
            return new Hold(visitKeys(ctx.keys()), visitMouse(ctx.mouse()), false);
        } else {
            throw new RuntimeException("Hold parse tree with invalid context information");
        }
    }

    private void holdHelper(firstParser.HoldContext ctx, boolean first) {
        loc.add(new Hold(visitKeys(ctx.keys()), visitMouse(ctx.mouse()), true));
        for (firstParser.CodeContext c : ctx.code()) {
            holdRepeatHelper(c);
        }
        if (!first) {
            loc.add(new Hold(visitKeys(ctx.keys()), visitMouse(ctx.mouse()), false));
        }
    }

    private void holdRepeatHelper(firstParser.CodeContext c) {
        if (c.repeat() != null) {
            repeatHelper(c.repeat());
        } else if (c.hold() != null) {
            holdHelper(c.hold(), false);
        } else {
            loc.add(this.visitCode(c));
        }
    }

    @Override
    public Command visitCommand(firstParser.CommandContext ctx) {
        if (ctx.waitFor() != null) {
            return visitWaitFor(ctx.waitFor());
        } else if (ctx.press() != null) {
        return visitPress(ctx.press());
        } else if (ctx.hover() != null) {
            return visitHover(ctx.hover());
        } else if (ctx.write() != null) {
            return visitWrite(ctx.write());
        } else {
            throw new RuntimeException("Command parse tree with invalid context information");
        }
    }

    @Override
    public Wait visitWaitFor(firstParser.WaitForContext ctx) {
        return new Wait(visitExp(ctx.exp()));
    }

    @Override
    public Press visitPress(firstParser.PressContext ctx) {
        return new Press(visitKeys(ctx.keys()), visitMouse(ctx.mouse()));
    }

    @Override
    public Hover visitHover(firstParser.HoverContext ctx) {
        return new Hover(visitMouse(ctx.mouse()));
    }

    @Override
    public Write visitWrite(firstParser.WriteContext ctx) {
        return new Write(ctx.STRING().getText());
    }

    @Override
    public Mouse visitMouse(firstParser.MouseContext ctx) {
        if (ctx == null) {
            return null;
        } else {
            return new Mouse(visitCoord(ctx.coord()));
        }
    }

    @Override
    public Coord visitCoord(firstParser.CoordContext ctx) {
        return new Coord(visitExp(ctx.exp().get(0)), visitExp(ctx.exp().get(1)));
    }

    @Override
    public Keys visitKeys(firstParser.KeysContext ctx) {
        List<List<Integer>> keys = new ArrayList<>();

        for (TerminalNode k : ctx.TEXT()) {
            keys.add(Keys.keyMap.get(k.getText()));
        }
        return new Keys(keys);
    }

    @Override
    public Code visitVar(firstParser.VarContext ctx) {
        if (ctx.declare() != null) {
            return visitDeclare(ctx.declare());
        } else if (ctx.assign() != null) {
            return visitAssign(ctx.assign());
        } else if (ctx.operation() != null) {
            return visitOperation(ctx.operation());
        }
        else if (ctx.print() != null) {
            return visitPrint(ctx.print());
        }
        return null;
    }

    @Override
    public VarDeclaration visitDeclare(firstParser.DeclareContext ctx) {
        return new VarDeclaration(ctx.NAME().getText());
    }

    @Override
    public VarAssignment visitAssign(firstParser.AssignContext ctx) {
        return new VarAssignment(ctx.NAME().getText(), visitExp(ctx.exp()));
    }

    @Override
    public VarOperation visitOperation(firstParser.OperationContext ctx) {
        return new VarOperation(ctx.OPERATION().getText(),
                                ctx.NAME().getText(), visitExp(ctx.exp()));
    }

    @Override
    public VarPrint visitPrint(firstParser.PrintContext ctx) {
        return new VarPrint(visitExp(ctx.exp()));
    }

    @Override
    public Exp visitExp(firstParser.ExpContext ctx) {
        if (ctx.usage() != null) {
            return visitUsage(ctx.usage());
        } else if (ctx.CONST() != null) {
            return new Number(Integer.parseInt(ctx.CONST().getText()));
        } else {
            throw new RuntimeException("Bad Expression");
        }
    }

    @Override
    public VarName visitUsage(firstParser.UsageContext ctx) {
        return new VarName(ctx.NAME().getText());
    }
}
