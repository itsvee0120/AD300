package shapes;
public class Circle extends Shape {

    // Instance variables
    private double radius;

    // Constructor
    public Circle(String name, double radius) {
        super(name);
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be greater than zero.");
        }
        this.radius = radius;
    }

    // Override methods
    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2); // Return the area
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius; // Return the perimeter
    }
}
