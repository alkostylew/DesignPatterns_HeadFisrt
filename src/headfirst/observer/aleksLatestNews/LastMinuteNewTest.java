package headfirst.observer.aleksLatestNews;

public class LastMinuteNewTest {

    private static Observable observable = new ObservableImpl();

    public static void main(String[] args) {
        new Observer1(observable);

        observable.notifyObservers("Hoje vai nevar");

        Observer2 obs2 = new Observer2(observable);
        new Observer3(observable);

        observable.notifyObservers("Hoje fez 0 graus celsius.");
        observable.removeObserver(obs2);
        observable.notifyObservers("Os professores voltaram a dar aulas.");
    }
}
