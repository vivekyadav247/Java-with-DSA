package AssignmentQuestion;

import java.util.Scanner;

public class Rec_Q15 {
    public static String binarynumb(int n){
        if(n==0){
            return "" ;
        }
        return binarynumb(n/2) + (n%2) ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        binarynumb(n);
        System.out.println(binarynumb(n));
    }
}
