import java.util.Scanner;

public class HeightInFeetAndInches{
    public static vois main(String[]args){
        Scanner input = new Scanner(System.in);
        double height = input.nextInt();
        double heightInInches = height / 2.54;
        double heightInFoot = heightInInches / 12;
        System.out.println("Your Height in cm is " + height + " while in feet is " + heightInFoot + " and inches is " + heightInInches);

    }
}