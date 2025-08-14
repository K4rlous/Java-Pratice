package Moderate;

import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many numbers of the sequence you wanna see? : ");
        int input = scanner.nextInt();

        fibonacci(input);
        scanner.close();
    }

    public static void fibonacci(int x){
        int first = 0;
        int second = 1;
        int counter = 0;
        while (counter < x) {
            System.out.println(first + " ");
            int next = first+second;
            first = second;
            second = next;
            counter++;
        }
    }
}
