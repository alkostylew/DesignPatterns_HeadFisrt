package headfirst.observer.aleksLatestNews;

public class Observer3 implements Observer {
    @Override
    public void receiveNew(String lastMinuteNew) {
        System.out.println("Message received in observer3: " + lastMinuteNew);
    }
}
