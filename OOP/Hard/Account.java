package Hard;

public abstract class Account {
    protected String accountNumber;
    protected double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    abstract void deposit(double amount);
    void withdraw(double amount){
        if(amount > balance){
            throw new InsufficientFundsException("Insufficient Funds");
        } else {
            balance -= amount;
            System.out.println("Withdraw Successfully, Actual Balance: " + balance);
        }
    }
    abstract double getBalance();
}
