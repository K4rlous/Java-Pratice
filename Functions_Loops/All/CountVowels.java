package All;

import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type a word: ");
        String input = scanner.nextLine();

        System.out.println("The word: " + input + " has " + countVowels(input) + " vowels!");
        scanner.close();
    }

    public static int countVowels(String word){
        int counter = 0;
        for(char letter : word.toLowerCase().toCharArray()){
            switch (letter){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    counter++;
                    break;
            }
        }
        return counter;
    }
}
