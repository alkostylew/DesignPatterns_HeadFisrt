package headfirst.observer.aleksLatestNews;

public class Observer2 implements Observer {
    @Override
    public void receiveNew(String lastMinuteNew) {
        System.out.println("Message received in observer2: " + lastMinuteNew);
    }
}
