package AssignmentQuestion;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Rec_Q2 {
    public static int Stair(int n ){
        if(n==1 || n==2) return n ;
        if(n==3) return n+1;
        return Stair(n-1) + Stair(n-2) +  Stair(n-3) ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n :- ");
        int n = sc.nextInt();
        Stair(n);
        System.out.println(Stair(n));
    }
}
