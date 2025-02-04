public class Student{
    private String name;
    private int rollNumber;
    private char grade;
    private static String universityName = "GLA University";
    private static int totalStudents = 0;

    public Student(){
        this.name = "Anonymous";
        this.rollNumber = -1;
        this.grade = '';
    }

    public Student(String studentName, int rollNumber, char grade){
        this.name = studentName;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    public String getStudentName(){
        return this.name;
    }

    public void setStudentName(String updatedStudentName){
        this.name = updatedStudentName;
    }

    public int getRollNumber(){
        return this.rollNumber;
    }

    public void setRollNumber(int updatedRollNumber){
        this.rollNumber = updatedRollNumber;
    }

    public char getGrade(){
        return this.grade;
    }

    public void setGrade(char updatedGrade){
        this.grade = updatedGrade;
    }

    public static int getTotalStudents(){
        return totalStudents;
    }

    public static boolean isInstanceOf(Student obj){
        return (obj instanceof Student);
    }

    public void displayStudentDetails(){
        System.out.println("University Name is : " + this.universityName);
        System.out.println("Student Name is : " + this.name);
        System.out.println("Roll Number is : " + this.rollNumber);
        System.out.println("Grade of Student is : " + this.grade);
    }
}

class Main{
    public static void main(String []args){
        Student student1 = new Student("Amit Kumar", 101, 'A');
        if(isInstanceOf(student1)){
            student1.displayStudentDetails();
        }

        Student student2 = new Student("Mohit Agarwal", 102, 'B');
         if(isInstanceOf(student2)){
            student2.displayStudentDetails();
        }

        System.out.println("Total Number of Students : " + student2.getTotalStudents());
    }
}