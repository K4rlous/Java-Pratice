package Hard;

import java.util.Scanner;

public class PasswordStrengthChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int strenthValue = 0;

        System.out.print("Type your password for strength validation: ");
        String input = scanner.nextLine();

        if (input.length() > 8){
            strenthValue++;
        }
        if (input.contains())
    }
}
