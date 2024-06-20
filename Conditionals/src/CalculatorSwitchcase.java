import java.util.Scanner;

public class CalculatorSwitchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int x = sc.nextInt();
        System.out.print("Enter Operators : ");
        char op = sc.next().charAt(0);
        System.out.print("Enter 2nd Number : ");
        int y = sc.nextInt();

        switch (op){
            case '+':
                System.out.println(x+y);
                break ;
            case '-':
                System.out.println(x-y);
                break;
            case '*':
                System.out.println(x*y);
                break;
            case '/':
                System.out.println(x/y);
                break;
            default:
                System.out.println("Invalid Operator");
        }
    }
}
