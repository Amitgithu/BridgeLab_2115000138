import java.util.Scanner;

public class BmiCalculatorUsingArray{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numberOfPerson = input.nextInt();
        double []heights = new double[numberOfPerson];
        double []weights = new double[numberOfPerson];
        double []bmi = new double[numberOfPerson];
        String []weightStatus = new String[numberOfPerson];


        for(int i = 0; i < numberOfPerson; i++){
            heights[i] = input.nextDouble();
            weights[i] = input.nextDouble();
            bmi[i] = weights[i] / (heights[i] * heights[i]);
            if(bmi[i] < 18.5){
                weightStatus[i] = "Underweight";
            }
            else if(bmi[i] >= 18.5 && bmi[i] < 25){
                weightStatus[i] = "Normal";
            }
            else if(bmi[i] >= 25 && bmi[i] < 30){
                weightStatus[i] = "Overweight";
            }
            else{
                weightStatus[i] = "Obese";
            }
        }

        for(int i = 0; i < numberOfPerson; i++){
            System.out.println("Person " + (i + 1) + " has height " + height[i] + ", weight " + weight[i] 
            + ", BMI " + bmi[i] + " and is " + weightStatus[i]);
        }
    }
}