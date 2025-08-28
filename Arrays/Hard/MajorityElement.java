package Hard;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MajorityElement {
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
        System.out.println(Arrays.toString(numbers));
        System.out.println("The majority element in the array is: " + findMajority(numbers));
        scanner.close();
    }
    public static int findMajority(int[] numbers){
        Map<Integer, Integer> counts = new HashMap<>();
        int n = numbers.length;

        for(int num: numbers){
            counts.put(num, counts.getOrDefault(num, 0 ) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            if (entry.getValue() > n / 2){
                return entry.getKey();
            }
        }
        return -1;
    }
}
