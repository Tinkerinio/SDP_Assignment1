class CofBuilder {
    private String type;
    private Milk milk;
    private Syrup syrup;

    /**@setType function to collect data about type of coffee */
    public CofBuilder setType(String type) {
        this.type = type;
        return this;
    }
/**@setMilk function to collect data about milk type */
    public CofBuilder setMilk(Milk milk) {
        this.milk = milk;
        return this;
    }
    /**@setSyrup function to collect data about syrup flavor */
    public CofBuilder setSyrup(Syrup syrup) {
        this.syrup = syrup;
        return this;
    }
/** @build function to make a coffee by using collected data */
    public CoffeeOrder build() {
        CoffeeFactory factory = new CoffeeFactory();
        Coffee coffee = factory.createCoffee(type);
        return new CoffeeOrder(coffee, milk, syrup);
    }
}