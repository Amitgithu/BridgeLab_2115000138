interface Refuelable {
    void refuel(); 
}

class Vehicle {
    protected int maxSpeed;
    protected String model;
    
    public Vehicle(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    public void displayInfo() {
        System.out.println("Model: " + model + ", Max Speed: " + maxSpeed + " km/h");
    }
}


class ElectricVehicle extends Vehicle {
    private int batteryLevel;

    public ElectricVehicle(int maxSpeed, String model, int batteryLevel) {
        super(maxSpeed, model);
        this.batteryLevel = batteryLevel;
    }

    public void charge() {
        System.out.println(model + " is charging...");
        batteryLevel = 100; 
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Battery Level: " + batteryLevel + "%");
    }
}


class PetrolVehicle extends Vehicle implements Refuelable {
    private int fuelLevel;

    public PetrolVehicle(int maxSpeed, String model, int fuelLevel) {
        super(maxSpeed, model);
        this.fuelLevel = fuelLevel;
    }

    
    @Override
    public void refuel() {
        System.out.println(model + " is refueling...");
        fuelLevel = 100; 
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Fuel Level: " + fuelLevel + "%");
    }
}


public class VehicleManagement {
    public static void main(String[] args) {
        
        ElectricVehicle tesla = new ElectricVehicle(200, "Tesla Model 3", 50);
        tesla.displayInfo();
        tesla.charge();
        tesla.displayInfo();

        System.out.println("**************************************"); 

        PetrolVehicle honda = new PetrolVehicle(180, "Honda Civic", 30);
        honda.displayInfo();
        honda.refuel();
        honda.displayInfo();
    }
}
