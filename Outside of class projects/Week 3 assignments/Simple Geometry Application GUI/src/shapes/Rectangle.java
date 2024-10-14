package shapes;
public class Rectangle extends Shape {

    // Instance variables
    private double length;
    private double width;

    // Constructor
    public Rectangle(String name, double length, double width) {
        super(name);
        if (length <= 0 || width <= 0) {
            throw new IllegalArgumentException("Length and width must be greater than zero.");
        }
        this.length = length;
        this.width = width;
    }

    // Override methods
    @Override
    public double calculateArea() {
        return length * width; // Return the area
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width); // Return the perimeter
    }
}
