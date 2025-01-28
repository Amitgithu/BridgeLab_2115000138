import java.util.Scanner;

public class TotalRoundsNeeded {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter all sides of triangular park in meters: ");
		int side1 = input.nextInt();
		int side2 = input.nextInt();
		int side3 = input.nextInt();
		int perimeter = side1 + side2 + side3;
		TotalRoundsNeeded totalRounds = new TotalRoundsNeeded();
		double completedRounds = totalRounds.rounds(perimeter);
		System.out.printf("For 5 kms, athlete need to run %.2f rounds of a given dimensions Triangular Park", completedRounds);
	}

	public double rounds(int perimeter) {
		int totalRounds = (5000 / perimeter);
		return totalRounds;
	}
}