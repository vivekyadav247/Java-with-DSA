import java.util.Scanner;

// Make a function which calculates 'a' raised to the power 'b'
// using Recursion
public class PowerFunction {
    public static int pow(int a , int b){
        if(b==0) return 1 ; // base case
        return a*pow(a,b-1); // call and work
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
