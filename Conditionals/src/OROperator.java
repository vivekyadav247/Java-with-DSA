import java.util.Scanner;

public class OROperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();

        if(n%5==0 || n%3==0){
            System.out.println("Number is divisible by both 5and 3 .");
        } else {
            System.out.println("Number isn't divisible by both 5 and 3 .");
        }
    }
}
