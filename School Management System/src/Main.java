public class Main {
    public static void main(String[] args) {
        School school = new School("Alexander");

        // create departments object
        Department mathDepartment = new Department("Mathematics Department");
        Department scienceDepartment = new Department("Science Department");
        Department historyDepartment = new Department("History Department");
        Department literatureDepartment = new Department("Literature Department");

        // Add departments to School
        school.add(mathDepartment);
        school.add(scienceDepartment);
        school.add(historyDepartment );
        school.add(literatureDepartment);

        // create teacher and student objects
         // Create Teacher objects
        Teacher teacher1 = new Teacher("Alice Smith", "Mathematics");
        Teacher teacher2 = new Teacher("Bob Johnson", "Physics");
        Teacher teacher3 = new Teacher("Cynthia Lee", "History");
        Teacher teacher4 = new Teacher("David Kim", "Literature");

        // Create Student objects
        Student student1 = new Student("John Doe", "12");
        Student student2 = new Student("Emma Brown", "11");
        Student student3 = new Student("Liam Davis", "11");
        Student student4 = new Student("Sophia Garcia", "10");


        // Add teachers to their respective departments
        mathDepartment.addTeacher(teacher1);
        scienceDepartment.addTeacher(teacher2);
        historyDepartment.addTeacher(teacher3);
        literatureDepartment.addTeacher(teacher4);

        // Add students to the mathematics department
        mathDepartment.addStudent(student1);

        //Add students to the History Department
       historyDepartment.addStudent(student2);

        // Add students to the science department
        scienceDepartment.addStudent(student3);

        // Add students to the literature department
        literatureDepartment.addStudent(student4);

        //Display info
        System.out.println();
        school.displayInfo();
        System.out.println();
    }
}