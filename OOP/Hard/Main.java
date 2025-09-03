package Hard;

public class Main {
    public static void main(String[] args) {

        // 01 - Banking System
        Account acc1 = new SavingsAccount("21412-2", 300, 0.05);
        Account acc2 = new CheckingAccount("32423-3", 420, 200);

        acc1.deposit(50);
        acc2.deposit(50);

        acc1.withdraw(300);
        acc2.withdraw(300);

        ((SavingsAccount) acc1).applyInterest();

        System.out.println(acc1.getBalance());
        System.out.println(acc2.getBalance());

        // 02 -

    }
}
