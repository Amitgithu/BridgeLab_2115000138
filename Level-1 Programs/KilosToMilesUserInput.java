import java.util.Scanner;

public class KilosToMilesUserInput{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		double distanceInKm = sc.nextDouble();
		double distanceInMiles = km / 1.6;
		System.out.println("The total miles is " + distanceInMiles + " mile for the given " + distanceInKm + " km");
		input.close();
	}
}

