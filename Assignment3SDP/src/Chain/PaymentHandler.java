package Chain;

public abstract class PaymentHandler {
    protected PaymentHandler nextHandler;
    protected int balance;

    public void setNextHandler(PaymentHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handlePayment(int amount) {
        if (balance >= amount) {
            System.out.println(this.getClass().getSimpleName() + " handled the payment of $" + amount);
        } else if (nextHandler != null) {
            System.out.println(this.getClass().getSimpleName() + " cannot handle payment of $" + amount + ", passing to " + nextHandler.getClass().getSimpleName());
            nextHandler.handlePayment(amount);
        } else {
            System.out.println("Payment of $" + amount + " could not be handled. Insufficient funds.");
        }
    }
}
