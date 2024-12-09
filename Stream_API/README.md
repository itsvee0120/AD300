# StreamExample

## Overview
The `StreamExample` project demonstrates the usage of Java Streams to perform various operations on collections, including filtering, mapping, reducing, grouping, and working with custom objects. The project also includes static utility methods for reusability and a `Main` class to run and showcase these operations.

## Features
### Stream Operations
- **Filter Even Numbers**: Extract even numbers from a list.
- **Map to Squares**: Transform numbers to their squares.
- **Map Odd Numbers to Cubes**: Transform odd numbers to their cubes.
- **Sum Numbers**: Compute the sum of all numbers in a list using `reduce`.
- **Flatten a List of Lists**: Use `flatMap` to flatten nested lists into a single list.
- **Group by Even and Odd**: Group numbers into "Even" and "Odd" categories using `groupingBy`.

### Advanced Features with Custom Objects
- **Filter People Older Than 25**: Filter a list of `Person` objects by age and display their names.
- **Find the Oldest People**: Identify the oldest people in a list, even if there are ties.

## Project Structure
```
src/
├── Main.java               // Entry point to run the application
├── StreamExample.java      // Contains utility methods for stream operations
└── Person.java             // Represents a custom object for stream examples
```

## How to Run
1. Clone the repository:
   ```bash
   git clone <repository_url>
   ```
2. Compile the Java files:
   ```bash
   javac Main.java StreamExample.java Person.java
   ```
3. Run the application:
   ```bash
   java Main
   ```

## Sample Output
```
Even Numbers:
[2, 4, 6, 8, 10]

Squared Numbers:
[1, 4, 9, 16, 25, 36, 49, 64, 81, 100]

Cubed Odd Numbers:
[1, 27, 125, 343, 729]

Sum of Numbers:
55

Flattened List:
[1, 2, 3, 4, 5, 6, 7]

Grouped by Even and Odd:
Even: [2, 4, 6, 8, 10]
Odd: [1, 3, 5, 7, 9]

People older than 25:
[Alice, Charlie, David, Jay]

Oldest People:
David (Age: 35)
Jay (Age: 35)
```

## How to Add Tests
The project includes a JUnit test class (`StreamExampleTest.java`) to validate the utility methods. Test cases cover:
- **Normal Cases**: Verifying expected behavior for typical inputs.
- **Edge Cases**: Handling special cases like empty lists or duplicates.

To run the tests:
1. Make sure JUnit is configured in your IDE or build tool.
2. Execute the test class using your IDE or:
   ```bash
   java org.junit.runner.JUnitCore StreamExampleTest
   ```

## Technologies Used
- **Java 8+**: For streams and lambda expressions.
- **JUnit**: For unit testing.

## Future Enhancements
- Add support for parallel streams to optimize performance for large datasets.
- Include more complex custom objects to demonstrate advanced stream capabilities.
- Provide additional edge case tests for comprehensive coverage.

## Author
Violet Nguyen

Feel free to contribute or provide feedback to enhance this project! 😊


