import java.util.ArrayList;
import java.util.List;


class Course {
    private String name;
    private List<Student> enrolledStudents;

    public Course(String name) {
        this.name = name;
        this.enrolledStudents = new ArrayList<>();
    }

    
    public void enrollStudent(Student student) {
        if (!enrolledStudents.contains(student)) {
            enrolledStudents.add(student);
            student.addCourse(this); 
        }
    }

    
    public void showEnrolledStudents() {
        System.out.println("Course: " + name);
        if (enrolledStudents.isEmpty()) {
            System.out.println("  No students enrolled.");
        } else {
            for (Student student : enrolledStudents) {
                System.out.println("  Student: " + student.getName());
            }
        }
    }

    public String getName() {
        return name;
    }
}


class Student {
    private String name;
    private List<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    
    public void addCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
        }
    }

    
    public void enrollInCourse(Course course) {
        course.enrollStudent(this);
    }

    
    public void showEnrolledCourses() {
        System.out.println("Student: " + name);
        if (courses.isEmpty()) {
            System.out.println("  Not enrolled in any courses.");
        } else {
            for (Course course : courses) {
                System.out.println("  Course: " + course.getName());
            }
        }
    }

    public String getName() {
        return name;
    }
}


class School {
    private String name;
    private List<Student> students;

    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    
    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    
    public void showStudents() {
        System.out.println("School: " + name);
        if (students.isEmpty()) {
            System.out.println("  No students enrolled.");
        } else {
            for (Student student : students) {
                System.out.println("  Student: " + student.getName());
            }
        }
    }
}


public class SchoolAndStudentsWithCourse {
    public static void main(String[] args) {
        School school = new School("Delhi Public School");

        Student rahul = new Student("Rahul");
        Student priya = new Student("Priya");

        Course hindi = new Course("Hindi");
        Course physics = new Course("Physics");

        rahul.enrollInCourse(hindi);
        rahul.enrollInCourse(physics);
        priya.enrollInCourse(hindi);

        school.addStudent(rahul);
        school.addStudent(priya);

        school.showStudents();

        System.out.println();
        rahul.showEnrolledCourses();
        priya.showEnrolledCourses();

        System.out.println();
        hindi.showEnrolledStudents();
        physics.showEnrolledStudents();
    }
}
