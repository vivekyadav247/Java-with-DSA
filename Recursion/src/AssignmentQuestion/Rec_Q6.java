package AssignmentQuestion;

import java.util.Scanner;

public class Rec_Q6 {
    public static void countandsay(int n,String s,String ans){
        if(n==0){
            System.out.println(ans);
            return;
        }
        int i = 0 , j = 0;
        while(j<s.length()){
            if(s.charAt(i)==s.charAt(j)) j++ ;
            else{
                int l = j - i ;
                ans += l ;
                ans += s.charAt(i);
                i = j ;
            }
        }
        int l = j - i ;
        ans += l ;
        ans += s.charAt(i);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = "1";
        countandsay(n,s,"");
    }
}
