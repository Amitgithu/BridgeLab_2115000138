import java.util.Scanner;

public class TableMultiplicationInRange{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int []multiplicationResult = new int[10];

        for(int i = 6;i <= 9; i++){
            multiplicationResult[i] = number * i;
        }
        
        for(int i = 6; i <= 9; i++){
            System.out.println(number + " x " + i + " = " + multiplicationResult[i]);
        }
    }
}