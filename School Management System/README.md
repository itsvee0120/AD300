
# School Management System

## Overview
The School Management System is a simple Java application designed to manage departments, teachers, and students within a school. It allows for adding teachers and students to specific departments while checking for duplicates. 

## Features
- **Department Management**: Create and manage departments within the school.
- **Teacher Management**: Add teachers to departments with subject specialization.
- **Student Management**: Add students to departments with grade tracking.
- **Duplicate Handling**: Prevent duplicate entries for both teachers and students.

## Classes
- `School`: Represents a school that contains multiple departments.
- `Department`: Represents a department within a school, including teachers and students.
- `Teacher`: Represents a teacher, including their name and subject.
- `Student`: Represents a student, including their name and grade.

## Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Maven (for dependency management)
- An IDE such as IntelliJ IDEA or Eclipse

### Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/itsvee0120/AD300.git
   ```
2. Navigate to the project directory:
   ```bash
   cd AD300
   ```
3. Open the project in your preferred IDE.

### Running the Application
1. Compile the project (if necessary).
2. Run the `Main` class to start the application.

### Example Usage
Here’s how to add departments, teachers, and students:

```java
public class Main {
    public static void main(String[] args) {
        School school = new School("Alexander");

        // Create departments
        Department mathDepartment = new Department("Mathematics Department");
        Department scienceDepartment = new Department("Science Department");

        // Add departments to the school
        school.add(mathDepartment);
        school.add(scienceDepartment);

        // Create teachers
        Teacher teacher1 = new Teacher("Alice Smith", "Mathematics");
        Teacher teacher2 = new Teacher("Bob Johnson", "Physics");

        // Add teachers to departments
        mathDepartment.addTeacher(teacher1);
        scienceDepartment.addTeacher(teacher2);

        // Create students
        Student student1 = new Student("John Doe", "12");
        Student student2 = new Student("Emma Brown", "11");

        // Add students to departments
        mathDepartment.addStudent(student1);
        scienceDepartment.addStudent(student2);

        // Display department info
        school.displayInfo();
    }
}
```

## Testing
The project includes JUnit tests to validate the functionality of the `addStudent` and `addTeacher` methods, ensuring proper handling of duplicates.

### Test Cases
- **Normal Cases**:
    - Adding unique students and teachers.
    - Adding students and teachers to different departments.

- **Edge Cases**:
    - Attempting to add the same student multiple times.
    - Attempting to add the same teacher multiple times.
    - Adding a student with a null value (if applicable, based on your implementation).

## Contributing
Contributions are welcome! Please open an issue or submit a pull request for any improvements or bug fixes.

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgements
- JUnit for testing framework
- Java for the programming language


