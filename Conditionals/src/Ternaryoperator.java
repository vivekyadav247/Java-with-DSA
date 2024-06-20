import java.util.Scanner;

public class Ternaryoperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int x = sc.nextInt();

        System.out.println((x%2==0) ? "Even" : "Odd");
    }
}
