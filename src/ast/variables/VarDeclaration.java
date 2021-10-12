package ast.variables;

import ast.Code;
import ast.firstVisitor;

public class VarDeclaration extends Code {
  private String name;

  public VarDeclaration(String name) {
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
