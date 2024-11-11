public class Main {

    public static void main(String[] args) {
        StudentRecordManager manager = new StudentRecordManager();

        System.out.println("\n Adding students:");
        // Add 5 student records
        manager.addOrUpdateStudentRecord("101", "Alice", 3.5);
        manager.addOrUpdateStudentRecord("102", "Bob", 2.8);
        manager.addOrUpdateStudentRecord("103", "Charlie", 3.2);
        manager.addOrUpdateStudentRecord("104", "David", 3.9);
        manager.addOrUpdateStudentRecord("105", "Eve", 3.7);

        System.out.println();
        // Display all records
        manager.displayAllRecords();
        System.out.println();
        // Update GPA of a student
        manager.updateStudentGPA("102", 3.6);
        System.out.println();
        // Display all records again after GPA update
        manager.displayAllRecords();
        System.out.println();
        // Delete a student record
        manager.deleteStudentRecord("103");
        System.out.println();
        // Display all records again after deletion
        manager.displayAllRecords();
        System.out.println();
        // Find students with GPA higher than 3.0
        manager.findStudentsWithGpaHigherThan(3.0);
        System.out.println();
        // Adding a student with duplicate ID (101)
        manager.addOrUpdateStudentRecord("101", "Alice Smith", 3.8); // This should update Alice's record
        manager.displayAllRecords();
    }
}
