import java.util.Scanner;

public class StairPath2 {
    public static int stair(int n){
        if(n==1 || n==3 || n==2) return n ;
        return stair(n-1) + stair(n-3);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of  Stairs: ");
        int n = sc.nextInt();
        System.out.println("Number of ways- "+stair(n));
    }
}
