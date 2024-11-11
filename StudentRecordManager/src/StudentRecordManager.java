import java.util.Map;
import java.util.TreeMap;

public class StudentRecordManager {
    //declare a tree map
    private TreeMap<String, Student> studentRecords;

    public StudentRecordManager() {
        //instantiate treemap
        studentRecords = new TreeMap<>();
    }

    // Add new records
    public void updateStudentRecords(String id, String name, double gpa) {
        if (studentRecords.containsKey(id)){
            System.out.println("Student with id: " + id + " already exist in the system.");}

        studentRecords.put(id, new Student(id, name, gpa));
    }

    //Delete a student record by ID
    public void deleteStudentRecords(String id){
        if (studentRecords.remove(id) != null) {
            System.out.println("Student with ID " + id + " deleted.");}
        else{
            System.out.println("Error: Student ID " + id + " not found.");
        }
    }

    // update gpa using student's id
    public void updateStudentGPA(String id, double newGpa){
        Student student = studentRecords.get(id);
        if(student != null){
            student.setGpa(newGpa);
            System.out.println("Student GPA updated for ID " + id);
        } else {
        System.out.println("Error: Student ID " + id + " not found.");}
    }

    // Display all records sorted by ID
    public void displayAllRecords() {
        System.out.println("All Student Records:");
        studentRecords.values().stream().forEach(System.out::println);
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
