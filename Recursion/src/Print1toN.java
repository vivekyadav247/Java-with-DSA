import java.util.Scanner;

public class Print1toN {
    //static int n ; // we can send as global variable
    public static void print(int x , int n){
        if(x>n) return ; // base case
        System.out.println(x); // work
        print(x+1,n); // call
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n : ");
        int n = sc.nextInt();
        print(1,n);
    }
}
