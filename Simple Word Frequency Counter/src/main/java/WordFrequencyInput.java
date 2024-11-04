import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class WordFrequencyInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> wordCountMap = new HashMap<>();
        int totalWordCount = 0; // Variable to keep track of total words

        System.out.println("Enter text (type 'count' to run):");

        // Continuously read user input until "count" is typed
        while (true) {
            String input = scanner.nextLine();

            // Exit the loop if "count" is typed
            if (input.equalsIgnoreCase("count")) {
                break;
            }

            // Split the input into words, remove punctuation, and count them
            String[] words = input.split("\\s+");
            for (String word : words) {
                // Remove common punctuation marks
                word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();

                // Increment word count in the HashMap
                if (!word.isEmpty()) {
                    wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                    totalWordCount++; // Increment the total word count
                }
            }
        }

        // Sort the HashMap by keys (words) using TreeMap
        TreeMap<String, Integer> sortedWordCountMap = new TreeMap<>(wordCountMap);

        // Output the word frequencies
        System.out.println("\nWord Frequencies:");
        for (Map.Entry<String, Integer> entry : sortedWordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Output the total word count
        System.out.println("\nTotal Word Count: " + totalWordCount);

        scanner.close();
    }
}
