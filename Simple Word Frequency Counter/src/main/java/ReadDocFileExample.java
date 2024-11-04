import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.extractor.WordExtractor;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ReadDocFileExample {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("./src/main/resources/example.doc");
             HWPFDocument document = new HWPFDocument(fis);
             WordExtractor extractor = new WordExtractor(document)) {

            // Get all paragraphs in the document
            String[] paragraphs = extractor.getParagraphText();
            HashMap<String, Integer> wordCountMap = new HashMap<>();
            int totalWordCount = 0; // Initialize total word count

            // Process each paragraph to count words
            for (String paragraph : paragraphs) {
                // Normalize whitespace and split paragraph into words using regex
                String[] words = paragraph.trim().split("\\s+"); // Split by whitespace

                for (String word : words) {
                    // Remove punctuation, quotes, and convert to lowercase
                    word = word.replaceAll("[^a-zA-Z0-9'\\-]", "").toLowerCase(); // Allow hyphens and apostrophes

                    // Increment word count in the HashMap
                    if (!word.isEmpty()) {
                        wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                        totalWordCount++; // Increment total word count
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

            // Print the total word count
            System.out.println("\nTotal Word Count: " + totalWordCount);

        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
