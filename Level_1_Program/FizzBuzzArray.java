import java.util.Scanner;

public class FizzBuzzArray{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        String []arr = new String[size + 1];

        for(int i = 0; i < arr.length; i++){
            if(i % 3 == 0 && i % 5 == 0){
                arr[i] = "FizzBuzz";
            }
            else if(i % 3 == 0){
                arr[i] = "Fizz";
            }
            else if(i % 5 == 0){
                arr[i] = "Buzz";
            }
            else{
                arr[i] = i + "";
            }
        }

        for(int i = 0; i < arr.length; i++){
            System.out.println("Position " + i + " = " + arr[i]);
        }
    }
}