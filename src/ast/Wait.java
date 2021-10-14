package ast;

import ast.variables.Exp;

public class Wait extends Command {
    private Exp expression;

    public Wait(Exp exp) {
        this.expression = exp;
    }
    @Override
    public <T> T accept(firstVisitor<T> v) {
        return v.visit(this);
    }

    public Exp getExpression() {
        return expression;
    }
}
