package ast;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.security.Key;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.awt.event.InputEvent;



public class firstEvaluator implements firstVisitor<Object> {
    Robot robot;

    public firstEvaluator(Robot robot) {
        this.robot = robot;
    }

    @Override
    public Object visit(Program p) {
        for (Code s : p.getCodes()) {
            s.accept(this);
        }
        return null;
    }

//    @Override
//    public Object visit(Code p) {
//        return null;
//    }

    @Override
    public Object visit(Repeat p) {
        return null;
    }

    @Override
    public Object visit(Hold p) {
        List<Integer> mouseKeyCodes = Arrays.asList(InputEvent.BUTTON1_DOWN_MASK, InputEvent.BUTTON2_DOWN_MASK, InputEvent.BUTTON3_DOWN_MASK);



        if (p.isState()) {
            // press down
            for (Integer keyCode: visit(p.getKeys())) {
                if (mouseKeyCodes.contains(keyCode)) {
                    // mouse actions
                    robot.mousePress(keyCode);
                } else {
                    // keyboard actions
                    try {
                        robot.keyPress(keyCode);
                    } catch (Exception e) {
                        System.out.println("Bad keycode");
                    }
                }
            }

            if (p.getMouse() != null) {
                robot.mouseMove(p.getMouse().getCoord().getxCoord(), p.getMouse().getCoord().getyCoord());
            }
        } else {
            // release
            for (Integer keyCode: visit(p.getKeys())) {
                if (mouseKeyCodes.contains(keyCode)) {
                    // mouse actions
                    robot.mouseRelease(keyCode);
                } else {
                    // keyboard actions
                    try {
                        robot.keyRelease(keyCode);
                    } catch (Exception e) {
                        System.out.println("Bad keycode");
                    }
                }
            }
        }
        return null;
    }

//    @Override
//    public Object visit(Command p) {
//        return null;
//    }

    @Override
    // assume p is the input time in integer format
    public Object visit(Wait p) {
        try {
            robot.delay(p.getTime());
        } catch (IllegalArgumentException e) {
            System.out.println("time out of bounds");
        }

        return null;
    }

    @Override
    public List<Integer> visit(Keys p) {
        return p.getKeys();
    }

    @Override
    // assume p is a list of integer keycodes
    public Object visit(Press p) {
        // dummy keycodes for mouse action
        List<Integer> mouseKeyCodes = Arrays.asList(InputEvent.BUTTON1_DOWN_MASK, InputEvent.BUTTON2_DOWN_MASK, InputEvent.BUTTON3_DOWN_MASK);
        for (Integer keyCode: visit(p.getKeys())) {
            if (p.getMouse() != null) {
                robot.mouseMove(p.getMouse().getCoord().getxCoord(), p.getMouse().getCoord().getyCoord());
            }

            if (mouseKeyCodes.contains(keyCode)) {
                // mouse actions
                robot.mousePress(keyCode);
                robot.mouseRelease(keyCode);
            } else {
                // keyboard actions
                try {
                    robot.keyPress(keyCode);
                    robot.keyRelease(keyCode);
                } catch (Exception e) {
                    System.out.println("Bad keycode");
                }
            }
        }

        return null;
    }

    @Override
    public Object visit(Hover p) {
        robot.mouseMove(p.getMouse().getCoord().getxCoord(), p.getMouse().getCoord().getyCoord());
        return null;
    }

    @Override
    public Object visit(Write p) {
        // https://stackoverflow.com/questions/29665534/type-a-string-using-java-awt-robot
        String text = p.getInputString();
        StringSelection stringSelection = new StringSelection(text);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, stringSelection);

        robot.keyPress(17);
        robot.keyPress(86);
        robot.keyRelease(86);
        robot.keyRelease(17);

        return null;
    }

    @Override
    public Object visit(Mouse p) {
        return p.getCoord();
    }

    @Override
    public Object visit(Coord p) {
        return null;
    }
}
