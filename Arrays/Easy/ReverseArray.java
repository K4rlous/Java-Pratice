package Easy;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of integers for the array: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " integers:");
        for(int i = 0; i < size; i++){
            System.out.print("Enter integer " + (i+1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Original Array: " + Arrays.toString(numbers));
        reverseArray(numbers);
        System.out.println("Reversed Array: " + Arrays.toString(numbers));
        scanner.close();

    }
        public static void reverseArray(int[] numbers){
            int start = 0;
            int end = numbers.length -1;
            while (start < end){
                int temp = numbers[start];
                numbers[start] = numbers[end];
                numbers[end] = temp;
                start++;
                end--;
            }
    }

}
