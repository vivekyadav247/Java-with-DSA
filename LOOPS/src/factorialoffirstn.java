import java.util.Scanner;

public class factorialoffirstn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int fact = 1;
        int x = n-(n-1);
        while(n>=x){
            fact *= x;
            x++;
            System.out.println(fact);
        }

    }
}
