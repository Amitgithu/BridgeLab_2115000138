import java.util.Scanner;

public class SumOfArrayElement{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double []arr = new double[10];
        double totalSum = 0;
        int index = 0;
        
        while(true){
            int number = input.nextInt();
            if(number <= 0 || index == arr.length){
                break;
            }

            arr[index] = number;
            index++;
        }

        for(int i = 0; i < arr.length; i++){
            totalSum += arr[i];
        }

        System.out.println("The totalSum of the array elements is " + totalSum);
    }
}