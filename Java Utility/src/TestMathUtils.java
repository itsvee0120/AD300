import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestMathUtils {

    @Test
    void testAdd() {
        Assertions.assertEquals(15, MathUtils.add(10, 5));
        Assertions.assertEquals(0, MathUtils.add(0, 0));
        Assertions.assertEquals(-5, MathUtils.add(-10, 5));
    }

    @Test
    void testSubtract() {
        Assertions.assertEquals(5, MathUtils.subtract(10, 5));
        Assertions.assertEquals(0, MathUtils.subtract(5, 5));
        Assertions.assertEquals(-15, MathUtils.subtract(-10, 5));
    }

    @Test
    void testMultiply() {
        Assertions.assertEquals(50, MathUtils.multiply(10, 5));
        Assertions.assertEquals(0, MathUtils.multiply(0, 5));
        Assertions.assertEquals(-50, MathUtils.multiply(-10, 5));
    }

    @Test
    void testDivide() {
        Assertions.assertEquals(2.0, MathUtils.divide(10, 5));
        Assertions.assertEquals(0.0, MathUtils.divide(0, 5));
        Assertions.assertEquals(Double.NaN, MathUtils.divide(10, 0)); // Test division by zero
    }
}
