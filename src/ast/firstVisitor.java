package ast;

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

}
