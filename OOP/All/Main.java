package All;

public class Main {
    public static void main(String[] args) {

        // 01 - Person
        Person person1 = new Person("Ana", 20);
        Person person2 = new Person("Carlos", 24);

        person1.introduce();
        person2.introduce();

        // 02 - BankAccount
        BankAccount bank1 = new BankAccount("431213-3", 30);
        System.out.println(bank1);
        bank1.deposit(100);
        System.out.println(bank1);
        bank1.withdraw(120);
        System.out.println(bank1);

        // 03 - Rectangle
        Rectangle re1 = new Rectangle(10, 20);
        System.out.println(re1);
    }
}
