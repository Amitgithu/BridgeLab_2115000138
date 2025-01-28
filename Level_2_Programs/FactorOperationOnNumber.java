import java.util.Scanner;

public class FactorOperationOnNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int[] factors = findFactors(number);
		System.out.printf("The Factors of %d are: \n", number);
		for(int num : factors){
			System.out.printf("%d ", num);
		}
		
		FactorOperationOnNumber factor = new FactorOperationOnNumber();

		System.out.printf("The Sum of all factors is %d", factor.sumOfFactors(factors));

		System.out.printf("The Product of all factors is %d", factor.productOfFactors(factors));

		System.out.printf("The Sum of Squares of all factors is %d", factor.sumOfSquareOfFactors(factors));
	}

	public int sumOfFactors(int[] factors) {
		int sum = 0;
		for(int num : factors){
			sum += num;
		}
		return sum;
	}

	public static int[] findFactors(int number) {
		int count = 0;
		for(int i = 1; i < number; i++){
            if(number % i == 0){
                count++;
			}
		}
		
		int[] factors = new int[count];
		int index = 0;
		for(int i = 1; i < number; i++){
		    if(number % i == 0){
                factors[index++] = i;
			}
		}
		return factors;
	}
	
	
	public int sumOfSquareOfFactors(int[] factors) {
		int sumOfSquares = 0;
		for(int num : factors){
			sumOfSquares += (int)(Math.pow(num, 2));
		}
		return sumOfSquares;
	}

	public int productOfFactors(int[] factors) {
		int product = 1;
		for(int num : factors){
			product *= num;
		}
		return product;
	}
	
	
}