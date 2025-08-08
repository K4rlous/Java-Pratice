package Moderate;

import java.util.Scanner;

public class GradeEvaluator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type your grade: ");
        int input = scanner.nextInt();

        if (input < 0 || input > 100) {
            System.out.println("ERROR - The grade must be between 0 and 100!");
        } else {
            if (input >= 90) {
                System.out.println("Excellent");
            } else if (input >= 70) {
                System.out.println("Good");
            } else if (input >= 50) {
                System.out.println("Pass");
            } else {
                System.out.println("Fail");
            }
        }

        scanner.close();
    }
}
