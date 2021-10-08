package ast;

public class Write extends Command {
    private String inputString;

    public Write(String inputString) {
        this.inputString = inputString;
    }

    public String getInputString() {
        return inputString;
    }

    public void setInputString(String inputString) {
        this.inputString = inputString;
    }

    @Override
    public <T> T accept(firstVisitor<T> v) {
        return v.visit(this);
    }
}
