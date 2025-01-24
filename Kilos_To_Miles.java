import java.util.Scanner;  

class Kilos_To_Miles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double kilometer = sc.nextDouble();
        double miles = kilometer * 0.621371;
        System.out.println("Miles : " + miles);
        sc.close();
    }
}