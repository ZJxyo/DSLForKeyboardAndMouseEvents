package ast.variables;

import ast.Code;
import ast.firstVisitor;

public class VarPrint extends Code {
  private Exp print;

  public VarPrint(Exp print) {
    this.print = print;
  }

  public Exp getPrint() {
    return print;
  }

  @Override
  public <T> T accept(firstVisitor<T> v) {
    return v.visit(this);
  }
}
