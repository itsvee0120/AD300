
# Student GPA Sorting Program

This project defines a `Student` class that represents a student with properties like `studentId`, `name`, and `gpa`. It includes functionality to compare students by GPA using the `Comparable` interface, and allows sorting of a list of students in ascending order by GPA. Additionally, JUnit tests are provided to validate the core features of the program.

## Features

- `Student` class with properties: `studentId`, `name`, `gpa`
- `Comparable<Student>` implementation to compare students by GPA
- Sorting functionality for a list of students
- JUnit tests to ensure correctness of constructor, getter methods, `compareTo()` method, and sorting functionality

## Setup and Installation

1. **Clone the repository**:

    ```bash
    git clone https://github.com/itsvee0120/AD300/tree/main
    cd AD300
    ```

2. **Ensure Java is installed**:

    This project requires Java 8 or higher. You can verify your Java version with:

    ```bash
    java -version
    ```



3. **Build and Run the Program**:

   To run the program, compile the `Student.java` file and execute the main class.

   **Example**:

   ```bash
   javac Student.java Main.java
   java Main
   ```

This will display the sorted list of students based on their GPA.
.

## Example Output

When you run the `Main` class, it will output the sorted list of students based on GPA:

```
Sorted list of students by GPA:
StudentID: 3, Name: Charlie, GPA: 3.2
StudentID: 1, Name: Alice, GPA: 3.5
StudentID: 5, Name: Eve, GPA: 3.7
StudentID: 2, Name: Bob, GPA: 3.8
StudentID: 4, Name: David, GPA: 3.9
```

## JUnit Tests

The tests verify the following:

1. **Constructor and Getter Methods**:
    - Ensure that the `Student` object is correctly initialized.
    - Ensure that getter methods return the correct values.

2. **compareTo Method**:
    - Ensure that students are compared correctly based on GPA.

3. **Sorting Students**:
    - Ensure that an array of students is sorted in ascending order by GPA.

## License

This project is licensed under the MIT License.

