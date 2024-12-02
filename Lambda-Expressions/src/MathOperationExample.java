public class MathOperationExample {
    public static void main(String[] args) {
        // Implementing addition
        MathOperation add = (a, b) -> a + b;
        System.out.println("Addition: " + add.operate(5, 3));

        // Implementing subtraction
        MathOperation subtract = (a, b) -> a - b;
        System.out.println("Subtraction: " + subtract.operate(5, 3));

        // Implementing multiplication
        MathOperation multiply = (a, b) -> a * b;
        System.out.println("Multiplication: " + multiply.operate(5, 3));

        // Implementing division
        MathOperation divide = (a, b) -> a / b;
        System.out.println("Division: " + divide.operate(6, 3));
    }
}
