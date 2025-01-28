import java.util.Scanner;

public class CalculateSimpleInterest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double principal = input.nextDouble();
		double rate = input.nextDouble();
		double time = input.nextDouble();
		CalculateSimpleInterest simpleInterest = new CalculateSimpleInterest();
		double interest = simpleInterest.calculateSimpleInterest(principal, rate, time);
		System.out.printf("The Simple Interest is %.2f for Principal %.2f, Rate of Interest %.2f and Time %.2f", interest, principal, rate, time);
	}

	public double calculateSimpleInterest(double principal, double rate, double time) {
		double simpleInterest = (principal * rate * time) / 100;
		return simpleInterest;
	}
}