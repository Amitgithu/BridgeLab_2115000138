import java.util.Scanner;

public class DivisionOfNumbers{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int divisor = input.nextInt();
		int[] result = findRemainderAndQuotient(number, divisor);
		System.out.printf("After dividing %d by %d, we get %d as quotient and %d as remainder.", number, divisor, result[0], result[1]);
	}

	public static int[] findRemainderAndQuotient(int number, int divisor){
		int quotient = number / divisor;
		int remainder = number % divisor;
		return new int[]{quotient, remainder};
	}
	
}