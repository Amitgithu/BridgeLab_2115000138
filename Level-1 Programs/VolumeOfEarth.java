public class VolumeOfEarth{
	public static void main(String[] args){
		double radius = 6378;
		final double PI = Math.PI;
		double volumeInKilos = ((4 * PI * radius * radius * radius) / 3);
		double volumeInMiles = volumeInKilos / 1.6;
		System.out.println("The volume of earth in cubic kilometers is " + volumeInKilos + " and cubic miles is " + volumeInMiles);
	}
}
