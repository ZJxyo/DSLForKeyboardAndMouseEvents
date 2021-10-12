package ast;
import ast.variables.Number;
import ast.variables.VarAssignment;
import ast.variables.VarDeclaration;
import ast.variables.VarName;
import ast.variables.VarOperation;
import ast.variables.VarPrint;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.security.Key;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.awt.event.InputEvent;
import java.util.Locale;
import java.util.Map;


public class firstEvaluator implements firstVisitor<Object> {
    Robot robot;
    private static final Map<String, Integer> symbolTable = new HashMap<>();

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
                Integer xCoord = (Integer)p.getMouse().getCoord().getxCoord().accept(this);
                Integer yCoord = (Integer)p.getMouse().getCoord().getyCoord().accept(this);
                robot.mouseMove(xCoord, yCoord);
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



    @Override
    // assume p is the input time in integer format
    public Object visit(Wait p) {
        System.out.println("waiting");
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
                Integer xCoord = (Integer)p.getMouse().getCoord().getxCoord().accept(this);
                Integer yCoord = (Integer)p.getMouse().getCoord().getyCoord().accept(this);
                robot.mouseMove(xCoord, yCoord);
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
        Integer xCoord = (Integer)p.getMouse().getCoord().getxCoord().accept(this);
        Integer yCoord = (Integer)p.getMouse().getCoord().getyCoord().accept(this);
        robot.mouseMove(xCoord,
                        yCoord);
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

    @Override
    public Object visit(VarDeclaration dec) {
        System.out.println("testing declaration");
        symbolTable.put(dec.getName(), null);
        return null;
    }

    @Override
    public Object visit(VarAssignment assignment) {
        System.out.println("testing assignment");
        Integer assignValue = (Integer)assignment.getExpression().accept(this);
        // TODO: error if not declared
        symbolTable.put(assignment.getName(), assignValue);
        return null;
    }

    @Override
    public Object visit(VarOperation operation) {
        // TODO: throw error if number doesnt exist in map
        int val = symbolTable.getOrDefault(operation.getName(), 0);
        Integer evaluatedExpression = (Integer)operation.getExpression().accept(this);
        int ret = 0;
        if (operation.getOperation() == VarOperation.Operation.ADD) {
            ret = val + evaluatedExpression;
        } else if (operation.getOperation() == VarOperation.Operation.SUBTRACT) {
            ret = val - evaluatedExpression;
        } else if (operation.getOperation() == VarOperation.Operation.MULTIPLY) {
            ret = val * evaluatedExpression;
        }
        symbolTable.put(operation.getName(), ret);
        return ret;
    }

    @Override
    public Integer visit(VarName name) {
        // TODO: throw runtime error if not in map
        return symbolTable.getOrDefault(name.getName(), -500);
    }

    @Override
    public Integer visit(Number number) {
        return number.getNum();
    }

    @Override
    public Object visit(VarPrint print) {
        System.out.println("PRINTING" + print.getPrint().accept(this));
        return null;
    }
}
