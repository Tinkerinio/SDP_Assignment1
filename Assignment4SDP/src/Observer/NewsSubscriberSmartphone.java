package Observer;
//Observer implementation for smartphone users
public class NewsSubscriberSmartphone implements Observer {
    @Override
    public void update(String category, String message) {
        if(category.equals("Sports")) {
            System.out.println("Smartphone received: " + message);
        }
    }
}
