public class Patient{
    private String name;
    private int age;
    private String ailment;
    private final int patientId;
    private static String hospitalName = "KD Dental";

    public Patient(){
        name = "";
        age = 0;
        ailment = "";
        patientId = 0;
    }

    public Patient(String name, int age, String ailment, int patientId){
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientId = patientId;
    }

    public String getName(){
        return name;
    }

    public void setName(String updatedName){
        this.name = updatedName;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int updatedAge){
        this.age = updatedAge;
    }

    public String getAilment(){
        return this.ailment;
    }

    public void setAilment(String updatedAilment){
        this.ailment = updatedAilment;
    }

    public int getPatientID(){
        return this.patientId;
    }

    public String getHospitalName(){
        return hospitalName;
    }

    public static boolean isInstanceOf(Patient obj){
        return (obj instanceof Patient);
    }


    public void displayDetails(){
        System.out.println("Patient Name : "  + this.name);
        System.out.println("Patient ID : "  + this.patientId);
        System.out.println("Patient Age : "  + this.age);
        System.out.println("Patient Ailment : "  + this.ailment);
        System.out.println("***********************************");
    }

}

class Main{
    public static void main(String []args){
        Patient patient1 = new Patient("Mohit Agarwal", 21, "Chickenpox", 101);
        if(Patient.isInstanceOf(patient1)){
            patient1.displayDetails();
        }

        Patient patient2 = new Patient("Amit Kumar", 23, "Cholera", 105);
        if(Patient.isInstanceOf(patient2)){
            patient2.displayDetails();
        }

        System.out.println("Hospital Name is : " + patient1.getHospitalName());
    }
}