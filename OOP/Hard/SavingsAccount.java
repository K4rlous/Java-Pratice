package Hard;

public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
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

    public void applyInterest(){
        balance += balance * interestRate;
        System.out.println("The interest rate of " + interestRate + " has been applied to your balance, Actual balance: " + balance);
    }
}
