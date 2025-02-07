class Person {
    protected String name; 
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }
}

class Student extends Person {
    private char grade;

    public Student(String name, int age, char grade) {
        super(name, age);
        this.grade = grade;
    }

    @Override
    public void displayRole() {
        System.out.println("Role : Student");
    }

    @Override
    public void displayDetails() {
        displayRole();
        super.displayDetails(); 
        System.out.println("Grade: " + grade);
        System.out.println("*********************************************");
    }
}


class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public void displayRole() {
        System.out.println("Role : Teacher");
    }

    @Override
    public void displayDetails() {
        displayRole();
        super.displayDetails();
        System.out.println("Subject: " + subject);
        System.out.println("*********************************************");
    }
}


class Staff extends Person {
    private String role;

    public Staff(String name, int age, String role) {
        super(name, age);
        this.role = role;
    }

    @Override
    public void displayRole() {
        System.out.println("Role : Staff");
    }

    @Override
    public void displayDetails() {
        displayRole();
        super.displayDetails();
        System.out.println("Job Role: " + role);
        System.out.println("*********************************************");
    }
}

public class SchoolWithDifferentRoles{
    public static void main(String[] args) {
        Person student = new Student("Amit", 21, 'A');
        Person teacher = new Teacher("Mr. Sharma", 40, "Mathematics");
        Person staff = new Staff("Raj", 35, "Janitor");

        student.displayDetails();
        teacher.displayDetails();
        staff.displayDetails();
    }
}