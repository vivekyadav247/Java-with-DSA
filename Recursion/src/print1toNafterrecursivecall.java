import java.util.Scanner;

public class print1toNafterrecursivecall {
    public static void print(int n){
        if(n==0) return ; // base case
        print(n-1); // call
        System.out.print(n+" "); // work
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n : ");
        int n = sc.nextInt();
        print(n);
    }
}
