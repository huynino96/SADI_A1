package state;

public class StopState implements State {
    @Override
    public void next(ProgramState programState) {
        System.out.println("Stopping program ...");
        programState.state = new StartState();
    }
}
