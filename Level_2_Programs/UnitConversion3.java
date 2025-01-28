import java.util.Scanner;

public class UnitConversion3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double farhenheit = input.nextDouble();
        double celsius = input.nextDouble();
        double pounds = input.nextDouble();
        double kilograms = input.nextDouble();
        double gallons = input.nextDouble();
        double liters = input.nextDouble();

        System.out.printf("%.2f farhenheit is %.2f celsius\n", farhenheit, convertFarhenheitToCelsius(farhenheit));
        System.out.printf("%.2f celsius is %.2f farhenheit\n", celsius, convertCelsiusToFarhenheit(celsius));
        System.out.printf("%.2f pounds is %.2f kilograms\n", pounds, convertPoundsToKilograms(pounds));
        System.out.printf("%.2f kilograms is %.2f pounds\n", kilograms, convertKilogramsToPounds(kilograms));
        System.out.printf("%.2f gallons is %.2f liters\n", gallons, convertGallonsToLiters(gallons));
        System.out.printf("%.2f liters is %.2f gallons\n", liters, convertLitersToGallons(liters));
    }

    public static double convertFarhenheitToCelsius(double farhenheit) {
        return (farhenheit - 32) * 5 / 9;
    }

    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }

    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    public static double convertCelsiusToFarhenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

}
