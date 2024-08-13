import java.util.Scanner;

public class Printnto1 {
    public static void print(int n){
        if(n==0) return ; // base case
        System.out.print(n+" "); // call
        print(n-1); // work
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n : ");
        int n = sc.nextInt();
        print(n);
    }
}
