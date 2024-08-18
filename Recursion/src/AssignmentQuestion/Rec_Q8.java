package AssignmentQuestion;

import java.util.Scanner;

public class Rec_Q8 {
    public static int ReverseNum(int n,int r){
        if(n==0) return r ;
        int ld = n%10 ;
        r = r*10 + ld ;
        return ReverseNum(n/10,r) ;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ReverseNum(n,0);
        System.out.println(ReverseNum(n,0));
    }
}
