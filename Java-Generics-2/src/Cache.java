import java.util.HashMap;
import java.util.Map;

public class Cache<T> {
    private Map<Integer, T> cache;
    private int currentKey;

    // Constructor to initialize the cache
    public Cache() {
        this.cache = new HashMap<>();
        this.currentKey = 0;  // Start keys from 0 or any other suitable value
    }

    // Add an item to the cache
    public void add(T item) {
        cache.put(currentKey++, item);
    }

    // Retrieve an item by key
    public T get(int key) {
        return cache.get(key);
    }

    // Clear all items from the cache
    public void clear() {
        cache.clear();
    }

    // Add all items from another cache of compatible type to this cache
    // Using a bounded wildcard to allow subtypes of T, such as Cache<Number> to Cache<Integer>
    public void addAll(Cache<Double> otherCache) {
        // Iterate over all items in the other cache and add them to this cache
        for (Map.Entry<Integer, Double> entry : otherCache.cache.entrySet()) {
            cache.put(currentKey++, (T) entry.getValue());  // Add to the current cache
        }
    }

    // Print the contents of the cache
    public void printCache() {
        if (cache.isEmpty()) {
            System.out.println("Cache is empty.");
        } else {
            System.out.println("Cache contents:");
            for (Map.Entry<Integer, T> entry : cache.entrySet()) {
                System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
            }
        }
    }
}
