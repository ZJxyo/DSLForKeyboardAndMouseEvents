package ast;

import java.util.ArrayList;
import java.util.List;

public class Keys extends Node{
    private List<Integer> keys;

    public Keys(List<Integer> keys) {
        this.keys = keys;
    }

    @Override
    public <T> T accept(firstVisitor<T> v) {
        return v.visit(this);
    }

    public List<Integer> getKeys() {
        return keys;
    }

    public void setKeys(List<Integer> keys) {
        this.keys = keys;
    }
}
