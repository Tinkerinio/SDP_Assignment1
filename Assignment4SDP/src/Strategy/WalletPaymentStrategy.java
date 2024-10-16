package Strategy;
//Strategy for wallet payments
public class WalletPaymentStrategy implements PaymentStrategy {
    @Override
    public double calculateFinalAmount(double orderAmount) {
        return orderAmount; //No commission
    }
}
