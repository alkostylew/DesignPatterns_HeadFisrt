package headfirst.observer.aleksLatestNews;

public class Observer3 implements Observer {

    private Observable observable;

    public Observer3(Observable observable) {
        this.observable = observable;
        this.observable.addObserver(this);
    }

    @Override
    public void getNotification(String lastMinuteNew) {
        System.out.println("Message received in observer3: " + lastMinuteNew);
    }
}
