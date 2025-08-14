package Hard;

import java.util.Scanner;

public class DigitSumReducer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type a big int: ");
        int input = scanner.nextInt();

        while (input >= 10) {
            int sum = 0;
            String inputStr = String.valueOf(input);
            for (int i = 0; i < inputStr.length(); i++) {
                sum += Character.getNumericValue(inputStr.charAt(i));
            }
            input = sum;
        }

        System.out.println(input);

        scanner.close();
    }
}
