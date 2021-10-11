package ast.variables;

import ast.Code;
import ast.firstVisitor;

public class VarAssignment extends Code {
  private String name;
  private Exp expression;

  public VarAssignment(String name, Exp exp) {
    this.name = name;
    this.expression = exp;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Exp getExpression() {
    return expression;
  }

  public void setExpression(Exp expression) {
    this.expression = expression;
  }

  @Override
  public <T> T accept(firstVisitor<T> v) {
    return v.visit(this);
  }
}
