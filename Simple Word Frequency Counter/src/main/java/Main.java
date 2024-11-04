import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        try {
            File file = new File("./src/main/resources/mytext.txt");
            Map<String, Integer> wordMap = countWordsInFile(file);

            System.out.println("\nWord Frequencies: \n");
            for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

        } catch (FileNotFoundException e) {
            System.out.println("Couldn't find the file.");
        }
    }

    public static Map<String, Integer> countWordsInFile(File file) throws FileNotFoundException   {
        HashMap<String, Integer> hashword = new HashMap<>();

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                processLine(line, hashword);
            }
        }

        return new TreeMap<>(hashword);
    }

    public static void processLine(String line, Map<String, Integer> wordMap) {
        String[] words = line.split("[.!\\s]+");

        for (String word : words) {
            word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();
            if (!word.isEmpty()) {
                wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
            }
        }
    }




}
