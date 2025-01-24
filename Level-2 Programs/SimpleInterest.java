import java.util.Scanner;

public class SimpleInterest{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        double principal = input.nextInt();
        double rate = input.nextInt();
        double time = input.nextInt();
        double simpleInterest = (principal * rate * time) / 100;
        System.out.printf("The Simple Interest is %.2f for Principal %.2f, Rate of Interest %.2f and Time %.2f", simpleInterest, principal, rate, time);
    }
}