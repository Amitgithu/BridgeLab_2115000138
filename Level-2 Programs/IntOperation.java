import java.util.Scanner;

public class IntOperation{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int operation1Result = a + b * c;
        int operation2Result = a * b + c;
        int operation3Result = c + a / b;
        int operation4Result = a % b + c;
        System.out.println("The results of Int Operations are %d, %d, %d, and %d", operation1Result, operation2Result, operation3Result, operation4Result);
    }
}