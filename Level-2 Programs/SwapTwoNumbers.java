import java.util.Scanner;

public class SwapTwoNumbers{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        number1 = number1 + number2;

        number2 = number1 - number2;
        number1 = number1 - number2;
        System.out.printf("The swapped numbers are %d and %d.", number1, number2);
    }
}