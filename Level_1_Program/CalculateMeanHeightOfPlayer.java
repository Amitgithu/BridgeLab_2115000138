import java.util.Scanner;

public class CalculateMeanHeightOfPlayer{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double []height = new double[11];
        double totalHeight = 0;
        double meanHeight = 0;
        
        for(int i = 0; i < height.length; i++){
            height[i] = input.nextDouble();
        }

        for(int i = 0; i < height.length; i++){
            totalHeight += height[i];
        }

        meanHeight = totalHeight / height.length;

        System.out.println("The mean height of the players is " + meanHeight);
    }
}