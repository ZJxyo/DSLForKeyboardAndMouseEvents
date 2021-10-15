package ast;

import java.util.ArrayList;
import java.util.List;

public class Hold extends Code {
    private Keys keys;
    // private Mouse mouse;
    private boolean state;

//    public Hold(Keys keys, Mouse mouse, Boolean state) {
//        this.keys = keys;
//        this.mouse = mouse;
//        this.state = state;
//    }

    public Hold(Keys keys, Boolean state) {
        this.keys = keys;
        this.state = state;
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

//    public Mouse getMouse() {
//        return mouse;
//    }
//
//    public void setMouse(Mouse mouse) {
//        this.mouse = mouse;
//    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
}
