package ast;

public class Coord extends Node {
    private Integer xCoord;
    private Integer yCoord;

    public Coord(String xCoord, String yCoord) {
        this.xCoord = Integer.parseInt(xCoord);
        this.yCoord = Integer.parseInt(yCoord);
    }

    @Override
    public <T> T accept(firstVisitor<T> v) {
        return v.visit(this);
    }

    public Integer getxCoord() {
        return xCoord;
    }

    public void setxCoord(Integer xCoord) {
        this.xCoord = xCoord;
    }

    public Integer getyCoord() {
        return yCoord;
    }

    public void setyCoord(Integer yCoord) {
        this.yCoord = yCoord;
    }
}
