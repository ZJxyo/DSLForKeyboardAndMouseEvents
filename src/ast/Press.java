package ast;

public class Press extends Command {
    private Keys keys;
    private Mouse mouse;

    public Press(Keys keys, Mouse mouse) {
        this.keys = keys;
        this.mouse = mouse;
    }

    @Override
    public <T> T accept(firstVisitor<T> v) {
        return v.visit(this);
    }

    public Keys getKeys() {
        return keys;
    }

    public void setKeys(Keys keys) {
        this.keys = keys;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }
}
