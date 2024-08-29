import java.util.Scanner;

class Accounts{
    static Scanner sc = new Scanner(System.in);
    private double balance = 10000 ;
    public double CheckBalance(double balance){
        System.out.print("Enter the User Id  -: ");
        String User = sc.nextLine();
        System.out.print("Enter the Password -: ");
        String Pass = sc.nextLine();
        boolean x = Authentiation(User,Pass);
        balance = this.balance ;
        if(x==true) return balance ;
        else return 404;
    }
    public double Withdraw(double balance){
        System.out.print("Enter the User Id  -: ");
        String User = sc.nextLine();
        System.out.print("Enter the Password -: ");
        String Pass = sc.nextLine();
        boolean x = Authentiation(User,Pass);
        this.balance = this.balance-balance;
        if(x==true && this.balance>=0) return this.balance ;
        else return 404 ;
    }
    public double Deposit(double balance){
        System.out.print("Enter the User Id  -: ");
        String User = sc.nextLine();
        System.out.print("Enter the Password -: ");
        String Pass = sc.nextLine();
        boolean x = Authentiation(User,Pass);
        this.balance = this.balance+balance;
        if(x==true) return this.balance ;
        else return 404;
    }
    private boolean Authentiation(String User, String Password){
        if(User.equals("@vivekyadav") && Password.equals("122333")) return true ;
        else return false ;
    }

}
class BankingApp {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Accounts acc = new Accounts();

        System.out.println("Select the Option -: WITHDRAW - 1 :: DEPOSIT - 2 :: CHECK BALANCE - 3 :: ");
        int x = sc.nextInt();
        if(x==1){
            System.out.print("Enter the Withdrawal amount -: ");
            double y = sc.nextInt();
            double result = acc.Withdraw(y);
            if(result==404) System.out.println("Invalid Balance or User Id or Password");
            else System.out.println("Withdraw Successfully and remaining balance is :- "+result);
        }

        else if(x==2){
            System.out.print("Enter the Deposit amount -: ");
            double y = sc.nextInt();
            double result = acc.Deposit(y);
            if(result==404) System.out.println("Invalid User Id or Password");
            else System.out.println("Deposit Successfully and Total balance is :- "+result);
        }
        else if(x==3){
            double result = acc.CheckBalance(x);
            if(result==404) System.out.println("Invalid User Id or Password");
            else System.out.println("The account balance is :- "+result);
        }
        else
            System.out.println("Invalid Input");
    }

}
