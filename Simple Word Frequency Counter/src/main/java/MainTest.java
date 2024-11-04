import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

public class MainTest {

    // Normal Cases
    @Test
    public void testProcessLine_RepeatedWords() {
        String line = "Hello world! Hello universe.";
        Map<String, Integer> wordMap = new HashMap<>();

        Main.processLine(line, wordMap);

        assertEquals(2, wordMap.get("hello"));
        assertEquals(1, wordMap.get("world"));
        assertEquals(1, wordMap.get("universe"));
    }

    @Test
    public void testProcessLine_MixedCaseWords() {
        String line = "HELLO Hello hello";
        Map<String, Integer> wordMap = new HashMap<>();

        Main.processLine(line, wordMap);

        assertEquals(3, wordMap.get("hello"));
        assertEquals(1, wordMap.size()); // Ensure only one entry for "hello" in lowercase
    }

    @Test
    public void testProcessLine_WithPunctuation() {
        String line = "Hello, world! Hello... world? World.";
        Map<String, Integer> wordMap = new HashMap<>();

        Main.processLine(line, wordMap);

        assertEquals(2, wordMap.get("hello"));
        assertEquals(3, wordMap.get("world"));
    }

    // Edge Cases
    @Test
    public void testProcessLine_EmptyString() {
        String line = "";
        Map<String, Integer> wordMap = new HashMap<>();

        Main.processLine(line, wordMap);

        assertTrue(wordMap.isEmpty()); // Word map should be empty for an empty line
    }

    @Test
    public void testProcessLine_OnlyPunctuation() {
        String line = "!@#$%^&*()";
        Map<String, Integer> wordMap = new HashMap<>();

        Main.processLine(line, wordMap);

        assertTrue(wordMap.isEmpty()); // No words should be counted
    }

    @Test
    public void testProcessLine_SingleLongWord() {
        String line = "Supercalifragilisticexpialidocious";
        Map<String, Integer> wordMap = new HashMap<>();

        Main.processLine(line, wordMap);

        assertEquals(1, wordMap.get("supercalifragilisticexpialidocious"));
        assertEquals(1, wordMap.size()); // Only one entry should be in the map
    }

    // Additional test for countWordsInFile with a predefined file
    @Test
    public void testCountWordsInFile() throws FileNotFoundException {
        File testFile = new File("./src/main/resources/testtext.txt"); // Ensure this test file exists with proper content

        Map<String, Integer> result = Main.countWordsInFile(testFile);

        assertEquals(2, result.get("hello"));
        assertEquals(1, result.get("world"));
        assertEquals(1, result.get("universe"));
    }
}
