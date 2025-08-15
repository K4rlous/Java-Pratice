package Easy;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of integers for the array: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        int sum = 0;

        System.out.println("Enter " + size + " integers:");
        for(int i = 0; i < size; i++){
            System.out.print("Enter integer " + (i+1) + ": ");
            numbers[i] = scanner.nextInt();
            sum+=numbers[i];
        }

        System.out.println(Arrays.toString(numbers));
        System.out.println("The sum of all integers in the array is: " + sum);
        scanner.close();
    }
}
