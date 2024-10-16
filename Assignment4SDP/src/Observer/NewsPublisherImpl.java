package Observer;

import java.util.ArrayList;
import java.util.List;
//Concrete Implementation of NewsPublisher
public class NewsPublisherImpl implements NewsPublisher {
    private List<Observer> subscribers;

    public NewsPublisherImpl() {
        subscribers = new ArrayList<>();
    }

    @Override
    public void subscribe(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifySubscribers(String category, String message) {
        for (Observer subscriber : subscribers) {
            subscriber.update(category, message);
        }
    }

    public void publishNews(String category, String message) {
        System.out.println("Publishing news in category: " + category);
        notifySubscribers(category, message);
    }
}
