import java.util.Scanner;

public class RemoveDuplicatesFromString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String modifiedString = removeDuplicates(str);
        System.out.printf("After removing duplicates from \"%s\", the modified string is \"%s\"", str, modifiedString);
        input.close();
    }

    private static String removeDuplicates(String str) {
        String modifiedString = "";
        for(int i = 0;i < str.length();i++){
            char ch = str.charAt(i);
            if(modifiedString.indexOf(ch) == -1){
                modifiedString += ch;
            }
        }
        return modifiedString;
    }
    
}
