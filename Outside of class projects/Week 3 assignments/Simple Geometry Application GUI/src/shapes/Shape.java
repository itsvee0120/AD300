package shapes;
public abstract class Shape {

    // Instance variable
    protected String name;

    // Constructor to set name
    public Shape(String name) {
        this.name = name;
    }

    // Abstract class to calculate Area
    public abstract double calculateArea();

    // Abstract class to calculate Perimeter
    public abstract double calculatePerimeter();

    // Concrete method that return shape name
    public String getName() {
        return name;
    }

}
