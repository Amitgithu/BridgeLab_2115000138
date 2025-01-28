import java.util.Scanner;

public class FindYoungestTallestInAmarAkbarAnthony {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] age = new int[3];
        double[] height = new double[3];

        for (int i = 0; i < 3; i++) {
            age[i] = input.nextInt();
            height[i] = input.nextDouble();
        }

        System.out.printf("The youngest friend is %d years old\n", findYoungest(age));
        System.out.printf("The tallest friend is %.2f cm tall\n", findTallest(height));
    }

    public static int findYoungest(int[] age) {
        int minAge = age[0];
        for (int i = 1; i < age.length; i++) {
            if (age[i] < minAge) {
                minAge = age[i];
            }
        }
        return minAge;
    }

    public static double findTallest(double[] height) {
        double maxAge = height[0];
        for (int i = 1; i < height.length; i++) {
            if (height[i] > maxAge) 
                maxAge = height[i];
        }
        return maxAge;
    }

}

