package Chapter4_5.Ex7;

public class CreditCard implements IPayable, IRefundable {
    private final String owner;
    private String lastNumberCard;

    public CreditCard(String owner, String lastNumberCard) {
        this.owner = owner;
        this.lastNumberCard = lastNumberCard;
    }

    @Override
    public void refund(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Amount must be > 0");
        System.out.println("Refunded " + amount + " using Credit Card.");
    }

    @Override
    public void pay(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Amount must be > 0");
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}

