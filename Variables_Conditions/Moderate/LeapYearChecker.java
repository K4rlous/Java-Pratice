package Moderate;

import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        boolean isLeap = false;

        Scanner scanner = new Scanner(System.in);


        System.out.print("Type a year: ");
        int year = scanner.nextInt();

        if((year % 4 == 0 && (year % 100) != 0) || (year % 400 == 0)){
            isLeap = true;
        }

        if(isLeap){
            System.out.println("The year " + year + " is Leap!");
        } else {
            System.out.println("The year " + year + " is NOT Leap!");
        }
        scanner.close();
    }

}
