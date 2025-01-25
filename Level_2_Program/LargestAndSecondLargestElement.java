import java.util.Scanner;

public class LargestAndSecondLargestElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;
        
        while (number != 0 && index < maxDigit) {
            digits[index] = number % 10;
            number /= 10;
            index++;
        }
        
        int largest = 0;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                largest = digits[i];
            }
        }
        
        int secondLargest = 0;

        for (int i = 0; i < index; i++) {
            if (digits[i] > secondLargest && digits[i] < largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("Largest digit is: " + largest);
        System.out.println("Second largest digit is: " + secondLargest);
       
    }
}