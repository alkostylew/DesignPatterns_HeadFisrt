package headfirst.state.aleksTVRemoteState;

public class TvRemoteTest {
    public static void main(String[] args) {
        TvContext tvContext = new TvContext();

        tvContext.setTvState(new TvOnState());
        tvContext.doAction();

        tvContext.setTvState(new TvOffState());
        tvContext.doAction();
    }
}
