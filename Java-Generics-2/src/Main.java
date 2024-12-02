import java.util.*;

public class Main {
    // Method to print each item in the collection
    public static void printCollection(Collection<?> collection) {
        for (Object item : collection) {
            System.out.println(item);
        }
    }

    // Method to sum the elements in a List<? extends Number>
    public static double sumOfNumberList(List<? extends Number> list) {
        double sum = 0;
        for (Number number : list) {
            sum += number.doubleValue();  // Use doubleValue() to handle different types of Number
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("\nTest Pair:");
        // Create a Pair of different types: Integer and String
        Pair<Integer, String> pair1 = new Pair<>(10, "Apple");
        System.out.println(pair1);

        // Create a Pair of different types: Double and Boolean
        Pair<Double, Boolean> pair2 = new Pair<>(5.5, true);
        System.out.println(pair2);

        // Accessing elements of the pair
        System.out.println("Key: " + pair1.getKey());
        System.out.println("Value: " + pair1.getValue());

        System.out.println("\nTest Stack:");
        // Create a stack of Integers
        Stack<Integer> intStack = new Stack<>();

        // Push elements onto the stack
        intStack.push(10);
        intStack.push(20);
        intStack.push(30);
        System.out.println("Elements in stack:");
        intStack.printStack();
        // Peek at the top element
        System.out.println("Top element: " + intStack.peek()); // Output: 30 (Last In First Out)

        // Pop elements from the stack
        System.out.println("Popped element: " + intStack.pop()); // Output: 30
        System.out.println("Popped element: " + intStack.pop()); // Output: 20

        // Uncomment to test what happened to popping Stack empty:
       //  System.out.println("Popped element: " + intStack.pop()); // Output: 10
        // System.out.println("Popped element: " + intStack.pop()); // Output: Illegal Exception

        System.out.println("\nElements left in stack:");
        intStack.printStack();

        System.out.println("\nNew Stack of String:");
        // Create a stack of Strings
        Stack<String> stringStack = new Stack<>();

        // Push elements onto the stack
        stringStack.push("Hello");
        stringStack.push("World");

        // Peek at the top element
        System.out.println("Top element: " + stringStack.peek()); // Output: World

        // Pop elements from the stack
        System.out.println("Popped element: " + stringStack.pop()); // Output: World
        System.out.println("Popped element: " + stringStack.pop()); // Output: Hello

        // Check if the stack is empty
        System.out.println("Is the string stack empty? " + stringStack.isEmpty()); // Output: true


        System.out.println("\nTest Sort Utility:");
        // Sorting a list of Integers
        // Sorting a list of Integers
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(5);
        intList.add(2);
        intList.add(8);
        intList.add(1);
        intList.add(3);

        System.out.println("Before sorting Integer list: " + intList);
        GenericSortUtility.sort(intList);
        System.out.println("After sorting Integer list: " + intList);

        // Sorting a list of Strings
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Banana");
        stringList.add("Apple");
        stringList.add("Cherry");
        stringList.add("Date");

        System.out.println("\nBefore sorting String list: " + stringList);
        GenericSortUtility.sort(stringList);  // Now works correctly
        System.out.println("After sorting String list: " + stringList);

        // Sorting a list of a custom class implementing Comparable
        ArrayList<Person> personList = new ArrayList<>();
        personList.add(new Person("Alice", 30));
        personList.add(new Person("Bob", 25));
        personList.add(new Person("Charlie", 35));

        System.out.println("\nBefore sorting Person list: " + personList);
        GenericSortUtility.sort(personList);
        System.out.println("After sorting Person list: " + personList);


        System.out.println();
        System.out.println("\nTest WildCard Print Collection:");
        // Test printCollection with a Collection of different types
        Collection<String> stringCollection = List.of("Apple", "Banana", "Cherry");
        System.out.println("Printing Collection:");
        printCollection(stringCollection);

        // Test sumOfNumberList with a List of numbers
        List<Integer> integerList = List.of(1, 2, 3, 4, 5);
        System.out.println("\nSum of Integer List {1, 2, 3, 4, 5}: " + sumOfNumberList(integerList));

        List<Double> doubleList = List.of(1.5, 2.5, 3.5);
        System.out.println("Sum of Double List {1.5, 2.5, 3.5}: " + sumOfNumberList(doubleList));

        System.out.println();
        System.out.println("\nTest Cache:");

        // Example usage of Cache with Integer values
        Cache<Integer> intCache = new Cache<>();
        intCache.add(1);
        intCache.add(2);
        intCache.add(3);

        System.out.println("\nInteger Cache:");
        intCache.printCache();

        // Test get method
        System.out.println("\nRetrieve item at key 1 from Integer Cache: " + intCache.get(1));

        // Test clear method
        intCache.clear();
        System.out.println("\nInteger Cache after clear:");
        intCache.printCache();  // Should be empty

        // Example usage of Cache with Double values
        Cache<Double> doubleCache = new Cache<>();
        doubleCache.add(10.5);
        doubleCache.add(20.8);
        doubleCache.add(30.9);

        System.out.println("\nDouble Cache:");
        doubleCache.printCache();

        // Test get method for Double Cache
        System.out.println("\nRetrieve item at key 2 from Double Cache: " + doubleCache.get(2));

        // Test clear method
        doubleCache.clear();
        System.out.println("\nDouble Cache after clear:");
        doubleCache.printCache();  // Should be empty

        // Add items from Double Cache to Number Cache using addAll
        Cache<Number> numberCache = new Cache<>();
        numberCache.add(100);  // Adding Integer to Number Cache
        numberCache.printCache();

        System.out.println("\nCreate new Double Cache List:");
        Cache<Double> doubleCache2 = new Cache<>();
        doubleCache2.add(44.5);
        doubleCache2.add(66.8);
        doubleCache2.add(88.9);
        doubleCache2.printCache();

        numberCache.addAll(doubleCache2); // Adding Double Cache to Number Cache

        System.out.println("\nNumber Cache after adding Double Cache:");
        numberCache.printCache();
    }
    }

