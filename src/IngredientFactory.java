interface IngredientFactory {
    Milk createMilk();
    Syrup createSyrup();
}

class CofIngredientFactory implements IngredientFactory {
    public Milk createMilk() {
        return new RegularMilk();
    }
    public Syrup createSyrup() {
        return new VanillaSyrup();
    }
}

interface Milk {}
class RegularMilk implements Milk {}
class CoconutMilk implements Milk {}
class AlmondMilk implements Milk {}

interface Syrup {}
class VanillaSyrup implements Syrup {}
class ChocolateSyrup implements Syrup {}
class CaramelSyrup implements Syrup {}