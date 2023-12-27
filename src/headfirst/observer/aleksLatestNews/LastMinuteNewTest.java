package headfirst.observer.aleksLatestNews;

public class LastMinuteNewTest {

    private static Observable observable = new Observable();

    public static void main(String[] args) {
        observable.addAsObserver(new Observer1());

        observable.sendLatestNew("Hoje vai nevar");

        Observer2 observer2 = new Observer2();
        observable.addAsObserver(observer2);
        observable.addAsObserver(new Observer3());

        observable.sendLatestNew("Hoje fez 0 graus celsius.");

        observable.removeFromObserver(observer2);

        observable.sendLatestNew("Os professores voltaram a dar aulas.");
    }
}
