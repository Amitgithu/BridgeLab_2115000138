import java.util.Scanner;

public class SumOfNaturalNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		if(number <= 0) {
			System.err.println("Not a Valid Natural Number.");
			System.exit(0);
		}
		
		SumOfNaturalNumbers obj = new SumOfNaturalNumbers();
		System.out.printf("Sum using recursion is %d", obj.findSumRecursion(number));
		System.out.printf("Sum using Formulae is %d", obj.findSumFormulae(number));
	}

	public int findSumRecursion(int number) {
		if(number == 1){
			return 1;
		}
		return number + findSumRecursion(number - 1);
	}
	
	public int findSumFormulae(int number) {
		return number * (number + 1) / 2;
	}
	
}