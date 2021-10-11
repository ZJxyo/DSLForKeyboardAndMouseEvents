package ast.variables;

import ast.firstVisitor;

public class Number extends Exp {
  private Integer num;

  public Number(int value) {
    this.num = value;
  }

  public int getNum() {
    return num;
  }

  @Override
  public <T> T accept(firstVisitor<T> v) {
    return v.visit(this);
  }
}
