import java.util.Scanner;

public class PowerFunction_logarithmic {
    public static long pow(int a , int b){
        if(b==0) return 1 ; // base case
        long ans = pow(a,b/2); // call
        if(b%2==0) return ans * ans; // work
        else return ans * ans * a ; // work
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base-: ");
        int a = sc.nextInt();
        System.out.println("enter power: ");
        int b = sc.nextInt();
        pow(a,b);
        System.out.println(a+" raised to power "+b+" is "+pow(a,b));
    }
}
