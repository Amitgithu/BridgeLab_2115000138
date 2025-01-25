import java.util.Scanner;

public class StudentCanVote{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int []arr = new int[10];
        
        for(int i = 0; i < 10; i++){
            arr[i] = input.nextInt();
        }

        for(int i = 0; i < arr.length; i++){
            int studentAge = arr[i];
            if(studentAge >= 18){
                System.out.println("The student with age the " + studentAge + " can vote");
            }
            else{
                System.out.println("The student with age the " + studentAge + " can not vote");
            }
            
        }
    }
}