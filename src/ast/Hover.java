package ast;

public class Hover extends Command {
    private Mouse mouse;

    public Hover(Mouse mouse) {
        this.mouse = mouse;
    }

    @Override
    public <T> T accept(firstVisitor<T> v) {
        return v.visit(this);
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }
}
