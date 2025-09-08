package Moderate;

import java.util.*;

public class App {
    public static void main(String[] args) {

        // 01 - Order name list
        ArrayList<String> names = new ArrayList<>();
        names.add("Franz");
        names.add("David");
        names.add("Berg");
        names.add("Carlos");
        names.add("Anna");
        names.add("Elias");
        Collections.sort(names);
        System.out.println(names);
        Collections.sort(names.reversed());
        System.out.println(names);

        // 02 - Tree set
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add((int) (Math.random() * 100));
        numbers.add((int) (Math.random() * 100));
        numbers.add((int) (Math.random() * 100));
        numbers.add((int) (Math.random() * 100));
        numbers.add((int) (Math.random() * 100));
        numbers.add((int) (Math.random() * 100));
        numbers.add((int) (Math.random() * 100));
        numbers.add((int) (Math.random() * 100));
        numbers.add((int) (Math.random() * 100));
        numbers.add((int) (Math.random() * 100));
        System.out.println(numbers);
        System.out.println("The lowest number: " + numbers.first());
        System.out.println("The biggest number: " + numbers.last());

        // 03 - Word counting with map
        ArrayList<String> words = new ArrayList<>();
        words.add("Pencil");
        words.add("Pencil");
        words.add("Fork");
        words.add("Whale");
        words.add("Whale");
        words.add("Whale");
        words.add("Whale");
        words.add("Mirror");
        words.add("Carpet");
        words.add("Basket");

        Map<String, Integer> wordCount = new HashMap<>();

        for(String word : words){
            // Increment the count for 'word' in the map:
            // getOrDefault returns the current count or 0 if the word is not yet in the map
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        System.out.println(wordCount);
    }
}
