package Moderate;

public class Main {
    public static void main(String[] args) {

        // 01 - Shape
        Shape sh1 = new Circle(20);
        Shape sh2 = new Rectangle(20, 30);
        Shape sh3 = new Triangle(20, 20);

        System.out.println(sh1);
        System.out.println(sh2);
        System.out.println(sh3);

        // 02 - Employee
        Employee emp1 = new Developer("Tom", 2400, 8, 20);
        Employee emp2 = new Manager("John", 6000, 750);
        System.out.println(emp1);
        System.out.println(emp2);

    }
}
