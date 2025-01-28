import java.util.Scanner;

public class EqualDivisionOfChocolates {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int totalChocolates = input.nextInt();
		int totalStudents = input.nextInt();
		int[] result = findRemainderAndQuotient(totalChocolates, totalStudents);
		System.out.printf("So, Every student get the %d chocolates and %d chocolates remained undistributed.", result[0], result[1]);
	}

	public static int[] findRemainderAndQuotient(int number, int divisor) {
		int quotient = number / divisor;
		int remainder = number % divisor;
		return new int[]{quotient, remainder};
	}
}