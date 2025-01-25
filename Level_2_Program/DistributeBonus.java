import java.util.Scanner;

public class DistributeBonus{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double []oldSalary = new int[10];
        double []yearsOfService = new int[10];
        
        for(int i = 0; i < 10; i++){
            oldSalary[i] = input.nextInt();
            yearsOfService[i] = input.nextInt();
        }

        double []newSalary = new int[10];
        double []bonus = new int[10];

        for(int i = 0; i < 10; i++){
            if(yearsOfService[i] > 5){
                bonus[i] = oldSalary[i] * 5 / 100;
            }
            else{
                bonus[i] = oldSalary[i] * 2 / 100;
            }

            newSalary[i] = oldSalary[i] + bonus[i];
        }

        for(int i = 0; i < 10; i++){
            System.out.println("Employee " + (i + 1) + " has old salary " + oldSalary[i] + ", bonus " + bonus[i] + " new salary: " + newSalary[i]);
        }

    }
}