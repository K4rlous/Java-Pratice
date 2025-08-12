package Hard;

import java.util.Scanner;

public class ShippingCostCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Shipping Cost Calculator!");

        System.out.print("What's the package weight? (in KGs): ");
        double weight = scanner.nextDouble();
        if(weight < 0 || weight == 0){
            System.out.println("ERROR: The package weight cannot be zero!");
            return;
        }

        System.out.print("Type the distance (In Kms): ");
        double distance = scanner.nextDouble();

        double shippingCost = 0;

        if (weight < 5){
            shippingCost = 10 + distance * 2;
        } else if (weight < 20){
            shippingCost= 20 + distance * 1.5;
        } else {
            shippingCost= 50 + distance * 1;
        }

        if(distance > 500){
            shippingCost-= shippingCost * 0.1;
        }

        System.out.println("The shipping cost of your package is: $" + shippingCost);

        scanner.close();

    }
}
