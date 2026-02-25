

class Bank {
    private String accountNumber;
    private double balance;
    public Bank(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }
}

public class BankAccount {
    public static void main(String[] args) {
        Bank acc = new Bank("12345", 1000);

        System.out.println("Account Number: " + acc.getAccountNumber());
        System.out.println("Initial Balance: " + acc.getBalance());

        acc.deposit(500);
        System.out.println("Balance after deposit: " + acc.getBalance());

        acc.withdraw(300);
        System.out.println("Balance after withdrawal: " + acc.getBalance());
    }
}
