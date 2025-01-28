import java.util.Scanner;

public class IsLeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();

        if (isLeapYear(year)){
            System.out.printf("The year %d is a Leap Year", year);
        }
        else {
            System.out.printf("The year %d is not a Leap Year", year);
        }
    }

    public static boolean isLeapYear(int year) {
        if ((year >= 1582) && (year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        }
        return false;
    }

}
