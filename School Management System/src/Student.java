
public class Student {
    private String name;
    private String grade;

    public Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName(){
        return name;
    }

    public String getGrade(){
        return grade;
    }

    public void displayInfo() {
        System.out.println("Student Name: " + name + ", Grade: " + grade);
    }
}


