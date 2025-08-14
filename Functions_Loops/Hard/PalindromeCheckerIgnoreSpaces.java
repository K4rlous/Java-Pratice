package Hard;

import java.util.Scanner;

public class PalindromeCheckerIgnoreSpaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type a word or phrase to see if it is a palindrome: ");
        String input = scanner.nextLine();
        String spacelessInput = input.replaceAll("\\s+", "");

        String reversed = new StringBuilder(spacelessInput).reverse().toString();


        if(spacelessInput.equalsIgnoreCase(reversed)){
            System.out.println("The word: " + input + ", is a palindrome!");
        } else {
            System.out.println("The word " + input + " is NOT a palindrome!");

        }
        scanner.close();




    }
}
