
import java.util.Scanner;

public class Factorial {
    public static int fact(int x){
        if(x==1 || x==0) return 1 ; // base case
        int ans = x * fact(x-1); // Call itself
        return ans ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n -: ");
        int x = sc.nextInt();
        System.out.println(fact(x));
    }
}
