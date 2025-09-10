package All;

import java.util.Scanner;

public class SimplePasswordCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String passWord = "secret8811";

        System.out.println("What's the password: ");
        String input = scanner.nextLine();

        if(input.equals(passWord)){
            System.out.println("Correct Password! Welcome...");
        } else {
            System.out.println("Incorrect Password!!!");
        }
        scanner.close();
    }
}
