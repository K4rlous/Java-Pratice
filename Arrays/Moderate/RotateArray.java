package Moderate;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of integers for the array: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.print("How many rotations? ");
        int rotations = scanner.nextInt();
        rotations = rotations % size;

        int[] newNumbers = new int[size];


        for (int i = 0; i < size; i++) {
            newNumbers[i] = numbers[(i + size - rotations) % size];
        }

        System.out.println("Original Array: " + Arrays.toString(numbers));
        System.out.println("Rotated Array: " + Arrays.toString(newNumbers));
    }
}
