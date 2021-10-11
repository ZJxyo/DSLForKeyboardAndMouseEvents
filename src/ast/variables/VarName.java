package ast.variables;

import ast.firstVisitor;

public class VarName extends Exp {
  private String name;

  public VarName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public <T> T accept(firstVisitor<T> v) {
    return v.visit(this);
  }
}
