package All;

import java.util.Scanner;

public class TemperatureAlert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the temperature in Celsius: ");
        double input = scanner.nextDouble();
        if (input > 30){
            System.out.println("It's too hot!");
        } else if (input < 15){
            System.out.println("It's too cold!");
        } else {
            System.out.println("Pleasant weather!");
        }
        scanner.close();

    }
}
