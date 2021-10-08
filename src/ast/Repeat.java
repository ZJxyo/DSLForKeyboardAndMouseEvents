package ast;

import java.util.ArrayList;
import java.util.List;

public class Repeat extends Code {
    private List<Code> codes;


    public Repeat(List<Code> codes) {
        this.codes = codes;
    }

    @Override
    public <T> T accept(firstVisitor<T> v) {
        return v.visit(this);
    }

    public List<Code> getCommands() {
        return codes;
    }
}
