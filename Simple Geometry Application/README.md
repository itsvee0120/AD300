
# Simple Geometry Application

## Objective
This Java application simulates various geometric shapes, demonstrating the concepts of abstract class, inheritance and polymorphism. It allows users to explore different shape types and calculate their areas and perimeters.

## Overview
The application consists of a base class `Shape`, from which several subclasses derive. Each subclass represents a different type of geometric shape and overrides certain methods to provide specific behavior for calculating area and perimeter.

## Features
- **Shape Base Class**: Defines common properties and methods for all shapes.
- **Subclasses**:
    - **Circle**: Represents circles and calculates area and perimeter based on radius.
    - **Rectangle**: Represents rectangles and calculates area and perimeter based on length and width.
    - **Triangle**: Represents triangles and calculates area using Heron's formula and perimeter based on its three sides.
- **Error Handling**: The application includes error handling to manage invalid shape parameters.
- **Dynamic Method Invocation**: The application dynamically calls methods based on the shape type at runtime.

### Unit Testing

This project includes unit tests to ensure that the shapes' calculations for area and perimeter function correctly and that error handling is in place. The tests are written using JUnit 5, a widely used testing framework in Java.

#### Test Cases

The unit tests cover both normal and edge cases for each shape class. Below are some key points regarding the test cases:

1. **Circle Tests**
    - **Normal Cases**:
        - `testCircleAreaAndPerimeter()`: Tests area and perimeter calculations for a circle with radius 5.
        - `testCircleAreaWithDifferentRadius()`: Tests calculations for a circle with radius 10.
        - `testCircleAreaWithSmallRadius()`: Tests calculations for a circle with radius 1.
    - **Edge Cases**:
        - `testCircleWithZeroRadius()`: Asserts that creating a circle with zero radius throws an `IllegalArgumentException`.
        - `testCircleWithNegativeRadius()`: Asserts that creating a circle with negative radius throws an `IllegalArgumentException`.


2. **Rectangle Tests**
    - **Normal Cases**:
        - `testRectangleAreaAndPerimeter()`: Tests area and perimeter calculations for a rectangle with dimensions 2x4.
        - `testRectangleAreaWithDifferentDimensions()`: Tests calculations for a rectangle with dimensions 3x5.
    - **Edge Cases**:
        - `testRectangleWithNegativeLength()`: Asserts that creating a rectangle with negative length throws an `IllegalArgumentException`.
        - `testRectangleWithZeroWidth()`: Asserts that creating a rectangle with zero width throws an `IllegalArgumentException`.


3. **Triangle Tests**
    - **Normal Cases**:
        - `testTriangleAreaAndPerimeter()`: Tests area and perimeter calculations for a triangle with sides 3, 4, and 5.
        - `testTriangleWithDifferentSides()`: Tests calculations for an equilateral triangle with all sides equal to 5.
    - **Edge Cases**:
        - `testTriangleWithNegativeSide()`: Asserts that creating a triangle with a negative side length throws an `IllegalArgumentException`.
        - `testTriangleWithInvalidSides()`: Asserts that creating a triangle with sides that do not satisfy the triangle inequality throws an `IllegalArgumentException`.
    

## Requirements
- Java Development Kit (JDK) 8 or higher.
- An IDE or text editor to run the code.

## Implementation

### Base Class - Shape
**Properties**:
- `name`: (String) The name of the shape.

**Methods**:
- `calculateArea()`: An abstract method that subclasses must override.
- `calculatePerimeter()`: An abstract method that subclasses must override.
- `getName()`: Returns the name of the shape.

### Subclasses
- **Circle Class**:
    - Calculates area using the formula: 
      - Area = π × radius²
    - Calculates perimeter using the formula: 
      - Perimeter = 2 × π × radius

- **Rectangle Class**:
    - Calculates area using the formula: 
      - Area = length × width
    - Calculates perimeter using the formula: 
      - Perimeter = 2 × (length + width)

- **Triangle Class**:
    - Calculates area using Heron's formula: 
      - Area = √(s × (s - a) × (s - b) × (s - c)), 
      where **s** is the semi-perimeter calculated as \( s = (a + b + c) / 2 \) and **a**, **b**, **c** are the lengths of the sides.
    - Calculates perimeter by summing all three sides: 
      - Perimeter = a + b + c

### Main Class
The `Main` class creates instances of each subclass and calls their methods to demonstrate their behaviors. It uses an `ArrayList` to store shape objects and iterates through them to invoke methods dynamically based on their types.


## How to Run using Git Bash
1. Clone the repository or download the source code to your local machine.

   ```bash
   git clone https://github.com/itsvee0120/AD300.git
   cd AD300/"Simple Geometry Application"
   ```

2. Navigate to the project directory where the Java files are located.

3. Compile the Java files using the following command:

   ```bash
   javac Main.java Circle.java Rectangle.java Triangle.java
   ```

4. Run the application using the following command:

   ```bash
   java Main
   ```

## How to Run by Downloading ZIP
1. Download the ZIP file of the repository from GitHub.

    - Go to the repository page and click on the green "Code" button.
    - Select "Download ZIP."

2. Extract the ZIP file to a desired location on your machine.

3. Open your terminal or command prompt and navigate to the extracted project directory:

   ```bash
   cd path/to/extracted/Simple Geometry Application
   ```

4. Compile the Java files using the following command:

   ```bash
   javac Main.java Circle.java Rectangle.java Triangle.java
   ```

5. Run the application using the following command:

   ```bash
   java Main
   ```

## Example Output
The application will output the area and perimeter for the shapes based on the created instances. For example:

```
Shape: Circle
Area: 78.54
Perimeter: 31.42

Shape: Rectangle
Area: 12.00
Perimeter: 12.00

Shape: Triangle
Area: 6.00
Perimeter: 12.00
```

## Contributing
Contributions are welcome! Feel free to open issues or submit pull requests for improvements or new features.

## License
This project is licensed under the MIT License - see [LICENSE](https://opensource.org/licenses/MIT) for details.

## Acknowledgments
README.md for the "Simple Geometry Application" assignment is generated using AI prompts (mainly example cases) then checked by Violet to ensure readability and comprehension.




