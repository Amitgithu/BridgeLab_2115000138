import java.util.Scanner;

public class SumOfNaturalNumbersUsingLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
		if(number <= 0) {
			System.err.println("Invalid Natural Number");
			System.exit(0);
		}
        int sum = computeSum(number);
		System.out.printf("The sum of %d natural numbers using loop is %d\n", number, sum);
    }

	public static int computeSum(int num) {
		int sum = 0;
		for(int i = 1; i <= num; i++){
			sum += i;
		}
		return sum;
	}
}