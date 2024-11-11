import java.util.Map;
import java.util.TreeMap;

public class StudentRecordManager {
    // Declare a TreeMap to store student records
    private TreeMap<String, Student> studentRecords;

    public StudentRecordManager() {
        // Instantiate the TreeMap
        studentRecords = new TreeMap<>();
    }

    // Add new records or update if student exists
    public void addOrUpdateStudentRecord(String id, String name, double gpa) {
        if (studentRecords.containsKey(id)) {
            System.out.println("Student with ID: " + id + " already exists. Updating the record.");
            Student student = studentRecords.get(id);
            student.setName(name); // Optionally update the name
            student.setGpa(gpa); // Update GPA if needed
        } else {
            studentRecords.put(id, new Student(id, name, gpa));
            System.out.println("Student with ID " + id + " added.");
        }
    }

    // Delete a student record by ID
    public void deleteStudentRecord(String id) {
        if (studentRecords.remove(id) != null) {
            System.out.println("Student with ID " + id + " deleted.");
        } else {
            System.out.println("Error: Student ID " + id + " not found.");
        }
    }

    // Update GPA of a student
    public void updateStudentGPA(String id, double newGpa) {
        if (newGpa < 0 || newGpa > 4) {
            System.out.println("Error: Invalid GPA value. It must be between 0 and 4.");
            return;
        }

        Student student = studentRecords.get(id);
        if (student != null) {
            student.setGpa(newGpa);
            System.out.println("Student GPA updated for ID " + id + "; new GPA: " + newGpa);
        } else {
            System.out.println("Error: Student ID " + id + " not found.");
        }
    }

    // Display all records sorted by ID
    public void displayAllRecords() {
        if (studentRecords.isEmpty()) {
            System.out.println("No records found.");
        } else {
            System.out.println("All Student Records:");
            studentRecords.values().forEach(System.out::println);
        }
    }

    // Find students with GPA higher than a specified value
    public void findStudentsWithGpaHigherThan(double gpa) {
        System.out.println("Students with GPA higher than " + gpa + ":");
        boolean found = false;
        for (Student student : studentRecords.values()) {
            if (student.getGPA() > gpa) {
                System.out.println(student);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No students found with GPA higher than " + gpa);
        }
    }
}
