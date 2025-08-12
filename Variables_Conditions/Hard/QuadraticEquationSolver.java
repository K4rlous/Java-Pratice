package Hard;

import java.util.Scanner;

public class QuadraticEquationSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type the value of A: ");
        double a = scanner.nextDouble();
        if(a == 0){
            System.out.println("A cannot be zero in a quadratic equation!");
            System.exit(0);
        }
        System.out.println("Type the value of B: ");
        double b = scanner.nextDouble();
        System.out.println("Type the value of C: ");
        double c = scanner.nextDouble();

        double delta = (b * b) - (4 * a * c);

        System.out.println("Delta is: " + delta);
        if(delta < 0){
            System.out.println("There are no real roots.");
        } else if (delta == 0){
            double root = -b / (2 * a);
            System.out.println("One real root: " + root);
       } else {
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Two real roots: " + root1 + " and " + root2);
        }

        scanner.close();
    }

}
