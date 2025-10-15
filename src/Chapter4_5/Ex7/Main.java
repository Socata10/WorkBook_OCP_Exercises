package Chapter4_5.Ex7;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main() {
        List<IPayable> payables = new ArrayList<IPayable>();
        payables.add(new CreditCard("Alice", "1234"));
        payables.add(new PayPal("Bob", "bob@example.com"));
        payables.add(new Crypto("Carol", "0xABCDEF"));

        for (IPayable payable : payables) {
            if (payable instanceof IRefundable) {
                PaymentProcessor.processRefund((IRefundable) payable, 50.0);
            }
            PaymentProcessor.processPayment(payable, 100.0);
        }


    }
}
