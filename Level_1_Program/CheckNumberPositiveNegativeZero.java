import java.util.Scanner;   

public class CheckNumberPositiveNegativeZero{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int []arr = new int[5];
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = input.nextInt();
        }

        for(int i = 0; i < arr.length; i++){
            int number = arr[i];
            if(number > 0){
                System.out.print("The number " + number + " is positive ");
                if(number % 2 == 0){
                    System.out.println("and even number.");
                }
                else{
                    System.out.println("and odd number.");
                }
            }
            else if(number < 0){
                System.out.println("The number " + number + " is negative");
            }
            else{
                System.out.println("The number " + number + " is zero");
            }
            
        }

        int firstElement = arr[0];
        int lastElement = arr[arr.length - 1];
        
        if(firstElement == lastElement){
            System.out.println("The first and last element are equal.");
        }
        else if(firstElement > lastElement){
            System.out.println("The first element is greater than the last element.");
        }
        else{
            System.out.println("The last element is greater than the first element.");
        }
    }
}