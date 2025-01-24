import java.util.Scanner;

public class MaximumHandshakes{
	public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numberOfStudents = input.nextInt();
        int totalHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
        System.out.printf("Total Handshakes is %d with the number of hands %d.", totalHandshakes, numberOfStudents);
    }
}