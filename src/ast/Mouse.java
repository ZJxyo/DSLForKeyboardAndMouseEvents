package ast;

public class Mouse extends Node {
    private Coord coord;
    public Mouse (Coord coord) {
        this.coord = coord;
    }

    @Override
    public <T> T accept(firstVisitor<T> v) {
        return v.visit(this);
    }

    public Coord getCoord() {
        return coord;
    }

    public void setCoord(Coord coord) {
        this.coord = coord;
    }
}
