package visitor;

public class ProgramStartMessage extends ProgramMessageSystem {
    public void print() {
        System.out.println("Welcome to enrollment system");
    }
    @Override
    public void invite(Visitor visitor) {
        visitor.visit(this);
    }
}
