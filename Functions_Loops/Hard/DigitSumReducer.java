package Hard;

import java.util.Scanner;

public class DigitSumReducer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type a big int: ");
        int input = scanner.nextInt();
        digitSumReducer(input);
        scanner.close();
    }
    public static void digitSumReducer(int x){
        while (x >= 10) {
            int sum = 0;
            String inputStr = String.valueOf(x);
            for (int i = 0; i < inputStr.length(); i++) {
                sum += Character.getNumericValue(inputStr.charAt(i));
            }
            x = sum;
        }
        System.out.println(x);
    }
}
