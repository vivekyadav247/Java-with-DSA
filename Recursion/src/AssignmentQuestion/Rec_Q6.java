package AssignmentQuestion;

import java.util.Scanner;

public class Rec_Q6 {
    public static void countandsay(int x,int n,String s){
        if(x==n || n==1){
            System.out.println(s);
            return ;
        }
        String ans="";
        char[] ch = s.toCharArray();
        int i = 0 , j = 0;
        while(j<ch.length){
            if(ch[i]==ch[j]) j++ ;
            else{
                int l = j - i ;
                ans += l ;
                ans += ch[i];
                i = j ;
            }
        }
        int l = j - i ;
        ans += l ;
        ans += ch[i];
        s=ans;
        countandsay(x+1,n,s);


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = "1";
        countandsay(1,n,s);
    }
}
