package Hard;

public class CheckingAccount extends Account {
    private double overdraftLimit;

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public CheckingAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    void deposit(double amount) {
        if(amount > 0){
            balance+= amount;
            System.out.println("Deposited Successfully: $" + amount + ", Actual Balance: " + balance);
        } else {
            System.out.println("[ERROR] Type a valid amount to deposit!");
        }
    }

    @Override
    double getBalance() {
        return balance;
    }

    @Override
    void withdraw(double amount) throws InsufficientFundsException {
        double maxWithdraw = balance + overdraftLimit;
        if(amount > maxWithdraw){
            throw new InsufficientFundsException("[ERROR] The amount exceeds your overdraft limit!");
        } else {
            balance -= amount;
            System.out.println("Withdraw Successfully, Actual Balance: " + balance);
        }

    }
}
