package Chapter4_5.Ex2;

public class BankAccount {
    private String accountNumber;
    private String ownerName;
    private double balance;

    public BankAccount(String accountNumber, String ownerName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = initialBalance;
    }

    public BankAccount() {}

    public String getAccountNumber() {
        return accountNumber;
    }
    public String getOwnerName() {
        return ownerName;
    }
    public double getBalance() {
        return balance;
    }
    public void setAccountNumber(String accountNumber) {
        if (accountNumber == null || accountNumber.trim().isEmpty() || !accountNumber.matches("\\d+")) {
            System.out.println("Account number must be a number.");
        }
        this.accountNumber = accountNumber;
    }
    public void setOwnerName(String ownerName) {
        if (ownerName == null || ownerName.trim().isEmpty()) {
            System.out.println("Owner name cannot be null or empty.");
        }
        this.ownerName = ownerName;
    }
    public void setBalance(double balance) {
        if (balance < 0) {
            System.out.println("Balance cannot be negative.");
        }
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("Deposited %.2f. New balance: %.2f%n", amount, balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else if (amount > balance) {
            System.out.println("Insufficient funds!");
        } else {
            balance -= amount;
            System.out.printf("Withdrew %.2f. Remaining balance: %.2f%n", amount, balance);
        }
    }

    @Override
    public String toString() {
        return String.format("Account Number: %s, Owner: %s, Balance: %.2f", accountNumber, ownerName, balance);
    }
}

