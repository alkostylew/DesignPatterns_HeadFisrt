package headfirst.state.aleksTVRemoteState;

public class TvOffState implements State {
    @Override
    public void doAction() {
        System.out.println("TV is turned Off!");
    }
}
