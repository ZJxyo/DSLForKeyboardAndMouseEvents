package ast;

public class Wait extends Command {
    private Integer time;

    public Wait(String time) {
        this.time = Integer.parseInt(time);
    }
    @Override
    public <T> T accept(firstVisitor<T> v) {
        return v.visit(this);
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }
}
