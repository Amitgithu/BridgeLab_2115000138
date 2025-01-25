import java.util.Scanner;

public class ReverseNumber{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int countDigits = 0;    

        int temp = number;
        while(temp > 0){
            countDigits++;
            temp /= 10;
        }

        int []digits = new int[countDigits];

        while(number > 0){
            int digit = number % 10;
            digits[countDigits - 1] = digit;
            countDigits--;
            number /= 10;
        }

        for(int i = 0; i < digits.length; i++){
            System.out.print(digits[i]);
        }
    }
}