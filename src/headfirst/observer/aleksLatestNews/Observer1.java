package headfirst.observer.aleksLatestNews;

public class Observer1 implements Observer {

    private Observable observable;

    public Observer1(Observable observable) {
        this.observable = observable;
        this.observable.addObserver(this);
    }

    @Override
    public void getNotification(String lastMinuteNew) {
        System.out.println("Message received in observer1: "+lastMinuteNew);
    }
}
