import java.util.Scanner;

public class DetermineTallestAndYoungestFriend{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String []names = new String[3];
        int []ages = new int[3];
        double []heights = new double[3];

        for(int i = 0; i < 3; i++){
            names[i] = input.next();
            ages[i] = input.nextInt();
            heights[i] = input.nextDouble();
        }

        int tallestIndex = 0;
        int youngestIndex = 0;

        for(int i = 1; i < 3; i++){
            if(heights[i] > heights[tallestIndex]){
                tallestIndex = i;
            }

            if(ages[i] < ages[youngestIndex]){
                youngestIndex = i;
            }
        }

        System.out.println("Tallest friend: " + names[tallestIndex]);
        System.out.println("Youngest friend: " + names[youngestIndex]);
    }
}