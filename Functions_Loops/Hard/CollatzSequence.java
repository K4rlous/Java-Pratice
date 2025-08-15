package Hard;

import java.util.Scanner;

public class CollatzSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type a positive number: ");
        int input = scanner.nextInt();
        collatzSequence(input);
        scanner.close();
    }
    public static void collatzSequence(int x){
        if (x <= 0) {
            System.out.println("[ERROR] The number must be positive!");
            return;
        }
        System.out.println(x);
        while (x != 1) {
            if (x % 2 == 0) {
                x = x / 2;
            } else {
                x = x * 3 + 1;
            }
            System.out.println(x);
        }
    }
}
