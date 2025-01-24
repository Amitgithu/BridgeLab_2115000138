import java.util.Scanner;

class Power_Calculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int exponent = sc.nextInt();
        int power = Math.pow(base, exponent);
        System.out.println(base + " to the power " + exponent + " is : " + power);
        sc.close();
    }
}