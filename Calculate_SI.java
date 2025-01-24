import java.util.Scanner;   

class Calculate_SI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int principal = sc.nextInt();
        int rate = sc.nextInt();
        int time = sc.nextInt();
        int simpleInterest = (principal * rate * time) / 100;
        System.out.println("Simple Interest : " + simpleInterest);
        sc.close();
    }
}