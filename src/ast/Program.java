package ast;

import java.util.ArrayList;
import java.util.List;

public class Program extends Node{
    private List<Code> codes = new ArrayList<>();

    public List<Code> getCodes() {
        return codes;
    }

    public Program(List<Code> codes) {
        this.codes = codes;
    }

    @Override
    public <T> T accept(firstVisitor<T> v) {
        return v.visit(this);
    }
}
