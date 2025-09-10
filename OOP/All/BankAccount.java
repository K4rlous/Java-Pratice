package All;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        if (amount > 0){
            balance+= amount;
            System.out.println("Successfully deposited $" + amount + "! Current balance " + getBalance());
        } else {
            System.out.println("[ERROR] Use a valid amount!");
        }
    }

    public void withdraw(double amount){
        if (balance < amount){
            System.out.println("[ERROR] Can't withdraw this amount, Current balance: " + getBalance());
        } else {
            balance-= amount;
            System.out.println("Successfully withdrawn $" + amount + "! Current balance: " + getBalance());
        }
    }

    @Override
    public String toString(){
        return "Account number: " + getAccountNumber() + ", Balance: " + getBalance();
    }
}
