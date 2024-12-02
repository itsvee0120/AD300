import org.junit.jupiter.api.Test;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;

import static org.junit.jupiter.api.Assertions.*;

class LambdaTest {

    // Task 1: Testing Runnable Lambda
    @Test
    void testRunnableLambda() {
        Runnable task = () -> System.out.println("Hello from the Runnable thread!");
        assertDoesNotThrow(() -> {
            Thread thread = new Thread(task);
            thread.start();
            thread.join(); // Wait for the thread to finish
        });
    }

    // Task 2: Testing MathOperation Lambda
    @Test
    void testMathOperationLambda() {
        MathOperation add = (a, b) -> a + b;
        MathOperation subtract = (a, b) -> a - b;
        MathOperation multiply = (a, b) -> a * b;
        MathOperation divide = (a, b) -> a / b;

        assertEquals(8, add.operate(5, 3));
        assertEquals(2, subtract.operate(5, 3));
        assertEquals(15, multiply.operate(5, 3));
        assertEquals(2, divide.operate(6, 3));
    }

    // Task 3: Testing Sorting with Lambda
    @Test
    void testSortingLambda() {
        List<String> names = new ArrayList<>(Arrays.asList("John", "Jane", "Alex", "Sophia"));
        names.sort((s1, s2) -> s1.compareTo(s2));
        assertEquals(Arrays.asList("Alex", "Jane", "John", "Sophia"), names);
    }

    // Task 3: Testing Filtering with Lambda
    @Test
    void testFilteringLambda() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> filteredNumbers = numbers.stream()
                .filter(n -> n % 2 != 0)
                .toList();
        assertEquals(Arrays.asList(1, 3, 5, 7, 9), filteredNumbers);
    }

    // Task 4: Testing Predicate Functional Interface
    @Test
    void testPredicateLambda() {
        Predicate<String> isEmpty = str -> str.isEmpty();
        assertTrue(isEmpty.test(""));
        assertFalse(isEmpty.test("Hello"));
    }

    // Task 4: Testing Function Functional Interface
    @Test
    void testFunctionLambda() {
        Function<String, String> toUpperCase = str -> str.toUpperCase();
        assertEquals("HELLO", toUpperCase.apply("hello"));
    }

    // Task 5: Testing Composed Functions
    @Test
    void testComposedFunctions() {
        Function<Integer, Integer> add1 = x -> x + 1;
        Function<Integer, Integer> multiplyBy10 = x -> x * 10;

        Function<Integer, Integer> composedFunction = add1.andThen(multiplyBy10);
        assertEquals(60, composedFunction.apply(5)); // (5 + 1) * 10 = 60
    }

    // Task 5: Testing Custom Functional Interface
    @Test
    void testCustomStringOperationLambda() {
        StringOperation concat = (s1, s2) -> s1 + s2;
        StringOperation longerString = (s1, s2) -> s1.length() >= s2.length() ? s1 : s2;

        assertEquals("HelloWorld", concat.apply("Hello", "World"));
        assertEquals("World!", longerString.apply("Hello", "World!"));
    }
}
