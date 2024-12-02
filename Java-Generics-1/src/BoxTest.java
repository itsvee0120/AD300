import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class BoxTest {

    // Normal Test Cases
    @Test
    void testBoxWithInteger() {
        // Test Box with Integer
        Box<Integer> intBox = new Box<>();
        intBox.set(42);
        assertEquals(42, intBox.get(), "Box should contain 42");
    }

    @Test
    void testBoxWithDouble() {
        // Test Box with Double
        Box<Double> doubleBox = new Box<>();
        doubleBox.set(3.14);
        assertEquals(3.14, doubleBox.get(), "Box should contain 3.14");
    }

    @Test
    void testPrintBoxStatic() {
        // Test static method with valid types
        Box<Integer> intBox = new Box<>();
        intBox.set(42);
        assertDoesNotThrow(() -> Box.printBox(intBox), "Static method should work without exceptions");

        Box<Double> doubleBox = new Box<>();
        doubleBox.set(3.14);
        assertDoesNotThrow(() -> Box.printBox(doubleBox), "Static method should work without exceptions");
    }

    // Edge Test Cases
    @Test
    void testBoxWithNull() {
        // Test Box with null value
        Box<String> strBox = new Box<>();
        strBox.set(null);
        assertNull(strBox.get(), "Box should handle null values correctly");
    }

    @Test
    void testNumberBoxWithBoundaryValues() {
        // Test NumberBox with boundary numeric values
        NumberBox<Integer> numBoxInt = new NumberBox<>();
        numBoxInt.set(Integer.MIN_VALUE);
        assertEquals(Integer.MIN_VALUE, numBoxInt.get(), "NumberBox should handle Integer.MIN_VALUE");

        NumberBox<Double> numBoxDouble = new NumberBox<>();
        numBoxDouble.set(Double.MAX_VALUE);
        assertEquals(Double.MAX_VALUE, numBoxDouble.get(), "NumberBox should handle Double.MAX_VALUE");
    }

    @Test
    void testStringProcessorWithEmptyString() {
        // Test StringProcessor with an empty string
        StringProcessor processor = new StringProcessor();
        String input = "";
        String output = processor.process(input);
        assertEquals("", output, "The processed string should remain empty when input is empty");
    }

    // Additional Test Cases for Wildcard Methods
    @Test
    void testPrintBoxWildcard() {
        // Test wildcard method with valid types
        Box<Integer> intBox = new Box<>();
        intBox.set(42);
        assertDoesNotThrow(() -> intBox.printBoxWildcard(intBox), "Wildcard method should work without exceptions");

        Box<Double> doubleBox = new Box<>();
        doubleBox.set(3.14);
        assertDoesNotThrow(() -> doubleBox.printBoxWildcard(doubleBox), "Wildcard method should work without exceptions");
    }

    // Testing the NumberBox type restriction (edge case)
    @Test
    void testNumberBoxWithNonNumber() {
        // This test will fail to compile if uncommented, showing the restriction of NumberBox
        // NumberBox<String> stringBox = new NumberBox<>(); // Should cause a compile-time error
    }
}
