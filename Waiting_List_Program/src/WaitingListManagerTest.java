import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class WaitingListManagerTest {

    private WaitingListManager manager;

    @BeforeEach
    void setUp() {
        manager = new WaitingListManager();
    }

    @Test
    void testAddPerson() {
        // Add a person to the waiting list
        manager.addPerson("Alice");
        assertTrue(manager.isPersonInList("Alice"));

        // Try adding the same person again
        manager.addPerson("Alice");
        assertEquals(1, manager.waitingListSize());
    }

    @Test
    void testServePerson() {
        // Serve from an empty list
        assertEquals("The waiting list is empty", manager.servePerson());

        // Add and serve a person
        manager.addPerson("Bob");
        assertEquals("Bob has been served.", manager.servePerson());

        // Ensure the list is empty after serving
        assertEquals(0, manager.waitingListSize());
    }

    @Test
    void testIsPersonInList() {
        // Add a person to the list and check
        manager.addPerson("Charlie");
        assertTrue(manager.isPersonInList("Charlie"));

        // Check for a person not in the list
        assertFalse(manager.isPersonInList("Diana"));
    }

    @Test
    void testWaitingListSize() {
        // Empty list
        assertEquals(0, manager.waitingListSize());

        // Add multiple people
        manager.addPerson("Eve");
        manager.addPerson("Frank");
        assertEquals(2, manager.waitingListSize());
    }

    @Test
    void testDisplayEmptyWaitingList() {
        // Capture console output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out; // Save original System.out
        System.setOut(new PrintStream(outContent));

        try {
            // Test with an empty list
            manager.displayWaitingList();
            assertEquals("Waiting list is empty.", outContent.toString().trim());  // No extra newlines expected here
        } finally {
            // Restore original System.out
            System.setOut(originalOut);
        }
    }

    @Test
    void testDisplayWaitingListWithPeople() {
        // Capture console output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out; // Save original System.out
        System.setOut(new PrintStream(outContent));

        try {
            // Test with people in the list
            manager.addPerson("Grace");
            manager.addPerson("Helen");
            manager.displayWaitingList();

            // Normalize line endings and trim any extra spaces
            String actualOutput = outContent.toString().replace("\r\n", "\n").trim();
            String expectedOutput = "Grace has been added to the waiting list.\n" +
                    "Helen has been added to the waiting list.\n" +
                    "Waiting List: Grace, Helen";

            // Normalize line endings and trim any extra spaces in expected output
            expectedOutput = expectedOutput.replace("\r\n", "\n").trim();

            // Perform the comparison
            assertEquals(expectedOutput, actualOutput);
        } finally {
            // Restore original System.out
            System.setOut(originalOut);
        }
    }

}