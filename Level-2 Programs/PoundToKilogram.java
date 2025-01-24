import java.util.Scanner;

public class PoundToKilogram{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        double weightInPounds = input.nextDouble();
        double weightInKilogram = weightInPounds * 2.2;
        System.out.println("The weight of the person in pound is %d and in kg is %d", weightInPounds, weightInKilogram);
    }
}