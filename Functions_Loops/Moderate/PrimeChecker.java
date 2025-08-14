package Moderate;

import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type a number to check if it's prime: ");
        int input = scanner.nextInt();

        System.out.println("Is the number: " + input + " prime? Result: " + primeChecker(input));

        scanner.close();
    }

    public static boolean primeChecker(int x){
        if (x <= 1){
            return false;
        }
        for(int i = 2; i < x; i++){
            if(x % i == 0){
                return false;
            }
        }
        return true;
    }

}
