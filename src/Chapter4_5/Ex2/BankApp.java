package Chapter4_5.Ex2;

public class BankApp {
    static void main() {
        BankAccount acc1 = new BankAccount("001", "Alice", 500);
        BankAccount acc2 = new BankAccount("002", "Bob", 1000);

        System.out.println("Initial accounts:");
        System.out.println(acc1);
        System.out.println(acc2);
        System.out.println();

        acc1.deposit(200);
        acc1.withdraw(100);
        acc2.withdraw(1200);   // insufficient
        acc2.deposit(-50);     // invalid
        acc2.setOwnerName("");     // invalid owner
        System.out.println();

        System.out.println("Final account states:");
        System.out.println(acc1);
        System.out.println(acc2);
    }
}

