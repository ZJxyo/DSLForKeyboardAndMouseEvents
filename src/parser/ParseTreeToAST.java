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
import java.util.List;

public class ParseTreeToAST extends AbstractParseTreeVisitor<Node> implements firstParserVisitor<Node>  {
    List<Code> loc;

    // adds all the Code objects to a list
    @Override
    public Program visitProgram(firstParser.ProgramContext ctx) {
        loc = new ArrayList<>();
        for (firstParser.CodeContext c : ctx.code()) {
            loc.add(this.visitCode(c));
        }
        return new Program(loc);
    }

    // check whether the given Code obj is either a command, hold, repeat, or var. then processes the obj.
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
    // calls repeatHelper and returns Repeat object
    @Override
    public Code visitRepeat(firstParser.RepeatContext ctx) {
        if (ctx.code() != null) {
            repeatHelper(ctx);
            return new Repeat(loc);
        } else {
            throw new RuntimeException("Repeat parse tree with invalid context information");
        }
    }
    // calls holdRepeatHelper a specified number of times
    private void repeatHelper(firstParser.RepeatContext ctx) {
        try {
            int localTimes = Integer.parseInt(ctx.TEXT().getText());
            for (int i = localTimes; i > 0; i--) {
                for (firstParser.CodeContext c : ctx.code()) {
                    holdRepeatHelper(c);
                }
            }
        } catch (Exception e) {
            System.out.println("Must use an integer for the number of repeats");
        }
    }

    // processes the hold object, calls holdHelper to add the start of the hold action to the LOC
    // holdHelp processes the contents within hold. then adds the end of the hold action to the LOC to release the key
    @Override
    public Code visitHold(firstParser.HoldContext ctx) {
        if (ctx.code() != null) {
            holdHelper(ctx, true);
            //return new Hold(visitKeys(ctx.keys()), visitMouse(ctx.mouse()), false);
            return new Hold(visitKeys(ctx.keys()), false);
        } else {
            throw new RuntimeException("Hold parse tree with invalid context information");
        }
    }
    //  adds a Hold object with true to the list of codes, calls repeatHelper for each code
    //  inside HoldContext, if first is false add a new Hold object with false
    private void holdHelper(firstParser.HoldContext ctx, boolean first) {
        // loc.add(new Hold(visitKeys(ctx.keys()), visitMouse(ctx.mouse()), true));
        loc.add(new Hold(visitKeys(ctx.keys()), true));
        for (firstParser.CodeContext c : ctx.code()) {
            holdRepeatHelper(c);
        }
        if (!first) {
            // loc.add(new Hold(visitKeys(ctx.keys()), visitMouse(ctx.mouse()), false));
            loc.add(new Hold(visitKeys(ctx.keys()), false));
        }
    }

    // check if the given obj is a repeat, hold, or otherwise, and processes them.
    private void holdRepeatHelper(firstParser.CodeContext c) {
        if (c.repeat() != null) {
            repeatHelper(c.repeat());
        } else if (c.hold() != null) {
            holdHelper(c.hold(), false);
        } else {
            loc.add(this.visitCode(c));
        }
    }
    // checks to see which type of command ctx is, and calls their respective methods
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

    // creates a new object for the wait command
    @Override
    public Wait visitWaitFor(firstParser.WaitForContext ctx) {
        return new Wait(visitExp(ctx.exp()));
    }

    // creates a new object for the press command, with input of keys and mouse location
    @Override
    public Press visitPress(firstParser.PressContext ctx) {
        return new Press(visitKeys(ctx.keys()), visitMouse(ctx.mouse()));
    }

    // create a new hover object with its mouse object
    @Override
    public Hover visitHover(firstParser.HoverContext ctx) {
        return new Hover(visitMouse(ctx.mouse()));
    }

    // creates a new object for the write commmand, with input of the given string
    @Override
    public Write visitWrite(firstParser.WriteContext ctx) {
        return new Write(ctx.STRING().getText());
    }

    // checks if there is a mouse context, and returns a new mouse object
    @Override
    public Mouse visitMouse(firstParser.MouseContext ctx) {
        if (ctx == null) {
            return null;
        } else {
            return new Mouse(visitCoord(ctx.coord()));
        }
    }

    // creates a new coord object, with inputs of the x and y screen coords
    @Override
    public Coord visitCoord(firstParser.CoordContext ctx) {
        return new Coord(visitExp(ctx.exp().get(0)), visitExp(ctx.exp().get(1)));
    }

    // creates a new keys object, with the given list of keys specified by the user
    @Override
    public Keys visitKeys(firstParser.KeysContext ctx) {
        List<List<Integer>> keys = new ArrayList<>();

        for (TerminalNode k : ctx.TEXT()) {
            keys.add(Keys.keyMap.get(k.getText()));
        }
        return new Keys(keys);
    }

    // checks the type of variable command of ctx and calls the respective method
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

    // creates a new declare object, with the given variable name
    @Override
    public VarDeclaration visitDeclare(firstParser.DeclareContext ctx) {
        return new VarDeclaration(ctx.NAME().getText());
    }

    // creates a new assign object, with the variable name and its assignment
    @Override
    public VarAssignment visitAssign(firstParser.AssignContext ctx) {
        return new VarAssignment(ctx.NAME().getText(), visitExp(ctx.exp()));
    }

    // creates a new var operation object, with its operation, name and exp
    @Override
    public VarOperation visitOperation(firstParser.OperationContext ctx) {
        return new VarOperation(ctx.OPERATION().getText(),
                                ctx.NAME().getText(), visitExp(ctx.exp()));
    }

    // create a new var print object, with its exp
    @Override
    public VarPrint visitPrint(firstParser.PrintContext ctx) {
        return new VarPrint(visitExp(ctx.exp()));
    }

    // processes exp, returns its assignment if no usage is found, else process usage.
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

    // creates a new variable name
    @Override
    public VarName visitUsage(firstParser.UsageContext ctx) {
        return new VarName(ctx.NAME().getText());
    }
}
