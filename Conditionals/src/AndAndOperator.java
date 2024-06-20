import java.util.Scanner;

public class AndAndOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        if(99<n && n<1000){
            System.out.println("This is Three Disit Number .");
        } else{
            System.out.println("This is not Three digit Number .");
        }
    }
}
