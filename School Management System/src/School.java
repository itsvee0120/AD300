import java.util.ArrayList;
import java.util.List;

public class School {
    private String name;
    private List<Department> departments;

    public School(String name){
        this.departments = new ArrayList<>();
        this.name = name;
    }

    // Adding department
    public void add(Department department){
        departments.add(department);
    }
    public List<Department> getDepartments() {
        return departments;
    }

    /// Method to display school info
    public void displayInfo() {
        System.out.println("School Name: " + name);
      System.out.println();
        for (Department department : departments) {
            department.displayInfo();
            System.out.println();
        }
    }
}


