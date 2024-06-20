import java.util.Scanner;

public class compositenumb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        for(int i = 2; i<=n-1;i++){
            if(n%i==0) {
                System.out.println("Composite Number");
                break;
            }
            else System.out.println("Prime number");
        }
        if (n == 1) System.out.println("Neither Prime nor Composite");


    }
}
