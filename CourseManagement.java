import java.util.ArrayList;
import java.util.List;


abstract class CourseType {
    private String name;

    public CourseType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void displayDetails();
}


class ExamCourse extends CourseType {
    public ExamCourse(String name) {
        super(name);
    }

    @Override
    public void displayDetails() {
        System.out.println("Exam Course: " + getName());
    }
}

class AssignmentCourse extends CourseType {
    public AssignmentCourse(String name) {
        super(name);
    }

    @Override
    public void displayDetails() {
        System.out.println("Assignment Course: " + getName());
    }
}


class Course<T extends CourseType> {
    private T courseType;

    public Course(T courseType) {
        this.courseType = courseType;
    }

    public void showCourse() {
        courseType.displayDetails();
    }

    
    public static void displayAllCourses(List<? extends CourseType> courses) {
        for (CourseType course : courses) {
            course.displayDetails();
        }
    }
}


public class CourseManagement {
    public static void main(String[] args) {
        
        Course<ExamCourse> mathExam = new Course<>(new ExamCourse("Mathematics"));
        Course<AssignmentCourse> historyAssignment = new Course<>(new AssignmentCourse("History"));

        mathExam.showCourse();
        historyAssignment.showCourse();

        
        List<CourseType> courses = new ArrayList<>();
        courses.add(new ExamCourse("Physics"));
        courses.add(new AssignmentCourse("English"));

        
        Course.displayAllCourses(courses);
    }
}
