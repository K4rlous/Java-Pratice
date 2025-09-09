package Hard;

import java.util.*;

public class App {
    public static void main(String[] args) {

        // 01 - Order elements by frequency in descending order
        List<Integer> numbers = Arrays.asList(1, 2, 3, 1, 3, 5, 4);

        // Count frequency of each number
        Map<Integer, Integer> numberCount = new HashMap<>();
        for (Integer number : numbers) {
            numberCount.put(number, numberCount.getOrDefault(number, 0) + 1);
        }

        // Transform map into list of pairs (number -> frequency)
        List<Map.Entry<Integer, Integer>> numberEntryList = new ArrayList<>(numberCount.entrySet());

        // Sort list by frequency in descending order
        numberEntryList.sort(Map.Entry.<Integer, Integer>comparingByValue().reversed());

        // Collect only numbers, ordered by frequency
        List<Integer> numbersByFrequency = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : numberEntryList) {
            numbersByFrequency.add(entry.getKey());
        }
        System.out.println("Numbers ordered by frequency: " + numbersByFrequency);


        // 02 - Find most frequent words in a text
        String text = "Technology drives innovation, and innovation shapes the future. The future belongs to those who embrace technology and challenge the status quo.";
        text = text.replaceAll("[^a-zA-Z\\s]", ""); // Remove punctuation
        String[] words = text.toLowerCase().split("\\s+");

        // Count frequency of each word
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // Transform map into list of pairs (word -> frequency)
        List<Map.Entry<String, Integer>> wordEntryList = new ArrayList<>(wordCount.entrySet());

        // Sort list by frequency in descending order
        wordEntryList.sort(Map.Entry.<String, Integer>comparingByValue().reversed());

        // Collect only words, ordered by frequency
        List<String> wordsByFrequency = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : wordEntryList) {
            wordsByFrequency.add(entry.getKey());
        }
        System.out.println("Words ordered by frequency: " + wordsByFrequency);

        // 03 - First Non-Repeating Character
        String word = "Swiss";
        word = word.toLowerCase();

        LinkedHashMap<Character, Integer> charCount  = new LinkedHashMap<>();
        for(char c : word.toCharArray()){
            charCount.put(c, charCount.getOrDefault(c, 0 ) + 1);
        }

        for(Map.Entry<Character, Integer> charEntry : charCount.entrySet()){
            if(charEntry.getValue() == 1){
                System.out.println("First non-repeating character: " + charEntry.getKey());
                break;
            }
        }
    }
}
