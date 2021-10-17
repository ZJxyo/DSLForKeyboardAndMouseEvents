package ast;

import ast.variables.Number;
import ast.variables.VarAssignment;
import ast.variables.VarDeclaration;
import ast.variables.VarName;
import ast.variables.VarOperation;
import ast.variables.VarPrint;

import java.awt.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.awt.event.InputEvent;

import java.util.Map;


public class firstEvaluator implements firstVisitor<Object> {
    Robot robot;
    private static final Map<String, Integer> symbolTable = new HashMap<>();
    // env variable for the time delay between executing each command
    // added to reduce the number of waits needed in the input file when dealing with delayed response
    final String delay = "delay";

    // assigns the robot obj to access mouse and keyboard
    public firstEvaluator(Robot robot) {
        this.robot = robot;
        symbolTable.put(delay, 300);
    }

    // loops through all the codes objects from program p using the visitor pattern
    // inserts a new robot delay time between each iteration
    @Override
    public Object visit(Program p) {
        for (Code s : p.getCodes()) {
            try {
                Integer time = symbolTable.get(delay);
                if (time == null) {
                    System.out.println("delay cannot be null");
                    System.exit(1);
                }
                robot.delay(symbolTable.get(delay));
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid delay");
                System.exit(1);
            }
            s.accept(this);
        }
        return null;
    }

    // no implementation needed since repeat is purely structural
    @Override
    public Object visit(Repeat p) {
        return null;
    }

    // if the hold object's state is true press the specified key, if it is false release the key
    // if the keycode is more than one press both specified keys
    // else check if it is a mouse click, else it is a single key press
    @Override
    public Object visit(Hold p) {
        List<Integer> mouseKeyCodes = Arrays.asList(InputEvent.BUTTON1_DOWN_MASK, InputEvent.BUTTON2_DOWN_MASK, InputEvent.BUTTON3_DOWN_MASK);

        if (p.isState()) {
            // press down
            for (List<Integer> keyCode: visit(p.getKeys())) {
                // control means keycode is length 2 (ctrl v, c, etc)
                if (keyCode != null) {
                    if (keyCode.size() > 1) {
                        try {
                            robot.keyPress(keyCode.get(0));
                            robot.keyPress(keyCode.get(1));
                        } catch (Exception e) {
                            System.out.println("Bad keycode");
                        }
                    } else {
                        if (mouseKeyCodes.contains(keyCode.get(0))) {
                            robot.mousePress(keyCode.get(0));
                        } else {
                            try {
                                robot.keyPress(keyCode.get(0));
                            } catch (Exception e) {
                                System.out.println("Bad keycode");
                            }
                        }
                    }
                } else {
                    System.out.println("Bad keycode");
                    System.exit(1);
                }
            }

        } else {
            // release
            for (List<Integer> keyCode: visit(p.getKeys())) {
                if (keyCode != null) {
                    if (keyCode.size() > 1) {
                        try {
                            robot.keyRelease(keyCode.get(0));
                            robot.keyRelease(keyCode.get(1));
                        } catch (Exception e) {
                            System.out.println("Bad keycode");
                        }
                    } else {
                        if (mouseKeyCodes.contains(keyCode.get(0))) {
                            robot.mouseRelease(keyCode.get(0));
                        } else {
                            try {
                                robot.keyRelease(keyCode.get(0));
                            } catch (Exception e) {
                                System.out.println("Bad keycode");
                            }
                        }
                    }
                } else {
                    System.out.println("Bad keycode");
                    System.exit(1);
                }
            }
        }
        return null;
    }



    @Override
    // processes the wait command, program will wait and do nothing during the specified timespan
    // exits the program if the given time amount is invalid
    public Object visit(Wait p) {
        try {
            Integer time = (Integer)p.getExpression().accept(this);
            if (time == null) {
                System.out.println("Variable not assigned");
                System.exit(1);
            }
            Thread.sleep(time);
        } catch (InterruptedException e) {
            System.out.println("Unexpected interruption");
            System.exit(1);
        }

        return null;
    }

    // returns the list of lists of keycodes for the given set of Keys p
    @Override
    public List<List<Integer>> visit(Keys p) {
        return p.getKeys();
    }

    @Override
    // assume p is a list of lists of integer keycodes
    // press is separated between mouse and keyboard, due to the robot lib
    // all presses are in press + release pairs, to emulate a quick press of buttons and keys
    // moves the mouse to the specified location, if the specification exists
    // keys are separated into regular keys and character requiring key combos. For example, "? = shift + /"
    // terminate program in case of a bad keycode
    public Object visit(Press p) {
        // dummy keycodes for mouse action
        List<Integer> mouseKeyCodes = Arrays.asList(InputEvent.BUTTON1_DOWN_MASK, InputEvent.BUTTON2_DOWN_MASK, InputEvent.BUTTON3_DOWN_MASK);
        for (List<Integer> keyCode: visit(p.getKeys())) {
            if (p.getMouse() != null) {
                Integer xCoord = (Integer)p.getMouse().getCoord().getxCoord().accept(this);
                Integer yCoord = (Integer)p.getMouse().getCoord().getyCoord().accept(this);
                robot.mouseMove(xCoord, yCoord);
            }

            if (keyCode != null) {
                if (keyCode.size() > 1) {
                    try {
                        robot.keyPress(keyCode.get(0));
                        robot.keyPress(keyCode.get(1));
                        robot.keyRelease(keyCode.get(1));
                        robot.keyRelease(keyCode.get(0));
                    } catch (Exception e) {
                        System.out.println("Bad keycode");
                    }
                } else {
                    if (mouseKeyCodes.contains(keyCode.get(0))) {
                        // mouse actions
                        robot.mousePress(keyCode.get(0));
                        robot.mouseRelease(keyCode.get(0));
                    } else {
                        // keyboard actions
                        try {
                            robot.keyPress(keyCode.get(0));
                            robot.keyRelease(keyCode.get(0));
                        } catch (Exception e) {
                            System.out.println("Bad keycode");
                        }
                    }
                }
            } else {
                System.out.println("Bad keycode");
                System.exit(1);
            }
        }

        return null;
    }

    // moves the mouse to the specified x,y coordinates
    @Override
    public Object visit(Hover p) {
        Integer xCoord = (Integer)p.getMouse().getCoord().getxCoord().accept(this);
        Integer yCoord = (Integer)p.getMouse().getCoord().getyCoord().accept(this);
        robot.mouseMove(xCoord,
                        yCoord);
        return null;
    }

    // presses a sequence of specified keys
    // if the keycode size is greater than one, it means two key presses at the same time
    // else it is just a single key press
    @Override
    public Object visit(Write p) {
        // https://stackoverflow.com/questions/29665534/type-a-string-using-java-awt-robot

        String text = p.getInputString();
        for (char c : text.toCharArray()) {
            String charString = String.valueOf(c);
            List<Integer> keyCodes;
            if (Keys.keyMap.containsKey(charString)) {
                keyCodes = Keys.keyMap.get(charString);
            } else {
                throw new RuntimeException(
                        "Key code not found for character '" + c + "'");
            }
            if (keyCodes.size() > 1) {
                robot.keyPress(keyCodes.get(0));
                robot.keyPress(keyCodes.get(1));
                robot.keyRelease(keyCodes.get(1));
                robot.keyRelease(keyCodes.get(0));
            } else {
                robot.keyPress(keyCodes.get(0));
                robot.keyRelease(keyCodes.get(0));
            }
        }

        return null;
    }

    // returns the coordinates of the mouse object
    @Override
    public Object visit(Mouse p) {
        return p.getCoord();
    }

    // no implementation needed, just return null
    @Override
    public Object visit(Coord p) {
        return null;
    }

    // declares new variable by putting the variable name as the key and a default value of null in symbolTable
    @Override
    public Object visit(VarDeclaration dec) {
        //System.out.println("testing declaration");
        symbolTable.put(dec.getName(), null);
        return null;
    }

    // checks if there is the specified variable name and puts the value in the symbolTable
    @Override
    public Object visit(VarAssignment assignment) {
        Integer assignValue = (Integer)assignment.getExpression().accept(this);
        if (symbolTable.containsKey(assignment.getName())) {
            symbolTable.put(assignment.getName(), assignValue);
        } else {
            System.out.print("No variable " + assignment.getName());
            System.exit(1);
        }
        return null;
    }

    // processes the operations for variables
    // if the variable name is not found in the symbol table, terminate the program
    // otherwise, process "+", "-", and "*" respectively. Note, operations are essentially equivalent to "+=", etc.
    // updates the symbol table post operation, with new var assignment
    @Override
    public Object visit(VarOperation operation) {
        // TODO: throw error if number doesnt exist in map
        int val = 0;
        if (symbolTable.containsKey(operation.getName())) {
            val = symbolTable.get(operation.getName());
        } else {
            System.out.print("No variable " + operation.getName());
            System.exit(1);
        }

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

    // returns the value of the corresponding variable name
    @Override
    public Integer visit(VarName name) {
        if (symbolTable.containsKey(name.getName())) {
            return symbolTable.get(name.getName());
        } else {
            System.out.print("No variable " + name.getName());
            System.exit(1);
            return 1;
        }
    }

    // return the integer field of the number object
    @Override
    public Integer visit(Number number) {
        return number.getNum();
    }

    // prints the corresponding variable of exp
    @Override
    public Object visit(VarPrint print) {
        System.out.println("PRINTING " + print.getPrint().accept(this));
        return null;
    }
}
