import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month = input.nextInt();
        int day = input.nextInt();
        if(isSpringSeason(month, day)){
			System.out.printf("Its a Spring Season");
        }
		else{
			System.out.printf("Not a Spring Season");
        }
    }

	public static boolean isSpringSeason(int month, int day) {
		if((month == 3 && day >= 20) || (month == 4 || month == 5) || (month == 6 && day <= 20)){
			return true;
        }
		return false;
	}
}