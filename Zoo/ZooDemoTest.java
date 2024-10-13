import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ZooDemoTest {

    private ByteArrayOutputStream outputStream;
    private PrintStream originalOut;
    private Lion lion;
    private Elephant elephant;
    private Monkey monkey;

    @BeforeEach
    void setUp() {
        outputStream = new ByteArrayOutputStream();
        PrintStream testOut = new PrintStream(outputStream);
        originalOut = System.out;
        System.setOut(testOut);

        lion = new Lion("Simba");
        elephant = new Elephant("Dumbo");
        monkey = new Monkey("George");
    }

    @Test
    void testSingleSoundLion() {
        lion.makeSound();
        assertEquals("Roar", outputStream.toString().trim());
    }

    @Test
    void testMultipleSoundsElephant() {
        elephant.makeSound(2);
        assertEquals("Trumpet Trumpet", outputStream.toString().trim());
    }

    @Test
    void testMultipleSoundsMonkey() {
        monkey.makeSound(4);
        assertEquals("Ooh Ooh Ah Ah Ooh Ooh Ah Ah Ooh Ooh Ah Ah Ooh Ooh Ah Ah", outputStream.toString().trim());
    }

    @Test
    void testZeroTimesSound() {
        lion.makeSound(0);
        assertEquals("", outputStream.toString().trim());
    }

    @Test
    void testNegativeTimesSound() {
        elephant.makeSound(-1);
        assertEquals("", outputStream.toString().trim());
    }

    @Test
    void testLargeNumberOfRepetitions() {
        monkey.makeSound(1000);
        String expectedOutput = " Ooh Ooh Ah Ah".repeat(1000).trim();
        assertEquals(expectedOutput, outputStream.toString().trim());
    }

    @AfterEach
    void tearDown() {
        System.setOut(originalOut);
    }
}
