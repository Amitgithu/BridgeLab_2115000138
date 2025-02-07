class Device {
    private String deviceId;
    private String status;

    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    public String getDeviceID(){
        return this.deviceId;
    }

    public String getStatus(){
        return this.status;
    }

    public void displayStatus() {
        System.out.println("Device ID: " + deviceId + ", Status: " + status);
    }
}

class Thermostat extends Device {
    private double temperatureSetting;

    public Thermostat(String deviceId, String status, double temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    public double getTemperatureSetting() { 
        return temperatureSetting; 
    }

    @Override
    public void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature Setting: " + temperatureSetting);
    }
}

public class SmartHomeDevice {
    public static void main(String[] args) {
        Device thermostat = new Thermostat("T1000", "Active", 22.5);
        thermostat.displayStatus();
    }
}