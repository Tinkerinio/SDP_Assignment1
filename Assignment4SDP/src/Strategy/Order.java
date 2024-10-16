package Strategy;
//Context class for orders
public class Order {
    private double amount;
    private PaymentStrategy paymentStrategy;
    public Order(double amount) {
        this.amount= amount;
    }
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
    public double calculateFinalAmount() {
        if (paymentStrategy == null) {
            throw new IllegalStateException("Payment strategy not set");
        }
        return paymentStrategy.calculateFinalAmount(amount);
    }
}
