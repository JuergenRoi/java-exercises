package Student;

import java.util.HashMap;
import java.util.Map;

public class Grade {
    private Map<String, Map<String, Double>> studentGrades;

    public Grade() {
        studentGrades = new HashMap<>();
    }

    public void recordGrade(Student student, Course course, double grade) {
        studentGrades
            .computeIfAbsent(student.getStudentId(), k -> new HashMap<>())
            .put(course.getCourseCode(), grade);
    }

    public double calculateGPA(Student student) {
        Map<String, Double> grades = studentGrades.get(student.getStudentId());
        if (grades == null || grades.isEmpty()) {
            return 0.0;
        }

        double totalPoints = 0.0;
        int totalCredits = 0;

        for (Course course : student.getCourses()) {
            Double grade = grades.get(course.getCourseCode());
            if (grade != null) {
                totalPoints += grade * course.getCredits();
                totalCredits += course.getCredits();
            }
        }

        return totalCredits == 0 ? 0.0 : totalPoints / totalCredits;
    }

    public static void main(String[] args) {
        Student student = new Student("Charlie", "S001");
        Course math = new Course("Mathematics", "MATH101", 3);
        Course science = new Course("Science", "SCI101", 4);

        student.enrollCourse(math);
        student.enrollCourse(science);

        Grade grade = new Grade();
        grade.recordGrade(student, math, 90);
        grade.recordGrade(student, science, 85);

        double gpa = grade.calculateGPA(student);
        System.out.println("GPA: " + gpa);        
    }
}
