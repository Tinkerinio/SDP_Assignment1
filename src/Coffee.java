abstract class Coffee {
    /**@getName function to show the name of variables */
    public abstract String getName ();
}
class Espresso extends Coffee {
    public String getName () {
        return "Espresso";

    }
}
class Latte extends Coffee {
    public String getName() {
        return "Latte";
    }
}

class CoffeeFactory {
    /**@createCoffee function which receives the type of coffee and checks whether appropriate type of coffee or not */
    public Coffee createCoffee(String type) {
        switch (type.toLowerCase()) {
            case "espresso":
                return new Espresso();
            case "latte":
                return new Latte();
            default:
                throw new IllegalArgumentException("Unknown coffee type");
        }
    }
}