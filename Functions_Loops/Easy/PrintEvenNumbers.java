package Easy;

import java.util.Scanner;

public class PrintEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type a number: ");
        int input = scanner.nextInt();

        printEven(input);
        scanner.close();
    }

    public static void printEven(int a){
        int counter = 0;
        while(counter < a){
            if(counter % 2 == 0){
                System.out.println(counter + " is Even!");
            }
            counter++;
        }
    }
}
