import java.util.ArrayList;
import java.util.List;

public class Department {
    private String department;
    private List<Teacher> teachers;
    private List<Student> students;

    public Department(String department){
        this.department = department;
        this.teachers = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    //Add methods

    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
            System.out.println("Student added: " + student.getName());
        } else {
            System.out.println("Duplicate student: " + student.getName());
        }
    }

    public void addTeacher(Teacher teacher) {
        if (!teachers.contains(teacher)) {
            teachers.add(teacher);
            System.out.println("Teacher added: " + teacher.getName());
        } else {
            System.out.println("Duplicate teacher: " + teacher.getName());
        }
    }

    public void removeTeacher(Teacher teacher) {
        teachers.remove(teacher);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void displayInfo() {
        System.out.println("Department: " + department);

        for (Teacher teacher : teachers) {
            teacher.displayInfo();
        }

        for (Student student : students) {
            student.displayInfo();
        }
    }
}