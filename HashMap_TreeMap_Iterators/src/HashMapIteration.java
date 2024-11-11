import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapIteration {
    public static void main(String[] args) {
        // Create and populate the HashMap
        HashMap<String, Integer> inventory = new HashMap<>();
        inventory.put("Books", 12);
        inventory.put("Movies", 8);
        inventory.put("Music", 15);
        inventory.put("Games", 5);
        inventory.put("Gadgets", 3);

        // Using iterator over the entrySet()
        Iterator<Map.Entry<String, Integer>> iterator = inventory.entrySet().iterator();

        System.out.println("Original Inventory:");
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Modifying values during iteration
        iterator = inventory.entrySet().iterator(); // Reset the iterator
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            if ("Movies".equals(entry.getKey())) {
                entry.setValue(entry.getValue() + 2); // Increase the "Movies" count by 2
            }
            if ("Gadgets".equals(entry.getKey())) {
                iterator.remove(); // Remove "Gadgets" from the map safely
            }
        }

        System.out.println("\nUpdated Inventory:");
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
