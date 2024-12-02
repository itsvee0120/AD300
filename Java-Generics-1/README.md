# README: Generics Assignment

## Overview
This Java project demonstrates the usage of **Generics**, including generic classes, methods, bounded types, wildcards, and interfaces. The project includes:
- A `Box` class that can store any type of object.
- A `NumberBox` class that accepts only numeric types.
- A `Processor` interface, implemented by `StringProcessor`, which processes strings (e.g., reversing them).
- A practical example with a `Library` class that uses generics to manage a collection of items (e.g., books, DVDs).

## Assignment Tasks

### Part 1: Understanding Generics
1. **Create a Generic Class (`Box<T>`)**:
    - Stores any type of object.
    - Has `set` and `get` methods.
    - Includes a static generic method to print the box contents.
    - Includes a non-static method that uses wildcards (`?`) to print values of subtypes of `Number`.

2. **Create a Bounded Generic Class (`NumberBox<N>`)**:
    - Accepts only numeric types using bounded type parameters (`N extends Number`).

3. **Write a Generic Interface (`Processor<T>`)**:
    - Implements a `process` method that operates on a given type.
    - `StringProcessor` implements the `Processor` interface to reverse a string.

### Part 2: Advanced Usage
1. **Demonstrate Wildcards in Generic Methods**:
    - The method `printBoxWildcard` uses wildcards to handle boxes containing subtypes of `Number`.

2. **Practical Application: Library Class**:
    - A generic `Library` class manages items of any type (e.g., books, DVDs). It supports adding, removing, and finding items.

## Example Output

The following actions will take place in the main method:
- **Static vs Wildcard Methods**: Print the contents of `Box` instances using both a static method (`printBox`) and a non-static method with wildcards (`printBoxWildcard`).
- **String Processor**: Reversing a string using the `StringProcessor` class.
- **Library Operations**: Adding, removing, and finding books (or other items) in a generic `Library` class.

### Expected Console Output:

```
Testing print Static vs print Wildcard:
Using static method:
Box contains: 42
Box contains: 3.14

Using wildcard method:
Box contains: 42
Box contains: 3.14

Testing Processors:
Original: Generics
Reversed: sciregneG

Testing Book Library:
Library contains:
- The Great Gatsby
- 1984
- To Kill a Mockingbird

Finding '1984': 1984

List after remove '1984':
Library contains:
- The Great Gatsby
- To Kill a Mockingbird

DVD items added:
Library contains:
- Inception
- The Matrix
```

## Key Features:
- **Generic Class**: The `Box` class demonstrates how to create a container for any type.
- **Static and Non-static Methods**: Methods in the `Box` class show how to work with generics using both static and instance methods.
- **Wildcard Usage**: The `printBoxWildcard` method demonstrates the flexibility of wildcards in handling different types within a class hierarchy.
- **Generic Interface**: The `Processor` interface is used to define operations on generic types, and the `StringProcessor` implements string manipulation (e.g., reversing a string).
- **Library Application**: The `Library` class shows a practical application of generics for managing collections of items (e.g., books, DVDs).

## Conclusion:
This assignment demonstrates how to effectively use Java generics to create reusable and type-safe classes, interfaces, and methods. The example also includes practical applications like managing a library of items using generics.

