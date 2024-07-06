package Assignmentquestions;

import java.util.Scanner;

public class Str_Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int x = -1 , y = -1 ;
        for(int i = 0 ; i < s.length(); i++){
            int a = (int)s.charAt(i);
            if(a>=48 && a<=57){
                if(a>x){
                    y = x ;
                    x = a ;
                }
                else if(a!=x&&a>y){
                    y = a ;
                }
            }

        }
        if(y>47){
            y = y-48 ;
        }
        System.out.println(y);
    }
}
