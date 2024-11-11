public class Student {
    protected String id;
    private String name;
    private double gpa;

    public Student(String id, String name, double gpa){
        this.id = id;
        this.name = name;
        this.gpa = gpa;

    }

    // Get Method
    public String getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public double getGPA(){
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", GPA: " + gpa;
    }

}
