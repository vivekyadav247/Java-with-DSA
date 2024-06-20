import java.util.Scanner;

public class If_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int x = sc.nextInt();
        if (x%2==0)
            System.out.println("Number is Even .");
        else
            System.out.println("Number is Odd .");
    }
}
