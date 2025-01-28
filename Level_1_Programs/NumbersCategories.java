import java.util.Scanner;

public class NumbersCategories {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		NumbersCategories obj = new NumbersCategories();
		int natureofNumber =  obj.natureofNumber(number);
		System.out.println(natureofNumber);
	}

	public int natureofNumber(int num) {
		if(num > 0){
			return 1;
		}
		else if(num < 0){
			return -1;
		}
		else{
			return 0;
		}
	}
}