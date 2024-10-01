public class CoffeeShop {
    private static CoffeeShop instance;

    private CoffeeShop() {}
/** @getInstance function which creates one Coffee Shop*/
    public static CoffeeShop getInstance() {
        if (instance == null) {
            instance = new CoffeeShop();
        }
        return instance;
    }
/** @placeOrder gives a ready coffee for the user */
    public void placeOrder(CoffeeOrder order) {
        System.out.println("Order placed for: " + order.getCoffee().getName());
    }
}

