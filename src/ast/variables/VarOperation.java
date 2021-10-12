package ast.variables;

import ast.Code;
import ast.firstVisitor;

public class VarOperation extends Code {
  private Operation operation;
  private String name;
  private Exp expression;
  public VarOperation(String operation, String name, Exp expression) {
    switch (operation) {
      case "+":
        this.operation = Operation.ADD;
        break;
      case "-":
        this.operation = Operation.SUBTRACT;
        break;
      case "*":
        this.operation = Operation.MULTIPLY;
        break;
      default:
        throw new RuntimeException("Unexpected operation");
    }
    this.name = name;
    this.expression = expression;
  }

  @Override
  public <T> T accept(firstVisitor<T> v) {
    return v.visit(this);
  }

  public Operation getOperation() {
    return operation;
  }

  public void setOperation(Operation operation) {
    this.operation = operation;
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
  public enum Operation {
    ADD,
    SUBTRACT,
    MULTIPLY
  }
}
