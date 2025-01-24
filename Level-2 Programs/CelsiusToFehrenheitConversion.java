import java.util.Scanner;

public class CelsiusToFehrenheitConversion{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        double fehrenheit = input.nextDouble();
        double celsiusResult = ((fehrenheit - 32) * 5) / 9;
        System.out.printf("The %.2f fahrenheit is %.2f celsius.", fehrenheit, celsiusResult);
    }
}