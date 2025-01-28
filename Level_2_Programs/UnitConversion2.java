import java.util.Scanner;

public class UnitConversion2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double yards = input.nextDouble();
        double feet = input.nextDouble();
        double meters = input.nextDouble();
        double inches = input.nextDouble();

        System.out.printf("%.2f yards is %.2f feet\n", yards, convertYardsToFeet(yards));
        System.out.printf("%.2f feet is %.2f yards\n", feet, convertFeetToYards(feet));
        System.out.printf("%.2f meters is %.2f inches\n", meters, convertMetersToInches(meters));
        System.out.printf("%.2f inches is %.2f meters\n", inches, convertInchesToMeters(inches));
        System.out.printf("%.2f inches is %.2f cm\n", inches, convertInchesToCm(inches));
    }

    public static double convertFeetToYards(double feet) {
        return feet * 0.333333;
    }

    public static double convertYardsToFeet(double yards) {
        return yards * 3;
    }

    public static double convertInchesToMeters(double inches) {
        return inches * 0.0254;
    }

    public static double convertInchesToCm(double inches) {
        return inches * 2.54;
    }

    public static double convertMetersToInches(double meters) {
        return meters * 39.3701;
    }

}
