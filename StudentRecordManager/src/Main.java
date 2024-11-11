

public class Main {
    public static void main(String[] args) {
        StudentRecordManager manager = new StudentRecordManager();

        // Add records
        manager.updateStudentRecords("101", "Alice", 3.5);
        manager.updateStudentRecords("102", "Bob", 2.8);
        manager.updateStudentRecords("103", "Charlie", 3.2);
        manager.updateStudentRecords("104", "Diana", 3.9);
        manager.updateStudentRecords("105", "Eve", 2.6);

        // Display all records
        manager.displayAllRecords();

        System.out.println();
        // Update GPA of a student
        manager.updateStudentGPA("103", 2.0);
        System.out.println("After GPA Update:");
        manager.displayAllRecords();

        System.out.println();
        // Delete a student record
        manager.deleteStudentRecords("102");
        System.out.println("After Deletion:");
        manager.displayAllRecords();

        System.out.println();
        // Find students with GPA higher than 3.0
        manager.findStudentsWithGpaHigherThan(3.0);
    }
}