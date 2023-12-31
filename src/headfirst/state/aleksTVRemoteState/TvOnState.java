package headfirst.state.aleksTVRemoteState;

public class TvOnState implements State {
    @Override
    public void doAction() {
        System.out.println("TV is turned ON!");
    }
}
