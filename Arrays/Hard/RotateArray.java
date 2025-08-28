package Hard;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of integers for the array: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " integers:");
        for(int i = 0; i < size; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.print("How many rotations: ");
        int k = scanner.nextInt();
        int[] rotated  = new int[numbers.length];

        System.out.println("Original array: " + Arrays.toString(numbers));

        for(int i = 0; i < numbers.length; i++){
            rotated[(i + k) % numbers.length] = numbers[i];
        }

        numbers = rotated;
        System.out.println("Rotated array: " + Arrays.toString(numbers));

        scanner.close();
    }
}
