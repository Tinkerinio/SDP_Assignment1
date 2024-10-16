package Strategy;
//Strategy for delivery payments and adding additional payment for delivery
public class CashOnDeliveryStrategy implements PaymentStrategy {
    @Override
    public double calculateFinalAmount(double orderAmount) {
        return orderAmount + 300; //Adds 300 for delivery
    }
}
