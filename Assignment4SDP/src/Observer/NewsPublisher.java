package Observer;
//Interface for managing subscribers
public interface NewsPublisher {
    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
    void notifySubscribers(String category, String message);
}
