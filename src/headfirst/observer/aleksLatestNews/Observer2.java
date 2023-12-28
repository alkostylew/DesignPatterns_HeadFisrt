package headfirst.observer.aleksLatestNews;

public class Observer2 implements Observer {

    Observable observable;

    public Observer2(Observable observable) {
        this.observable = observable;
        this.observable.addObserver(this);
    }

    @Override
    public void getNotification(String lastMinuteNew) {
        System.out.println("Message received in observer2: " + lastMinuteNew);
    }
}
