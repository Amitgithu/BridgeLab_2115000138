import java.util.Scanner;

public class CalculateGrade{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numberOfStudents = input.nextInt();
        int []physicMarks = new int[numberOfStudents];
        int []mathMarks = new int[numberOfStudents];
        int []chemistryMarks = new int[numberOfStudents];

        for(int i = 0; i < numberOfStudents; i++){
            physicMarks[i] = input.nextInt();
            mathMarks[i] = input.nextInt();
            chemistryMarks[i] = input.nextInt();
        }

        char []grades = new char[numberOfStudents];
        int []marks = new int[numberOfStudents];
        double []percentage = new double[numberOfStudents];

        for(int i = 0; i < numberOfStudents; i++){
            marks[i] = physicMarks[i] + mathMarks[i] + chemistryMarks[i];
            percentage[i] = marks[i] / 3;

            if(percentage[i] >= 80){
                grades[i] = 'A';
            }
            else if(percentage[i] >= 70 && percentage[i] < 80){
                grades[i] = 'B';
            }
            else if(percentage[i] >= 60 && percentage[i] < 70){
                grades[i] = 'C';
            }
            else if(percentage[i] >= 50 && percentage[i] < 60){
                grades[i] = 'D';
            }
            else if(percentage[i] >= 40 && percentage[i] < 50){
                grades[i] = 'E';
            }
            else{
                grades[i] = 'R';
            }
        }

        for(int i = 0; i < numberOfStudents; i++){
            System.out.println("Student " + (i + 1) + " has marks: " + marks[i] + ", percentage " + percentage[i] + " and grade " + grade[i]);
        }
    }
}