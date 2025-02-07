class Course{
    private String courseName;
    private int duration;

    public Course(String courseName, int duration){
        this.courseName = courseName;
        this.duration = duration;
    }

    public void displayDetails(){
        System.out.println("Course Details : ");
        System.out.println("Course Name: " + this.courseName);
        System.out.println("Duration for the Course: " + this.duration);
    }

}

class OnlineCourse extends Course{
    private String platform;
    private boolean isRecorded;

    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded){
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Platform of Course: " + this.platform);
        System.out.println("Recorded Course: " + (isRecorded ? "Yes" : "No"));
    }
}

class PaidOnlineCourse extends OnlineCourse{
    private double fee;
    private double discount;

    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount){
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    public double getDiscountedPrice(){
        return fee - (fee * discount) / 100;
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Course Fee is : " + this.fee);
        System.out.println("Final Price : Rs" + getDiscountedPrice());
        System.out.println("**********************************");
    }
}

public class EducationalCourseHierarchy{
    public static void main(String []args){
        Course course1 = new PaidOnlineCourse("Java Programming", 12, "Coding Blocks", true, 21000, 20);
        Course course2 = new PaidOnlineCourse("Data Structure and ALgorithm", 24, "Apna College", true, 15000, 10);

        course1.displayDetails();
        course2.displayDetails();
    }
}