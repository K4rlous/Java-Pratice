package Hard;

import java.util.Arrays;
import java.util.Scanner;

public class FindPeakElement {
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

        int peak = numbers[0];

        for(int i = 0; i < size; i++){
            if(i == 0 && numbers[i] > numbers[i + 1]){
                peak = numbers[i];
                break;
            } else if (i == size - 1 && numbers[i] > numbers[i - 1]){
                peak = numbers[i];
                break;
            } else if (i > 0 && i < size - 1 && numbers[i] > numbers[i - 1] && numbers[i] > numbers[i + 1]) {
                peak = numbers[i];
                break;
            }
        }

        System.out.println("Original array: " + Arrays.toString(numbers));
        System.out.println("Peak was: " + peak);
        scanner.close();
    }
}
