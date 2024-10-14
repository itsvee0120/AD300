package shapes;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Instantiate a new Circle object
        Circle circle = new Circle("Circle", 5); // Pass radius as 5
        Rectangle rectangle = new Rectangle("Rectangle", 2, 6);
        Triangle triangle = new Triangle("Triangle", 3, 4, 5);

        // Create new Array List
        ArrayList<Shape> shapes = new ArrayList<>();

        // Add new objects to ArrayList
        shapes.add(circle);
        shapes.add(rectangle);
        shapes.add(triangle);

        // Loop through new ArrayList
        for (Shape shape : shapes) {
            // Access and print the shape name
            System.out.println("Shape: " + shape.getName());

            // Calculate area and perimeter and store the results
            double area = shape.calculateArea();
            double perimeter = shape.calculatePerimeter();

            // Print the results
            System.out.println("Area: " + String.format("%.2f", area)); // Format to 2 decimal places
            System.out.println("Perimeter: " + String.format("%.2f", perimeter)); // Format to 2 decimal places

            System.out.println(); // Blank line for better readability
        }
    }
}
