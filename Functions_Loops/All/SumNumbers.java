    package All;

    import java.util.Scanner;

    public class SumNumbers {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Type a number: ");
            int input = scanner.nextInt();

            System.out.println("Sum result: " + sumInt(input));

            scanner.close();

        }
        public static int sumInt(int a){
            int sum = 0;
            if(a < 1){
                return 0;
            }
            while (a != 0){
                   sum+= a;
                   a--;
            }
            return sum;
        }

    }
