
# Lambda Expressions and Functional Interfaces in Java

This project explores the use of **Lambda Expressions** and **Functional Interfaces** in Java. It consists of various tasks to demonstrate their implementation in different scenarios.

## Tasks Overview

### Task 1: Understanding Lambda Expressions
- **Goal**: Learn and implement lambda expressions.
- **Example**: Use a lambda expression to implement the `Runnable` interface and execute a simple thread.
- **File**: `LambdaExample.java`

### Task 2: Using Lambda Expressions with Functional Interfaces
- **Goal**: Define a custom functional interface (`MathOperation`) and implement it with lambda expressions for:
    - Addition
    - Subtraction
    - Multiplication
    - Division
- **File**: `MathOperationExample.java`

### Task 3: Using Lambda Expressions with Collections
- **Goal**: Use lambda expressions with collections to:
    1. Sort a list of strings.
    2. Filter out even numbers from a list of integers.
- **Files**:
    - `LambdaSortExample.java`
    - `LambdaFilterExample.java`

### Task 4: Using Built-in Functional Interfaces
- **Goal**: Explore built-in functional interfaces:
    1. Use `Predicate` to check if a string is empty.
    2. Use `Function` to convert a string to uppercase.
- **Files**:
    - `PredicateExample.java`
    - `FunctionExample.java`

### Task 5: Advanced Usage
- **Goal**: Explore advanced use cases of lambda expressions:
    1. Compose two functions using `andThen` for sequential operations.
    2. Define and use a custom functional interface (`StringOperation`) to:
        - Concatenate two strings.
        - Find the longer of two strings.
- **Files**:
    - `FunctionCompositionExample.java`
    - `StringOperationExample.java`

## How to Run the Project
1. Clone the repository:
   ```bash
   git clone <repository-url>
   cd <repository-directory>
   ```
2. Compile the Java files using:
   ```bash
   javac *.java
   ```
3. Run the desired file:
   ```bash
   java <ClassName>
   ```

## Examples of Execution
### Task 1: Lambda Example
Run `LambdaExample.java` to see:
```bash
Hello from the Runnable thread!
```

### Task 2: Math Operations
Run `MathOperationExample.java` to see:
```bash
Addition: 8
Subtraction: 2
Multiplication: 15
Division: 2
```

### Task 3: Sorting and Filtering
Run:
- `LambdaSortExample.java` to sort a list of strings alphabetically.
- `LambdaFilterExample.java` to filter odd numbers from a list.

### Task 4: Predicate and Function
Run:
- `PredicateExample.java` to test if a string is empty.
- `FunctionExample.java` to convert strings to uppercase.

### Task 5: Advanced Usage
Run:
- `FunctionCompositionExample.java` to see composed functions in action.
- `StringOperationExample.java` for string concatenation and comparison.

## Requirements
- Java Development Kit (JDK) 8 or higher.
- A code editor or IDE (e.g., IntelliJ IDEA, Eclipse, or VS Code).

## Notes
- This project demonstrates the power and simplicity of lambda expressions for implementing functional interfaces.
- It includes examples for both custom and built-in functional interfaces.

## License
This project is licensed under the MIT License. You are free to use, modify, and distribute this code.

