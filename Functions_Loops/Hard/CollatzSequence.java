package Hard;

import java.util.Scanner;

public class CollatzSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type a positive number: ");
        int input = scanner.nextInt();

        if (input <= 0) {
            System.out.println("[ERROR] The number must be positive!");
            scanner.close();
            return;
        }

        System.out.println(input);

        while (input != 1) {
            if (input % 2 == 0) {
                input = input / 2;
            } else {
                input = input * 3 + 1;
            }
            System.out.println(input);
        }

        scanner.close();
    }
}
