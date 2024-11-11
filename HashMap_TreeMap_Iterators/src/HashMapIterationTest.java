import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class HashMapIterationTest {

    @Test
    void testHashMapModification() {
        // Create and populate the HashMap
        HashMap<String, Integer> inventory = new HashMap<>();
        inventory.put("Books", 12);
        inventory.put("Movies", 8);
        inventory.put("Music", 15);
        inventory.put("Games", 5);
        inventory.put("Gadgets", 3);

        // Using iterator over the entrySet()
        Iterator<Map.Entry<String, Integer>> iterator = inventory.entrySet().iterator();

        // Modifying values during iteration
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            if ("Movies".equals(entry.getKey())) {
                entry.setValue(entry.getValue() + 2); // Increase the "Movies" count by 2
            }
            if ("Gadgets".equals(entry.getKey())) {
                iterator.remove(); // Remove "Gadgets" from the map safely
            }
        }

        // Check the updated inventory
        assertEquals(10, inventory.get("Movies"), "Movies count should be 10 after increment");
        assertNull(inventory.get("Gadgets"), "Gadgets should be removed from the inventory");
        assertEquals(12, inventory.get("Books"), "Books count should remain 12");
        assertEquals(15, inventory.get("Music"), "Music count should remain 15");
        assertEquals(5, inventory.get("Games"), "Games count should remain 5");

        // Ensure that the size of the map is correct after removal
        assertEquals(4, inventory.size(), "Inventory should have 4 items after removing Gadgets");
    }
}
