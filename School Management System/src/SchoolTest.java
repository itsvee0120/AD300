import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SchoolTest {
    private School school;
    private Department mathDepartment;
    private Teacher teacher;
    private Student student;

    @BeforeEach
    void setUp() {
        // Initialize the School and Department before each test
        school = new School("Alexander");
        mathDepartment = new Department("Mathematics Department");
        school.add(mathDepartment);

        // Initialize a Teacher and Student for tests
        teacher = new Teacher("Alice Smith", "Mathematics");
        student = new Student("John Doe", "12");
    }

    // Normal Test Cases

    @Test
    void testAddDepartment() {
        Department scienceDepartment = new Department("Science Department");
        school.add(scienceDepartment);
        assertEquals(2, school.getDepartments().size(), "School should have 2 departments.");
    }

    @Test
    void testAddTeacherToDepartment() {
        mathDepartment.addTeacher(teacher);
        assertEquals(1, mathDepartment.getTeachers().size(), "Math Department should have 1 teacher.");
    }

    @Test
    void testAddStudentToDepartment() {
        mathDepartment.addStudent(student);
        assertEquals(1, mathDepartment.getStudents().size(), "Math Department should have 1 student.");
    }

    // Edge Test Cases

    @Test
    void testAddDuplicateTeacher() {
        mathDepartment.addTeacher(teacher);
        mathDepartment.addTeacher(teacher); // Adding the same teacher again
        assertEquals(1, mathDepartment.getTeachers().size(), "Math Department should have 1 unique teacher.");
    }

    @Test
    void testAddDuplicateStudent() {
        mathDepartment.addStudent(student);
        mathDepartment.addStudent(student); // Adding the same student again
        assertEquals(1, mathDepartment.getStudents().size(), "Math Department should have 1 unique student.");
    }

    @Test
    void testRemoveTeacher() {
        mathDepartment.addTeacher(teacher);
        mathDepartment.removeTeacher(teacher); // Assuming you have this method
        assertEquals(0, mathDepartment.getTeachers().size(), "Math Department should have 0 teachers after removal.");
    }

    @Test
    void testRemoveStudent() {
        mathDepartment.addStudent(student);
        mathDepartment.removeStudent(student); // Assuming you have this method
        assertEquals(0, mathDepartment.getStudents().size(), "Math Department should have 0 students after removal.");
    }
}
