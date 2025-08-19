package Moderate;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of integers for the array, use duplicates: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " integers:");
        for(int i = 0; i < size; i++){
            System.out.print("Enter integer " + (i+1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        int[] uniqueNumbers = removeDuplicates(numbers);

        System.out.println("Original Array: " + Arrays.toString(numbers));
        System.out.println("Array Without Duplicates: " + Arrays.toString(uniqueNumbers));

        scanner.close();

    }
    public static int[] removeDuplicates(int[] array){
        Set<Integer> uniqueSet = new LinkedHashSet<>();
        for(int element : array){
            uniqueSet.add(element);
        }
        int[] uniqueArray = new int[uniqueSet.size()];
        int i = 0;
        for(int element : uniqueSet){
            uniqueArray[i++] = element;
        }
        return uniqueArray;
    }
}
