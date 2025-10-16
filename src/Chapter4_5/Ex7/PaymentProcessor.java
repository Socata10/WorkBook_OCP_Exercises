package Chapter4_5.Ex7;

public class PaymentProcessor {
    static void processPayment(IPayable paymentMethod, double amount) {
        paymentMethod.pay(amount);
    }
    static void processRefund(IRefundable refundMethod, double amount) {
        refundMethod.refund(amount);
    }
}
