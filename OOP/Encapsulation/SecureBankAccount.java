package OOP.Encapsulation;

public class SecureBankAccount {
    private String accountNumber;
    private double balance;
    private String pin;
    private boolean isLocked;
    
    
    public SecureBankAccount(String accountNumber, double intialBalance, String pin){
        this.accountNumber = accountNumber;
        this.balance = intialBalance;
        this.pin = pin;
        this.isLocked = false;
    }
    
    public String getAccountNumber(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double amount){
        if (!isLocked){
            this.balance += amount;
        }
    }
    
    public String withdraw(double amount, String enteredPin){
        if (isLocked){
            return "Account is locked. Withdrawal not allowed.";
        } 
        if (!this.pin.equals(enteredPin)){
            return "Incorrect PIN.";
        }
        
        if (amount > this.balance){
            return "Insufficient balance for withdrawal.";
        }
        
        this.balance -= amount;
        return "Withdrawal successful. New balance: " + String.format("%.2f", this.balance);
    }
    
    public void lockAccount(){
        this.isLocked = true;
    }
    @Override
    public String toString(){
        return String.format("%s - P%.2f - %b" , accountNumber, balance , isLocked);
    }
    
}
