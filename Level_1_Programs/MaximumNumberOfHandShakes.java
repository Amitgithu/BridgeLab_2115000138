import java.util.Scanner;

public class MaximumNumberOfHandShakes {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int totalStudents = input.nextInt();
		MaximumNumberOfHandShakes hs = new MaximumNumberOfHandShakes();
		int possibleHandshakes = hs.handshakes(totalStudents);
		System.out.printf("There are only %d Handshakes possible between %d students.", possibleHandshakes, totalStudents);
	}

	public int handshakes(int student) {
		int possibleHandshakes = student * (student - 1) / 2;
		return possibleHandshakes;
	}
	
}
