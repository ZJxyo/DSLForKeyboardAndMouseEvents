package ast;

import ast.variables.Number;
import ast.variables.VarAssignment;
import ast.variables.VarDeclaration;
import ast.variables.VarName;
import ast.variables.VarOperation;
import ast.variables.VarPrint;

public interface firstVisitor<T> {
    T visit(Program p);
//    T visit(Code p);
    T visit(Repeat p);
    T visit(Hold p);
//    T visit(Command p);
    T visit(Wait p);
    T visit(Press p);
    T visit(Hover p);
    T visit(Write p);
    T visit(Mouse p);
    T visit(Coord p);
    T visit(Keys p);
    T visit(VarDeclaration dec);
    T visit(VarAssignment assignment);
    T visit(VarOperation operation);
    T visit(VarName name);
    T visit(Number number);
    T visit(VarPrint print);

}
