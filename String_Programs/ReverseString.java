import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		String reverseStr = reverse(str);
		System.out.printf("Reverse String is %s", reverseStr);
		input.close();
	}

	private static String reverse(String str) {
		 String reverseString = “”;
            for(int i = str.length() - 1;i >= 0;i—-){
                char ch = str.charAt(i);
                reverseString += ch;
            }
		return reverseString;
	}
	
}