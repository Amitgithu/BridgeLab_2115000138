import java.util.Scanner;

public class AreaOfTriangle{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		double base = input.nextDouble();
		double height = input.nextDouble();
		double areaInCentimeter = (base * height) / 2;
		double areaInInches = areaInCentimeter / 2.54;
		System.out.println("Area of Triangle in square inches " + areaInInches + " and in square centimeters " + areaInCentimeter);
	}
}
