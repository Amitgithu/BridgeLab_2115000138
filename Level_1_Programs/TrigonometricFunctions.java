import java.util.Scanner;

public class TrigonometricFunctions {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double angle = input.nextDouble();
		TrigonometricFunctions trigoOperation = new TrigonometricFunctions();
        double[] result = trigoOperation.calculateTrigonometricFunctions(angle);

        System.out.printf("Sine: %.4f", result[0]);
        System.out.printf("Cosine: %.4f", result[1]);
        System.out.printf("Tangent: %.4f", result[2]);
    }

    public double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        double sin = Math.sin(radians);
        double cos = Math.cos(radians);
        double tan = Math.tan(radians);
        return new double[] { sin, cos, tan };
    }
}
