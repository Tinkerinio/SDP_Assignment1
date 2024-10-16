package Strategy;
//Strategy for card payments and count commission for payments
public class CardPaymentStrategy implements PaymentStrategy {
    @Override
    public double calculateFinalAmount(double orderAmount) {
        return orderAmount * 1.02; // Adds 2% commission
    }
}
