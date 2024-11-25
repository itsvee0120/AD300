import java.util.Arrays;

public class Student implements Comparable<Student> {
    // Properties
    private int studentId;
    private String name;
    private double gpa;

    // Constructor
    public Student(int studentId, String name, double gpa) {
        this.studentId = studentId;
        this.name = name;
        this.gpa = gpa;
    }

    // Getter methods
    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    // Implement the compareTo method to compare students based on GPA
    @Override
    public int compareTo(Student other) {
        // Compare GPA in ascending order
        return Double.compare(this.gpa, other.gpa);
    }

    // toString method for better display
    @Override
    public String toString() {
        return "StudentID: " + studentId + ", Name: " + name + ", GPA: " + gpa;
    }

}