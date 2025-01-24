import java.util.Scanner;

public class FehrenheitToCelsiusConversion{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        double celsius = input.nextDouble();
        double fehrenheitResult = ((celsius * 5) / 9) + 32;
        System.out.printf("The %.2f celsius is %.2f fehrenheit.", celsius, fehrenheitResult);
    }
}