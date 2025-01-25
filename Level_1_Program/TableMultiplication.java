import java.util.Scanner;

public class TableMultiplication{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int []arr = new int[10];

        for(int i = 0; i < arr.length; i++){
            arr[i] = number * (i + 1);
        }
        
        for(int i = 1; i <= 10; i++){
            System.out.println(number + " x " + i + " = " + arr[i - 1]);
        }
    }
}