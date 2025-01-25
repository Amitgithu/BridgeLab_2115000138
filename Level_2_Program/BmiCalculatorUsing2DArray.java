import java.util.Scanner;

public class BmiCalculatorUsing2DArray{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numberOfPerson = input.nextInt();
        double [][]personData = new double[numberOfPerson][3];
        String []weightStatus = new String[numberOfPerson];

        for(int i = 0; i < numberOfPerson; i++){
            personData[i][0] = input.nextDouble();
            personData[i][1] = input.nextDouble();
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);

            if(personData[i][2] < 18.5){
                weightStatus[i] = "Underweight";
            }
            else if(personData[i][2] >= 18.5 && personData[i][2] < 25){
                weightStatus[i] = "Normal";
            }
            else if(personData[i][2] >= 25 && personData[i][2] < 30){
                weightStatus[i] = "Overweight";
            }
            else{
                weightStatus[i] = "Obese";
            }
        }

        for(int i = 0; i < numberOfPerson; i++){
            System.out.println("Person " + (i + 1) + " has height " + personData[i][0] + ", weight " + personData[i][1] 
            + ", BMI " + personData[i][2] + " and is " + weightStatus[i]);
        }
    }
}