import java.util.Scanner;

class Area_Of_Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        int area = Math.PI * radius * radius;
        System.out.println("Area of Circle is : " + area);
        sc.close();
    }
}