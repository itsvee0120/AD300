import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Create an array of Student objects
        Student[] students = new Student[]{
                new Student(1, "Alice", 3.5),
                new Student(2, "Bob", 3.8),
                new Student(3, "Charlie", 3.2),
                new Student(4, "David", 3.9),
                new Student(5, "Eve", 3.7)
        };

        // Sort the array by GPA in ascending order
        Arrays.sort(students);

        // Print the sorted list of students using getter methods
        System.out.println("Sorted list of students by GPA:");
        for (Student student : students) {
            System.out.println("StudentID: " + student.getStudentId() + ", Name: " + student.getName() + ", GPA: " + student.getGpa());
        }
    }
}
