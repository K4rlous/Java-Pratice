package Easy;

import java.util.Scanner;

public class CheckEvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a number: ");
        int input = scanner.nextInt();
        if (input % 2 == 0){
            System.out.println("It's Even");
        } else {
            System.out.println("It's Odd");
        }
        scanner.close();
    }
}
