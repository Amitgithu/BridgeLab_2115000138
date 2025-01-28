import java.util.Scanner;

public class WindChillTemperature {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double temperature = input.nextDouble();
		double windSpeed = input.nextDouble();
		WindChillTemperature wct = new WindChillTemperature();
		double windChill = wct.calculateWindChill(temperature, windSpeed);
		System.out.printf("The Wind Chill temperature is %.2f at temperature %.2f and wind speed %.2f", windChill, temperature, windSpeed);
	}

	public double calculateWindChill(double temperature, double windSpeed) {
		double windChill = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
		return windChill;
	}
	
}