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

        // 03 - Library
        LibraryItem[] items = new LibraryItem[4];
        items[0] = new Book("UFO sightings and Ice cream", 1971, "Some crazy dude");
        items[1] = new Book("The true about the platypus cult", 1666, "Unknown");
        items[2] = new Magazine("How to walk backwards", 2006, 6);
        items[3] = new Magazine("Why you should not trust the government", 2001, 5453534);

        for (LibraryItem item : items){
            System.out.println(item.getDetails());
        }


    }
}
