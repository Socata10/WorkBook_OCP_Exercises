package Chapter4_5.Ex7;

public class Crypto implements IPayable, IRefundable{
    private String owner;
    private final String walletID;

    public Crypto(String owner, String walletID) {
        this.owner = owner;
        this.walletID = walletID;
    }

    @Override
    public void pay(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Amount must be > 0");
        System.out.println("Paid " + amount + " using Crypto.");
    }

    @Override
    public void refund(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Amount must be > 0");
        System.out.println("Refunded " + amount + " using Crypto.");
    }
}
