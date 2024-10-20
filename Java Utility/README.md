
# MathUtils Class

The `MathUtils` class provides basic arithmetic operations, including addition, subtraction, multiplication, and division. It is designed to be simple and easy to use for basic mathematical calculations.

## Features

- **Addition**: Adds two integers.
- **Subtraction**: Subtracts one integer from another.
- **Multiplication**: Multiplies two integers.
- **Division**: Divides one integer by another with error handling for division by zero.

## Methods

### `add(int a, int b)`

Adds two integers and returns the result as a `double`.

**Parameters:**
- `a` - The first integer.
- `b` - The second integer.

**Returns:** The sum of `a` and `b`.

### `subtract(int a, int b)`

Subtracts the second integer from the first and returns the result as a `double`.

**Parameters:**
- `a` - The first integer.
- `b` - The second integer.

**Returns:** The difference of `a` and `b`.

### `multiply(int a, int b)`

Multiplies two integers and returns the result as a `double`.

**Parameters:**
- `a` - The first integer.
- `b` - The second integer.

**Returns:** The product of `a` and `b`.

### `divide(int a, int b)`

Divides the first integer by the second. If the second integer is zero, an `ArithmeticException` is thrown.

**Parameters:**
- `a` - The numerator.
- `b` - The denominator.

**Returns:** The quotient of `a` and `b`.

## Usage Example

```java
public class Example {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        System.out.println("Addition: " + MathUtils.add(a, b));
        System.out.println("Subtraction: " + MathUtils.subtract(a, b));
        System.out.println("Multiplication: " + MathUtils.multiply(a, b));

        try {
            System.out.println("Division: " + MathUtils.divide(a, b));
            System.out.println("Division by zero: " + MathUtils.divide(a, 0));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
```

## Output

```
Addition: 15.0
Subtraction: 5.0
Multiplication: 50.0
Division: 2.0
Division by zero: Division by zero is not allowed.
```

## Installation

1. Clone this repository.
2. Include the `MathUtils.java` file in your Java project.
3. Import and use the `MathUtils` class as demonstrated in the usage example.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contributing

Feel free to submit issues or pull requests for any improvements or features you would like to add.

## Acknowledgments
README.md for the "Math Utility" assignment is generated using AI prompts (mainly example cases) then checked by Violet to ensure readability and comprehension.
