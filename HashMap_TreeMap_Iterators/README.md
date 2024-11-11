
# HashMap_TreeMap_Iterators

This repository contains Java programs that demonstrate the use of `HashMap`, `TreeMap`, and `ArrayList` collections, and how to iterate over them using `Iterator`. The programs showcase the basic operations of these collections and their iterations, including modifying values, removing entries, and finding specific elements (such as the highest or lowest temperatures). It also includes JUnit tests to verify functionality.

## Programs Included

### 1. **HashMap Iteration**

This program demonstrates how to create and populate a `HashMap`, and then iterate over it using an `Iterator`. The program also shows how to modify the values during iteration and remove entries from the map safely.

- **Features:**
    - Creating and populating a `HashMap`.
    - Iterating over entries using `Iterator`.
    - Modifying values during iteration.
    - Safely removing entries while iterating.

- **Example Output:**
  ```
  Original Inventory:
  Books: 12
  Movies: 8
  Music: 15
  Games: 5
  Gadgets: 3

  Updated Inventory:
  Books: 12
  Movies: 10
  Music: 15
  Games: 5
  ```

#### JUnit Test Cases for HashMap:

- **`testHashMapIteration`**: Tests iteration over a `HashMap` and ensures that the values can be modified and entries can be removed correctly during iteration.
    - **Expected Output:**
        - Modified map entries:
            - `Movies: 10` (Modified from 8)
            - All other values remain unchanged.

#### Example JUnit Test for HashMap:
```java
@Test
public void testHashMapIteration() {
    Map<String, Integer> inventory = new HashMap<>();
    inventory.put("Books", 12);
    inventory.put("Movies", 8);
    inventory.put("Music", 15);
    inventory.put("Games", 5);
    inventory.put("Gadgets", 3);

    Iterator<Map.Entry<String, Integer>> iterator = inventory.entrySet().iterator();

    while (iterator.hasNext()) {
        Map.Entry<String, Integer> entry = iterator.next();
        if (entry.getKey().equals("Movies")) {
            entry.setValue(10); // Modify the value
        }
        if (entry.getKey().equals("Gadgets")) {
            iterator.remove(); // Remove entry
        }
    }

    // Validate the modifications
    assertEquals(Integer.valueOf(10), inventory.get("Movies"));
    assertNull(inventory.get("Gadgets"));
}
```

### 2. **TreeMap Iteration**

This program demonstrates how to create and populate a `TreeMap`, and then iterate over it to find the highest and lowest values. In this case, the program identifies the highest and lowest temperatures from a map of monthly temperatures.

- **Features:**
    - Creating and populating a `TreeMap`.
    - Iterating over entries using `Iterator`.
    - Finding the highest and lowest values during iteration.

- **Example Output:**
  ```
  Highest Temperature: 75.0 in June
  Lowest Temperature: 30.5 in January
  ```

#### JUnit Test Cases for TreeMap:

- **`testTreeMapIteration`**: Tests iteration over a `TreeMap` and ensures the highest and lowest values are correctly identified.
    - **Expected Output:**
        - Highest Temperature: `75.0 in June`
        - Lowest Temperature: `30.5 in January`

#### Example JUnit Test for TreeMap:
```java
@Test
public void testTreeMapIteration() {
    Map<String, Double> temperatures = new TreeMap<>();
    temperatures.put("January", 30.5);
    temperatures.put("February", 32.0);
    temperatures.put("March", 40.0);
    temperatures.put("April", 55.0);
    temperatures.put("May", 60.0);
    temperatures.put("June", 75.0);
    temperatures.put("July", 80.0);
    temperatures.put("August", 78.0);

    // Get the highest and lowest temperatures
    Map.Entry<String, Double> highestTemp = temperatures.lastEntry();
    Map.Entry<String, Double> lowestTemp = temperatures.firstEntry();

    // Validate the highest and lowest temperatures
    assertEquals("July", highestTemp.getKey());
    assertEquals(80.0, highestTemp.getValue(), 0.01);
    assertEquals("January", lowestTemp.getKey());
    assertEquals(30.5, lowestTemp.getValue(), 0.01);
}
```

### 3. **ArrayList Iteration**

This program demonstrates how to create and populate an `ArrayList`, and then iterate over it using an `Iterator`. It performs operations like accessing and modifying list elements during iteration. It also includes functionality to calculate sums, remove even numbers, and add elements based on conditions.

- **Features:**
    - Creating and populating an `ArrayList`.
    - Iterating over the list using `Iterator`.
    - Calculating the sum of elements in the list.
    - Removing even numbers from the list.
    - Adding elements based on a condition (e.g., adding `99` for numbers divisible by 3).

- **Example Output:**
```
Total sum: 577
ArrayList after removing even numbers: [59, 61, 65, 57, 21, 29, 89]
ArrayList after adding new elements: [59, 61, 65, 57, 21, 29, 89, 99, 99]
```

#### JUnit Test Cases for ArrayList:

- **`testCalculateSum`**: Tests the sum calculation for a list of integers.
    - **Input:** List of integers `{1, 2, 3, 4, 5}`
    - **Expected Output:** `15`
    - **Assertion:** The sum should be `15`.

- **`testRemoveEvenNumbers`**: Tests the removal of even numbers from the list.
    - **Input:** List of integers `{1, 2, 3, 4, 5, 6}`
    - **Expected Output:** `{1, 3, 5}`
    - **Assertion:** Even numbers should be removed.

- **`testAddElementsBasedOnCondition`**: Tests adding the number `99` when the number is divisible by `3`.
    - **Input:** List of integers `{1, 2, 3, 4, 6}`
    - **Expected Output:** `{1, 2, 3, 4, 6, 99, 99}`
    - **Assertion:** The number `99` should be added when the number is divisible by `3`.

- **`testEmptyList`**: Tests an empty list for sum, removal of even numbers, and element addition.
    - **Input:** An empty list `[]`
    - **Expected Output:**
        - Sum: `0`
        - List after removing even numbers: `[]`
        - List after adding elements: `[]`
    - **Assertion:** The list should remain empty after all operations.

- **`testListWithOnlyEvenNumbers`**: Tests a list with only even numbers for removal and element addition.
    - **Input:** List of integers `{2, 4, 6, 8}`
    - **Expected Output:**
        - List after removing even numbers: `[]`
        - List after adding elements: `[]`
    - **Assertion:** All even numbers should be removed. The list should remain empty after adding `99` for numbers divisible by `3`.

- **`testListWithOnlyOddNumbers`**: Tests a list with only odd numbers for element addition and removal behavior.
    - **Input:** List of integers `{1, 3, 5, 7, 9}`
    - **Expected Output:**
        - List after removing even numbers: `{1, 3, 5, 7, 9}`
        - List after adding elements: `{1, 3, 5, 7, 9, 99, 99}`
    - **Assertion:** No numbers should be removed if they are all odd. The number `99` should be added for numbers divisible by `3`.

#### Example JUnit Test for ArrayList:
```java
@Test
public void testCalculateSum() {
    List<Integer> numbers = List.of(1, 2, 3, 4, 5);
    int sum = ArrayListIteration.calculateSum(numbers);
    assertEquals(15, sum, "The sum should be 15.");
}
```

## Installation

To run the programs, make sure you have Java installed on your system.

1. **Clone the repository:**
   ```
   git clone https://github.com/itsvee0120/HashMap_TreeMap_Iterators.git
   ```

2. **Navigate to the project folder:**
   ```
   cd HashMap_TreeMap_Iterators
   ```

3. **Compile the Java programs:**
   ```
   javac HashMapIteration.java TreeMapIteration.java ArrayListIteration.java
   ```

4. **Run the programs:**
   ```
   java HashMapIteration
   java TreeMapIteration
   java ArrayListIteration
   ```

