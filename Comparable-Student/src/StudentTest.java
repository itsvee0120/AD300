import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    @Test
    public void testConstructorAndGetters() {
        // Create a Student object
        Student student = new Student(1, "Alice", 3.5);

        // Assert that the constructor correctly initializes the fields
        assertEquals(1, student.getStudentId());
        assertEquals("Alice", student.getName());
        assertEquals(3.5, student.getGpa(), 0.001); // Using delta for floating-point comparison
    }

    @Test
    public void testCompareTo() {
        // Create Student objects with different GPAs
        Student student1 = new Student(1, "Alice", 3.5);
        Student student2 = new Student(2, "Bob", 3.8);
        Student student3 = new Student(3, "Charlie", 3.2);

        // Compare GPAs
        assertTrue(student1.compareTo(student2) < 0); // Alice's GPA is less than Bob's
        assertTrue(student2.compareTo(student1) > 0); // Bob's GPA is greater than Alice's
        assertEquals(0, student1.compareTo(new Student(4, "David", 3.5))); // Same GPA, should return 0
        assertTrue(student3.compareTo(student2) < 0); // Charlie's GPA is less than Bob's
    }

    @Test
    public void testSortStudents() {
        // Create an array of Student objects
        Student[] students = new Student[]{
                new Student(1, "Alice", 3.5),
                new Student(2, "Bob", 3.8),
                new Student(3, "Charlie", 3.2),
                new Student(4, "David", 3.9),
                new Student(5, "Eve", 3.7)
        };

        // Sort the array by GPA
        Arrays.sort(students);

        // Check if the students are sorted by GPA in ascending order
        assertEquals(3.2, students[0].getGpa(), 0.001); // Charlie should be first
        assertEquals(3.5, students[1].getGpa(), 0.001); // Alice should be second
        assertEquals(3.7, students[2].getGpa(), 0.001); // Eve should be third
        assertEquals(3.8, students[3].getGpa(), 0.001); // Bob should be fourth
        assertEquals(3.9, students[4].getGpa(), 0.001); // David should be last
    }
}
