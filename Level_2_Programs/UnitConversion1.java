import java.util.Scanner;

public class UnitConversion1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double km = input.nextDouble();
        double miles = input.nextDouble();
        double meters = input.nextDouble();
        double feet = input.nextDouble();

        System.out.printf("%.2f km is %.2f miles\n", km, convertKmToMiles(km));
        System.out.printf("%.2f miles is %.2f km\n", miles, convertMilesToKm(miles));
        System.out.printf("%.2f meters is %.2f feet\n", meters, convertMetersToFeet(meters));
        System.out.printf("%.2f feet is %.2f meters\n", feet, convertFeetToMeters(feet));
    }

    public static double convertMilesToKm(double miles) {
        return miles * 1.60934;
    }

    public static double convertKmToMiles(double km) {
        return km * 0.621371;
    }

    public static double convertFeetToMeters(double feet) {
        return feet * 0.3048;
    }

    public static double convertMetersToFeet(double meters) {
        return meters * 3.28084;
    }

} 
