import java.util.Scanner;

class Conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int celsius = sc.nextInt();
        int fehrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Temperature in Fehrenheit : " + fehrenheit);
        sc.close();
    }
}