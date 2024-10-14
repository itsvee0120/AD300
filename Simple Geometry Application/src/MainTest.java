import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ShapeTest {

    // Normal test cases for Circle
    @Test
    void testCircleAreaAndPerimeter() {
        Circle circle = new Circle("Circle", 5);
        assertEquals(78.54, circle.calculateArea(), 0.01); // Area = π * 5^2
        assertEquals(31.42, circle.calculatePerimeter(), 0.01); // Perimeter = 2 * π * 5
    }

    @Test
    void testCircleAreaWithDifferentRadius() {
        Circle circle = new Circle("Circle", 10);
        assertEquals(314.16, circle.calculateArea(), 0.01); // Area = π * 10^2
        assertEquals(62.83, circle.calculatePerimeter(), 0.01); // Perimeter = 2 * π * 10
    }

    @Test
    void testCircleAreaWithSmallRadius() {
        Circle circle = new Circle("Circle", 1);
        assertEquals(3.14, circle.calculateArea(), 0.01); // Area = π * 1^2
        assertEquals(6.28, circle.calculatePerimeter(), 0.01); // Perimeter = 2 * π * 1
    }

    // Edge test cases for Circle
    @Test
    void testCircleWithZeroRadius() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Circle("Circle", 0);
        });
        assertEquals("Radius must be greater than zero.", exception.getMessage());
    }

    @Test
    void testCircleWithNegativeRadius() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Circle("Circle", -5);
        });
        assertEquals("Radius must be greater than zero.", exception.getMessage());
    }

    @Test
    void testCircleWithNegativeArea() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Circle("Circle", -1);
        });
        assertEquals("Radius must be greater than zero.", exception.getMessage());
    }

    // Normal test cases for Rectangle
    @Test
    void testRectangleAreaAndPerimeter() {
        Rectangle rectangle = new Rectangle("Rectangle", 2, 4);
        assertEquals(8.00, rectangle.calculateArea(), 0.01); // Area = 2 * 4
        assertEquals(12.00, rectangle.calculatePerimeter(), 0.01); // Perimeter = 2 * (2 + 4)
    }

    @Test
    void testRectangleAreaWithDifferentDimensions() {
        Rectangle rectangle = new Rectangle("Rectangle", 3, 5);
        assertEquals(15.00, rectangle.calculateArea(), 0.01); // Area = 3 * 5
        assertEquals(16.00, rectangle.calculatePerimeter(), 0.01); // Perimeter = 2 * (3 + 5)
    }

    @Test
    void testRectangleAreaWithSquareDimensions() {
        Rectangle rectangle = new Rectangle("Rectangle", 4, 4);
        assertEquals(16.00, rectangle.calculateArea(), 0.01); // Area = 4 * 4
        assertEquals(16.00, rectangle.calculatePerimeter(), 0.01); // Perimeter = 2 * (4 + 4)
    }

    // Edge test cases for Rectangle
    @Test
    void testRectangleWithNegativeLength() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Rectangle("Rectangle", -2, 4);
        });
        assertEquals("Length and width must be greater than zero.", exception.getMessage());
    }

    @Test
    void testRectangleWithZeroWidth() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Rectangle("Rectangle", 2, 0);
        });
        assertEquals("Length and width must be greater than zero.", exception.getMessage());
    }

    @Test
    void testRectangleWithNegativeWidth() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Rectangle("Rectangle", 2, -4);
        });
        assertEquals("Length and width must be greater than zero.", exception.getMessage());
    }

    // Normal test cases for Triangle
    @Test
    void testTriangleAreaAndPerimeter() {
        Triangle triangle = new Triangle("Triangle", 3, 4, 5);
        assertEquals(6.00, triangle.calculateArea(), 0.01); // Area = 6
        assertEquals(12.00, triangle.calculatePerimeter(), 0.01); // Perimeter = 3 + 4 + 5
    }

    @Test
    void testTriangleWithDifferentSides() {
        Triangle triangle = new Triangle("Triangle", 5, 5, 5);
        assertEquals(10.83, triangle.calculateArea(), 0.01); // Area of equilateral triangle
        assertEquals(15.00, triangle.calculatePerimeter(), 0.01); // Perimeter = 5 + 5 + 5
    }

    @Test
    void testTriangleWithLargeSides() {
        Triangle triangle = new Triangle("Triangle", 10, 10, 10);
        assertEquals(43.30, triangle.calculateArea(), 0.01); // Area of equilateral triangle
        assertEquals(30.00, triangle.calculatePerimeter(), 0.01); // Perimeter = 10 + 10 + 10
    }

    // Edge test cases for Triangle
    @Test
    void testTriangleWithNegativeSide() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Triangle("Triangle", 3, 4, -5);
        });
        assertEquals("Sides must be greater than zero.", exception.getMessage());
    }

    @Test
    void testTriangleWithZeroSide() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Triangle("Triangle", 0, 4, 5);
        });
        assertEquals("Sides must be greater than zero.", exception.getMessage());
    }

    @Test
    void testTriangleWithInvalidSides() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Triangle("Triangle", 1, 2, 3); // Not a valid triangle
        });
        assertEquals("The sum of any two sides must be greater than the third side.", exception.getMessage());
    }
}
