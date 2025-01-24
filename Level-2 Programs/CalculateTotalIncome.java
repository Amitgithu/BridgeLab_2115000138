import java.util.Scanner;

public class CalculateTotalIncome{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int salary = input.nextInt();
        int bonus = input.nextInt();
        int totalIncome = salary + bonus;
        System.out.printf("The salary is INR %d and bonus is INR %d. Hence Total Income is INR %d.", salary,bonus, totalIncome);
    }
}