import java.util.Scanner;

public class Calculator{
	public static void main(Striung []args){
		Scanner input = new Scanner(System.in);
		float num1 = input.nextFloat();
		float num2 = input.nextFloat();
		float addition = num1 + num2;
		float subtraction = num1 - num2;
		float multiplication = num1 * num2;
		float division = num1 / num2;

		System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + num1 " and " + num2 +
 + " is "  + addition + ", " + subtraction + ", " + multiplication + ",  and " + division);
	}
}

