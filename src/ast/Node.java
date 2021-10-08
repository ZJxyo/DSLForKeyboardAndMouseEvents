package ast;

public abstract class Node {
    abstract public <T> T accept(firstVisitor<T> v); // so that we remember to define this in all subclasses
}
