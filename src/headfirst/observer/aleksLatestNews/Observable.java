package headfirst.observer.aleksLatestNews;

public interface Observable {
    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers(String lastMinuteNew);
}
