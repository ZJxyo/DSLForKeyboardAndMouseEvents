package parser;
import ast.*;
import org.antlr.v4.runtime.tree.*;

import java.util.ArrayList;
import java.util.List;

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
        } else {
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
        return new Wait(ctx.TEXT().getText());
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
        return new Coord(ctx.TEXT().get(0).getText(), ctx.TEXT().get(1).getText());
    }

    @Override
    public Keys visitKeys(firstParser.KeysContext ctx) {
        List<Integer> keys = new ArrayList<>();
        for (TerminalNode k : ctx.TEXT()) {
            keys.add(Integer.parseInt(k.getText()));
        }
        return new Keys(keys);
    }
}
