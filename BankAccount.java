public class BankAccount{
    private String accountHolderName;
    private final String accountNumber;
    private static String bankName = "State Bank of India";
    private static int totalAccounts = 0;

    public BankAccount(){
        this.accountHolderName = "";
        this.accountNumber = "";
    }

    public BankAccount(String accountHolderName, String accountNumber){
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    public String getAccountHolderName(){
        return this.accountHolderName;
    }

    public void setAccountHolderName(String newAccountHolderName){
        this.accountHolderName = newAccountHolderName;
    }

    public String getAccountNumber(){
        return this.accountNumber;
    }

    public static int getTotalAccounts(){
        return totalAccounts;
    }

    public static boolean isInstanceOf(BankAccount obj){
        return (obj instanceof BankAccount);
    }

    public void displayDetails(){
        System.out.println("Bank Name is : " + this.bankName);
        System.out.println("Account Holder Name is : " + this.accountHolderName);
        System.out.println("Account Number is : " + this.accountNumber);
        System.out.println("******************************************");
    } 
}

class Main{
    public static void main(String []args){
        BankAccount bank1 = new BankAccount("Amit Kumar", "9284-9297-5325-8673");
        if(isInstanceOf(bank1)){
            bank1.displayDetails();
        }

        BankAccount bank2 = new BankAccount("Karan Seangar", "8736-5639-9273-8024");
        if(isInstanceOf(bank2)){
            bank2.displayDetails();
        }


        System.out.println("Total Number of Account : " + bank2.getTotalAccounts());


    }
}