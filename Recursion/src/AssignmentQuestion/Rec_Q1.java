package AssignmentQuestion;

import java.util.Scanner;

public class Rec_Q1 {
    public static void OddSum(int a , int b , int sum ){
        if(b==a-1){
            System.out.println(sum);
            return ;
        }
        if(b%2==0){
            OddSum(a,b-1,sum);
        }
        else {
            OddSum(a , b-1, sum + b);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a:- ");
        int a = sc.nextInt();
        System.out.print("Enter b:- ");
        int b = sc.nextInt();
        OddSum(a,b,0);
    }
}
