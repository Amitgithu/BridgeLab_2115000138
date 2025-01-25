import java.util.Scanner;

public class OddEvenNumberInArray{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if(number <= 0){
            System.out.println("The number is negative");
            return;
        }

        int []oddArray = new int[number / 2 + 1];
        int []evenArray = new int[number / 2 + 1];

        int oddIndex = 0;
        int evenIndex = 0;

        for(int i = 1; i <= number; i++){
            if(i % 2 == 0){
                evenArray[evenIndex] = i;
                evenIndex++;
            }
            else{
                oddArray[oddIndex] = i;
                oddIndex++;
            }
        }

        System.out.println("The odd numbers are: ");
        for(int i = 0; i < oddIndex; i++){
            System.out.print(oddArray[i] + " ");
        }
        System.out.println();

        System.out.println("The even numbers are: ");
        for(int i = 0; i < evenIndex; i++){
            System.out.print(evenArray[i] + " ");
        }
    }
}