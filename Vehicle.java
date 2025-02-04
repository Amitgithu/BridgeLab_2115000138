public class Vehicle{
    private String ownerName;
    private String vehicleType;
    private final String registrationNumber;
    private static int registrationFee;

    public Vehicle(){
        ownerName = "";
        vehicleType = "";
        registrationNumber = "";
    }

    public Vehicle(String ownerName, String vehicleType, String registrationNumber){
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    public String getOwnerName(){
        return ownerName;
    }

    public void setOwnerName(String ownerName){
        this.ownerName = ownerName;
    }

    public String getVehicleType(){
        return vehicleType;
    }

    public void setVehicleType(String vehicleType){
        this.vehicleType = vehicleType;
    }

    public String getRegistrationNumber(){
        return registrationNumber;
    }

    public static void setRegistrationFee(int fee){
        registrationFee = fee;
    }

    public static int getRegistrationFee(){
        return registrationFee;
    }

    public static boolean isInstanceOf(Vehicle obj){
        return (obj instanceof Vehicle);
    }

    public void displayDetails(){
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Registration Fee: " + registrationFee);
        System.out.println("******************************************");
    } 
}

class Main{
    public static void main(String[] args){
        Vehicle.setRegistrationFee(1000);
        Vehicle v1 = new Vehicle("Amit Kumar", "Car", "ABC123");

        if(Vehicle.isInstanceOf(v1)){
            v1.displayDetails();
        }
        
        Vehicle v2 = new Vehicle("Arun", "Bike", "XYZ456");
        if(Vehicle.isInstanceOf(v2)){
            v2.displayDetails();
        }
    }
}