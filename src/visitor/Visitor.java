package visitor;

public class Visitor {
    public void visit(ProgramStartMessage programStartMessage) {
        programStartMessage.print();
    }
}
