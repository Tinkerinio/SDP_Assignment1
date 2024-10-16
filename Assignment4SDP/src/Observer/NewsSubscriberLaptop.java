package Observer;
//Observer implementation for laptop users
public class NewsSubscriberLaptop implements Observer {
    @Override
    public void update(String category, String message) {
        if(category.equals("Science")) {
            System.out.println("Laptop received: " + message);
        }
    }
}
