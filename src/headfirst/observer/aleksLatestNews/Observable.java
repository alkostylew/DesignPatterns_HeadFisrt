package headfirst.observer.aleksLatestNews;

import java.util.ArrayList;
import java.util.List;

public class Observable {
    private List<Observer> observers = new ArrayList<>();

    public void addAsObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeFromObserver(Observer observer) {
        observers.remove(observer);
    }

    public void sendLatestNew(String lastMinuteNew) {
        observers.forEach(observer -> observer.receiveNew(lastMinuteNew));
    }
}
