import java.util.Scanner;

public class ThreeNumbersComparision{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		int[] result = findSmallestAndLargest(num1, num2, num3);
		System.out.printf("From the three numbers, %d is the largest while %d is the smallest number.", result[0], result[1]);
	}

	public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
		int largest = Math.max(number1, Math.max(number2, number3));
		int smallest = Math.min(number1, Math.min(number2, number3));
		return new int[]{largest, smallest};
	}
}