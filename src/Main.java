public class Main {
    public static void main(String[] args) {
        // Singleton
        CoffeeShop shop = CoffeeShop.getInstance();

        // Factory Method
        CoffeeFactory coffeeFactory = new CoffeeFactory();
        Coffee latte = coffeeFactory.createCoffee("latte");

        // Abstract Factory
        IngredientFactory ingredientFactory = new CofIngredientFactory();

        // Builder
        CoffeeOrder order = new CofBuilder()
                .setType("latte")
                .setMilk(new AlmondMilk())
                .setSyrup(new CaramelSyrup())
                .build();

        // Singleton usage
        shop.placeOrder(order);

        // Prototype
        CoffeeOrder clonedOrder = order.clone();
        shop.placeOrder(clonedOrder);
    }
}