import java.util.Scanner;

public class PrintSum1toN {
    // return type
//    public static int sum(int n){
//        if(n==0) return 0 ;
//        n += sum(n-1);
//        return n ;
//    }

    // Parameterised
    public static void Sum(int n , int s){
        if(n==0){
            System.out.println(s);
            return ;
        }
        Sum(n-1,s+n); // call and work at same time
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n : ");
        int n = sc.nextInt();
       // System.out.println(sum(n));
        Sum(n,0);
    }
}
