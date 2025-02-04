public class Employee{
    private String name;
    private final int id;
    private String designation;
    private static int totalEmployees = 0;
    private static String companyName = "Goggle";

    public Employee(){
        this.name = "Anonymous";
        this.designation = "";
        this.id = -1;
    }

    public Employee(String employeeName, String designation, int id){
        this.name = employeeName;
        this.designation = designation;
        this.id = id;
        totalEmployees++;
    }

    public String getEmployeeName(){
        return this.name;
    }

    public void setEmployeeName(String upadtedEmployeeName){
        this.name = upadtedEmployeeName;
    }

    public String getDesignation(){
        return this.designation;
    }

    public void setDesignation(String updateDesignation){
        this.designation = updateDesignation;
    }

    public int getEmployeeId(){
        return this.id;
    }

    public static int displayTotalEmployees(){
        return totalEmployees;
    }

    public static boolean isInstanceOf(Employee obj){
        return (obj instanceof Employee);
    }

    public void displayEmployeeDetails(){
        System.out.println("Company Name is : " + this.companyName);
        System.out.println("Employee ID is : " + this.id);
        System.out.println("Employee Name is : " + this.name);
        System.out.println("Designation of Employee is : " + this.designation);
        System.out.println("******************************************");
    }
}

class Main{
    public static void main(String []args){
        Employee employee1 = new Employee("Amit Kumar", "Software Developer", 101);
        if(Employee.isInstanceOf(employee1)){
            employee1.displayEmployeeDetails();
        }

        Employee employee2 = new Employee("Mohit Agarwal", "Quality Analyst", 105);
        if(Employee.isInstanceOf(employee2)){
            employee2.displayEmployeeDetails();
        }
    }
}