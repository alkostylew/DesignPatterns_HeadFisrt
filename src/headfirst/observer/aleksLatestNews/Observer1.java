package headfirst.observer.aleksLatestNews;

public class Observer1 implements Observer {
    @Override
    public void receiveNew(String lastMinuteNew) {
        System.out.println("Message received in observer1: "+lastMinuteNew);
    }
}
