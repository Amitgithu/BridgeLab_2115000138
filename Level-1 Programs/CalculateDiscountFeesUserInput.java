import java.util.Scanner;

public class CalculateDiscountFeesUserInput{
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
	    int fee = input.nextInt();
        int discountPercent = input.nextInt();
        int discount = (fee * discountPercent) / 100;
        int discountedFees = fee - discount;
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedFees);
    }
}
