import java.util.Scanner;

public class FrequencyOfDigitInNumber{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int []frequency = new int[10];

        while(number > 0){
            int digit = number % 10;
            frequency[digit]++;
            number /= 10;
        }

        for(int i = 0; i < frequency.length; i++){
            if(frequency[i] > 0){
                System.out.println("Frequency of " + i + " is " + frequency[i]);
            }
        }
    }
}