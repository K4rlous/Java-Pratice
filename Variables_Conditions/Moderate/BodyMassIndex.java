package Moderate;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What's your weight (KG): ");
        String input = scanner.nextLine();
        double weight = Double.parseDouble(input.replace(",", "."));

        System.out.println("What's your height (Meters): ");
        String input2 = scanner.nextLine();
        double height = Double.parseDouble(input2.replace(",", "."));

        if (height <= 0){
            System.out.println("Height must be greater than zero!");
        } else {

            double bodyMassIndex = weight / (height * height);
            System.out.println("Your body mass index is: " + bodyMassIndex);

            if(bodyMassIndex < 18.5){
                System.out.println("Underweight");
            } else if (bodyMassIndex < 25){
                System.out.println("Normal Weight");
            }   else if (bodyMassIndex < 30) {
                System.out.println("Overweight");
            } else {
                System.out.println("Obese");
            }
        }
        scanner.close();
    }
}
