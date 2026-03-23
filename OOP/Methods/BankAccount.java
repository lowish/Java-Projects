package OOP.Methods;

// A class to represent a simple bank account
public class BankAccount {
    // Instance variables
    String accountHolderName;
    double balance;

    // Constructor to initialize the BankAccount object
    public BankAccount(String name, double initialBalance) {
        this.accountHolderName = name;
        this.balance = initialBalance;
    }

    
    public void displayBalance() {
        System.out.printf("%s's balance: $%.2f\n", accountHolderName, balance);
    }
    
    public void deposit(double amount) {
        if (amount > 0){
            balance += amount;
        }
    }

    
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
        balance -= amount;
        return true; // Placeholder
    } else {
        return false;
    }
    }
}