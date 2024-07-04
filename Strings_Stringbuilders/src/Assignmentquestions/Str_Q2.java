package Assignmentquestions;

import java.util.Scanner;

public class Str_Q2 {
    public static boolean IsVowels(char c){
        if(c=='a' || c=='A') return true ;
        else if(c=='e' || c=='E') return true ;
        else if(c=='i' || c=='I') return true ;
        else if(c=='o' || c=='O') return true ;
        else if(c=='u' || c=='U') return true ;
        return false ;
    }
    public static boolean Isconstatnt(char c){
        if(c>='a' &&c <='z' && IsVowels(c)==false){
            return true ;
        }
        return false ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0 ;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch>='A' && ch<='Z'){
                int x = (int)s.charAt(i);
                x = x+32 ;
                ch = (char)x;
            }
            if(Isconstatnt(ch)==true){
                count++;
            }
        }
        System.out.println(count);
    }
}
