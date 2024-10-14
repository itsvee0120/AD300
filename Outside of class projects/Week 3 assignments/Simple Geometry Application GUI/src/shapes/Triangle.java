package shapes;
public class Triangle extends Shape {

    // Instance variables
    private double sideA;
    private double sideB;
    private double sideC;

    // Constructor
    public Triangle(String name, double sideA, double sideB, double sideC) {
        super(name);
        if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
            throw new IllegalArgumentException("Sides must be greater than zero.");
        }
        if (sideA + sideB <= sideC || sideA + sideC <= sideB || sideC + sideB <= sideA) {
            throw new IllegalArgumentException("The sum of any two sides must be greater than the third side.");
        }
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    // Override Methods
    @Override
    public double calculateArea() {
        double s = (sideA + sideB + sideC) / 2; // Semi-perimeter
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC)); // Return the area
    }

    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC; // Return the perimeter
    }
}
