public class Main {

    public static void main(String[] args) {
        // Test values
        int num1 = 10;
        int num2 = 5;
        int num3 = 0;

        System.out.println();
        System.out.println("Calculator");
        System.out.println("--------------------------------------------------");

        // Testing addition
        System.out.println("Addition: " + MathUtils.add(num1, num2)); // 15

        // Testing subtraction
        System.out.println("Subtraction: " + MathUtils.subtract(num1, num2)); // 5

        // Testing multiplication
        System.out.println("Multiplication: " + MathUtils.multiply(num1, num2)); // 50

        // Testing division
        System.out.println("Division: " + MathUtils.divide(num1, num2)); // 2.0
        System.out.println("Division by zero: " + MathUtils.divide(num1, num3)); // NaN

        System.out.println("--------------------------------------------------");
    }
}
