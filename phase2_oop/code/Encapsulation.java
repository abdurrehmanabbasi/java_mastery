/**
 * Demonstrates encapsulation with a bank Account class.
 */
public class Encapsulation {
    public static void main(String[] args) {
        Account acc = new Account("ACC-101", 2500.0);
        
        System.out.println("Account: " + acc.getAccountNumber());
        System.out.println("Initial Balance: " + acc.getBalance());
        
        acc.deposit(500.0);
        System.out.println("After deposit of 500: " + acc.getBalance());
        
        acc.withdraw(1000.0);
        System.out.println("After withdrawal of 1000: " + acc.getBalance());
        
        acc.withdraw(5000.0);  // Will show error
    }
}

/**
 * Represents a bank account with balance protection.
 */
class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Error: Initial balance cannot be negative");
            this.balance = 0;
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    /**
     * Deposit money into the account.
     * @param amount the amount to deposit (must be positive)
     */
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: " + amount);
        } else {
            System.out.println("Error: Deposit amount must be positive");
        }
    }

    /**
     * Withdraw money from the account.
     * @param amount the amount to withdraw (must be positive and <= balance)
     */
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Error: Withdrawal amount must be positive");
        } else if (amount > balance) {
            System.out.println("Error: Insufficient funds. Available balance: " + balance);
        } else {
            balance -= amount;
            System.out.println("Successfully withdrawn: " + amount);
        }
    }
}
