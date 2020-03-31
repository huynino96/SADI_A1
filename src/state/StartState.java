package state;

public class StartState implements State {
    @Override
    public void next(ProgramState programState) {
        System.out.println("Program starting ...");
        programState.state = new StopState();
    }
}
