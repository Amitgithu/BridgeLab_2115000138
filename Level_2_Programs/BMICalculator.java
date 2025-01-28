import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] arr = new double[10][3];
        for (int i = 0; i < 10; i++) {
            arr[i][0] = input.nextDouble();
            arr[i][1] = input.nextDouble();
            arr[i][2] = calculateBMI(arr[i][0], arr[i][1]);
        }

        String[] status = findBMIStatus(arr);
        for (int i = 0; i < 10; i++){
            System.out.printf("Person %d: Weight %.2f kg, Height %.2f cm, BMI %.2f, Status %s\n", i + 1, arr[i][0], arr[i][1], arr[i][2], status[i]);
        }
    }

    public static double calculateBMI(double weight, double height) {
        return weight / ((height / 100) * (height / 100));
    }

    public static String[] findBMIStatus(double[][] arr) {
        String[] weightStatus = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (arr[i][2] >= 18.5 && arr[i][2] < 25) {
                weightStatus[i] = "Normal";
            } else if (arr[i][2] >= 25 && arr[i][2] < 30) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
        return weightStatus;
    }

}

 