class CoffeeOrder implements Cloneable {
    private Coffee coffee;
    private Milk milk;
    private Syrup syrup;
    private IngredientFactory ingredients;
/** @CoffeeOrder function which collect all data about user`s order */
    public CoffeeOrder(Coffee coffee, Milk milk, Syrup syrup) {
        this.coffee = coffee;
        this.milk = milk;
        this.syrup = syrup;
    }
/** @getCoffee function to add the coffee after choosing it */
    public Coffee getCoffee() {
        return coffee;
    }
    /** @getCoffee function to add the coffee after choosing it */
    public Milk getMilk() {
        return milk;
    }
    /** @getCoffee function to add the coffee after choosing it */
    public Syrup getSyrup() {
        return syrup;
    }

    /** @clone this function creating a clone of previous order*/
    public CoffeeOrder clone() {
        try {
            return (CoffeeOrder) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}