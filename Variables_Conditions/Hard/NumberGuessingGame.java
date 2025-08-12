package Hard;

import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lives = 7;
        int tries = 0;
        int secretNumber = (int) (Math.random() * 100) + 1;

        System.out.println("Guess the secret number between 1 and 100, you have 7 lives!");

        do {
            System.out.println("Type a number: ");
            int input = scanner.nextInt();

            tries++;

            if (input != secretNumber) {
                lives--;
                System.out.println("Wrong number! You still have " + lives + " lives!");
                if (input > secretNumber) {
                    System.out.println("Try a smaller number!");
                } else {
                    System.out.println("Try a bigger number!");
                }
            } else {
                System.out.println("Congrats! You guessed the secret number! You did " + tries + " tries!");
                break;
            }
        } while (lives != 0);

        if (lives == 0) {
            System.out.println("You lost! The secret number was " + secretNumber);
        }

        scanner.close();
    }
}
