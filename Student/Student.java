package Student;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private String studentId;
    private List<Course> courses;

    public Student() {
        courses = new ArrayList<>();
    }

    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
        courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void enrollCourse(Course course) {
        courses.add(course);
    }

    @Override
    public String toString() {
        return "Student{name=" + name + ", studentId=" + studentId + ", courses" + courses + "}";
    }
}