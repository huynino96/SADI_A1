package state;

public class ProgramState {
    State state = new StartState();
    public void next() {
        state.next(this);
    }
}
