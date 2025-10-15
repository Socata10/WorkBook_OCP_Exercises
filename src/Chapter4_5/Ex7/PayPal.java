package Chapter4_5.Ex7;

public class PayPal implements IPayable, IRefundable {
    private final String owner;
    private String email;

    public PayPal(String owner, String email) {
        this.owner = owner;
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Amount must be > 0");
        System.out.println("Paid " + amount + " using Paypal.");
    }
    @Override
    public void refund(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Amount must be > 0");
        System.out.println("Refunded " + amount + " using Paypal.");
    }
}
