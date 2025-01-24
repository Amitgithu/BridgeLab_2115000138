import java.util.Scanner;

public class DistributeChocolates{
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        int numberOfchocolates = input.nextInt();
        int numberOfChildren = input.nextInt();
        int eachStudentChocolate = numberOfchocolates / numberOfChildren;
        int remainingChocolates = numberOfchocolates % numberOfChildren;
        System.out.printf("The number of chocolates each child gets is %d and the number of remaining
        chocolates are %d", eachStudentChocolate, remainingChocolates);
    }
}