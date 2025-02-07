class Employee{
    private String name;
    private int id;
    private int salary;

    public Employee(String name, int id, int salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails(){
        System.out.println("Employee Name : " + this.name);
        System.out.println("Employee ID : " +  this.id);
        System.out.println("Employee Salary : " +  this.salary);
    }

    public String getName(){
        return this.name;
    }

    public int getID(){
        return this.id;
    }

    public int getSalary(){
        return this.salary;
    }

}

class Manager extends Employee{
    private int teamSize;

    public Manager(String name, int id, int salary, int teamSize){
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Employee Have Team Size : " +  this.teamSize);
        System.out.println("*********************************************");
    }
}

class Developer extends Employee{
    private int experience;
    private String programmingLanguage;

    public Developer(String name, int id, int salary, int experience, String programmingLanguage){
        super(name, id, salary);
        this.experience = experience;
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Employee has Experience : " +  this.experience);
        System.out.println("Employee Knows Language : " +  this.programmingLanguage);
        System.out.println("*********************************************");

    }
}

class Intern extends Employee{
    private int internshipDuration;

    public Intern(String name, int id, int salary, int internshipDuration){
        super(name, id, salary);
        this.internshipDuration = internshipDuration;
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Employee has Internship Duration : " +  this.internshipDuration);
        System.out.println("*********************************************");
    }
}

public class EmployeeManagementSystem{
    public static void main(String []args){
        Employee employee1 = new Manager("Ravi", 101, 50000, 8);
        employee1.displayDetails();

        Employee employee2 = new Developer("Amit", 102, 80000, 2, "Java");
        employee2.displayDetails();

        Employee employee3 = new Intern("Arun", 105, 75000, 6);
        employee3.displayDetails();
    }
}

