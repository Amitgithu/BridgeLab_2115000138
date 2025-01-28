import java.util.Scanner;

public class MaximumNumberOfHandShakes2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numberOfStudents = input.nextInt();
		MaximumNumberOfHandShakes handshakes = new MaximumNumberOfHandShakes();
		int possibleHandshakes = handshakes.handshakes(numberOfStudents);
		System.out.printf("There are only %d Handshakes possible between %d students.", possibleHandshakes, numberOfStudents);
	}

	public int handshakes(int student) {
		int possibleHandshakes = student * (student - 1) / 2;
		return possibleHandshakes;
	}
}
