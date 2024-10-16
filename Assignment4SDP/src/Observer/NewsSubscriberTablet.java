package Observer;
//Observer implementation for tablet users
public class NewsSubscriberTablet implements Observer {
    @Override
    public void update(String category, String message) {
        System.out.println("Tablet received: " + message);
    }
}
