package ast;

import ast.variables.Exp;

public class Coord extends Node {
    private Exp xCoord;
    private Exp yCoord;

    public Coord(Exp xCoord, Exp yCoord) {
        this.xCoord = xCoord;
        this.yCoord = yCoord;
    }

    @Override
    public <T> T accept(firstVisitor<T> v) {
        return v.visit(this);
    }

    public Exp getxCoord() {
        return xCoord;
    }

    public void setxCoord(Exp xCoord) {
        this.xCoord = xCoord;
    }

    public Exp getyCoord() {
        return yCoord;
    }

    public void setyCoord(Exp yCoord) {
        this.yCoord = yCoord;
    }
}
