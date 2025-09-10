package All;

import java.util.Scanner;

public class FindMaxInArray {
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
        int max = numbers[0];
        for(int i = 1; i <numbers.length; i++){
            if (numbers[i] > max){
                max = numbers[i];
            }
        }
        System.out.println("The largest number in the array is: " + max);
        scanner.close();
    }
}
