class BankAccount{
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    public void displayAccountType(){
        System.out.println("Account Type: Bank Account");
    }

    @Override
    public void displayDetails(){
        System.out.println("Account Number : " + this.accountNumber);
        System.out.println("Account Balance : " + this.balance);
        System.out.println("****************************************");
    }
}

class SavingsAccount extends BankAccount{
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate){
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void displayAccountType(){
        System.out.println("Account Type: Savings Account");
    }

    @Override
    public void displayDetails(){
        this.displayAccountType();
        super.displayDetails();
        System.out.println("Interest Rate : " + this.interestRate);
        System.out.println("****************************************");
    }
    
}

class CheckingAccount extends BankAccount{
    private double withdrawalLimit;

    public CheckingAccount(String accountNumber, double balance, double withdrawalLimit){
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    public void displayAccountType(){
        System.out.println("Account Type: Checking Account");
    }

    @Override
    public void displayDetails(){
        this.displayAccountType();
        super.displayDetails();
        System.out.println("Withdrawal Limit : " + this.withdrawalLimit);
        System.out.println("****************************************");
    }
}

class FixedDepositAccount extends BankAccount{

    public FixedDepositAccount(String accountNumber, double balance){
        super(accountNumber, balance);
    }


    public void displayAccountType(){
        System.out.println("Account Type: Fixed Deposit Account");
    }

    @Override
    public void displayDetails(){
        this.displayAccountType();
        super.displayDetails();
        System.out.println("****************************************");
    }   
}

public class BankAccountTypes{
    public static void main(String[] args) {
        BankAccount account1 = new SavingsAccount("7929-2930-1939", 10000, 5.5);
        BankAccount account2 = new CheckingAccount("8573-2929-0928", 20000, 1000);
        BankAccount account3 = new FixedDepositAccount("9858-2938-0293", 50000);

        account1.displayDetails();
        account2.displayDetails();
        account3.displayDetails();
    }
}