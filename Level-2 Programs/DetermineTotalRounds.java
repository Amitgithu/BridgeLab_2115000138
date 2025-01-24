import java.util.Scanner;

public class DetermineTotalRounds{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int side1 = input.nextInt();
        int side2 = input.nextInt();
        int side3 = input.nextInt();
        int perimeter = side1 + side2 + side3;
        int totalRounds = (int)Math.ceil(5 / perimeter);
        System.out.printf("The total number of rounds the athlete will run is %d to complete 5 km", totalRounds);
    }
}