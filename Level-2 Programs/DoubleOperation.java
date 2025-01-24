import java.util.Scanner;

public class DoubleOperation{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double operation1Result = a + b * c;
        double operation2Result = a * b + c;
        double operation3Result = c + a / b;
        double operation4Result = a % b + c;
        System.out.println("The results of Double Operations are %.2f, %.2f, %.2f, and %.2f", operation1Result, operation2Result, operation3Result, operation4Result);
    }
}