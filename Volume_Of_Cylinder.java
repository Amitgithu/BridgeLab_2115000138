import java.util.Scanner;

class Volume_Of_Cylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        int height = sc.nextInt();
        int volume = Math.PI * radius * radius * height;
        System.out.println("Volume of Cylinder is : " + volume);
        sc.close();
    }
}