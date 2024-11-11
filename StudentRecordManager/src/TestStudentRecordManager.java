public class TestStudentRecordManager {

    public static void main(String[] args) {
        StudentRecordManager manager = new StudentRecordManager();

        // Test: Add students
        manager.addOrUpdateStudentRecord("101", "Alice", 3.5);
        manager.addOrUpdateStudentRecord("102", "Bob", 2.8);
        manager.addOrUpdateStudentRecord("103", "Charlie", 3.2);

        // Test: Display all records
        manager.displayAllRecords();

        // Test: Update student GPA
        manager.updateStudentGPA("102", 3.6);

        // Test: Delete a student record
        manager.deleteStudentRecord("103");

        // Test: Display all records again
        manager.displayAllRecords();

        // Test: Find students with GPA higher than 3.0
        manager.findStudentsWithGpaHigherThan(3.0);

        // Test: Adding with duplicate ID
        manager.addOrUpdateStudentRecord("101", "Eve", 3.9);
        manager.displayAllRecords();
    }
}
