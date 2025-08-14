package Moderate;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type a string to see it reversed: ");
        String input = scanner.nextLine();

        System.out.println("Reversed string: " + reverseString(input));

        scanner.close();

    }

    public static String reverseString(String x){
        StringBuilder str = new StringBuilder(x);
        str.reverse();
        return str.toString();
    }
}
