
# Generic Collection Utility Example

This project demonstrates the usage of generics, wildcards, collections, and utility classes in Java. It includes examples of pairs, stacks, sorting, wildcards, and cache management. Below is a breakdown of the key components and their functionality.

## Features

1. **Pair Class**:
    - Stores two different types of objects together.
    - Example: `Pair<Integer, String>`, `Pair<Double, Boolean>`.

2. **Stack Class**:
    - Implements a stack data structure using generics.
    - Supports basic operations like `push()`, `pop()`, `peek()`, and `isEmpty()`.

3. **Sorting Utility**:
    - Demonstrates sorting an array of integers in ascending order and an array of doubles in descending order.
    - Uses `Arrays.sort()` for sorting with a custom comparator for descending order.

4. **Wildcard Collection**:
    - Prints collections using wildcards (`?`), demonstrating the ability to handle collections of unknown types.
    - Summing up elements in a collection of numbers (`List<? extends Number>`).

5. **Cache Class**:
    - Implements a generic cache that supports adding, retrieving, clearing items, and printing the cache.
    - Demonstrates usage with `Integer` and `Double` types and allows merging data from different caches into a `Cache<Number>`.

---

## Classes and Methods

### `Pair<K, V>`
- A class to store a pair of different objects (e.g., `Integer` and `String`).
- Methods:
    - `getKey()`: Returns the key of the pair.
    - `getValue()`: Returns the value of the pair.
    - `toString()`: Returns a string representation of the pair.

### `Stack<T>`
- A class to implement the stack data structure with basic operations:
    - `push(T item)`: Adds an item to the stack.
    - `pop()`: Removes and returns the top item from the stack.
    - `peek()`: Returns the top item without removing it.
    - `isEmpty()`: Checks if the stack is empty.
    - `printStack()`: Prints all items in the stack.

### `Cache<T>`
- A class to manage a cache of items.
- Methods:
    - `add(T item)`: Adds an item to the cache.
    - `get(int key)`: Retrieves an item by its key.
    - `clear()`: Clears all items in the cache.
    - `printCache()`: Prints all items in the cache.
    - `addAll(Cache<? extends T> otherCache)`: Merges items from another cache into this one.

---

## Example Usage

### Pair Example

```java
Pair<Integer, String> pair1 = new Pair<>(10, "Apple");
System.out.println(pair1);
```

### Stack Example

```java
Stack<Integer> intStack = new Stack<>();
intStack.push(10);
intStack.push(20);
intStack.push(30);
intStack.printStack();
System.out.println("Top element: " + intStack.peek());
```

### Sorting Example

```java
Integer[] intArray = {34, 12, 56, 1, 90, 23};
Arrays.sort(intArray);  // Sorts in ascending order
```

### Wildcard Collection Example

```java
Collection<String> stringCollection = List.of("Apple", "Banana", "Cherry");
printCollection(stringCollection);
```

### Cache Example

```java
Cache<Integer> intCache = new Cache<>();
intCache.add(1);
intCache.add(2);
System.out.println("Retrieve item at key 1: " + intCache.get(1));
intCache.clear();
```

---

## Running the Code

To run this project, you can copy the classes and `Main` method into your Java IDE or a text editor and execute the `Main` class. Each section in the `Main` method demonstrates how to use the various components of the project.

---

## Conclusion

This project demonstrates the power of generics and wildcards in Java, making it easier to work with different types and collections. The utility classes like `Pair`, `Stack`, and `Cache` provide reusable and flexible solutions for common programming tasks.
