import java.util.Scanner;

public class CalculateGradeUsing2DArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfStudents = input.nextInt();
        int[][] marks = new int[numberOfStudents][3]; 
        char[] grades = new char[numberOfStudents];
        double[] percentage = new double[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            marks[i][0] = input.nextInt(); 
            marks[i][1] = input.nextInt(); 
            marks[i][2] = input.nextInt();
        }

        for (int i = 0; i < numberOfStudents; i++) {
            int totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = totalMarks / 3.0;

            if (percentage[i] >= 80) {
                grades[i] = 'A';
            } 
            else if (percentage[i] >= 70 && percentage[i] < 80) {
                grades[i] = 'B';
            } 
            else if (percentage[i] >= 60 && percentage[i] < 70) {
                grades[i] = 'C';
            } 
            else if (percentage[i] >= 50 && percentage[i] < 60) {
                grades[i] = 'D';
            } 
            else if (percentage[i] >= 40 && percentage[i] < 50) {
                grades[i] = 'E';
            } 
            else {
                grades[i] = 'R';
            }
        }

         for(int i = 0; i < numberOfStudents; i++){
            System.out.println("Student " + (i + 1)  + "has percentage " + percentage[i] + " and grade " + grade[i]);
        }
    }
}