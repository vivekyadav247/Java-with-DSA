package Assignmentquestions;

import java.util.Scanner;

public class Str_Q8 {
    public static boolean isVowel(char c){
        if(c=='a' || c=='A') return true ;
        else if(c=='e' || c=='E') return true ;
        else if(c=='i' || c=='I') return true ;
        else if(c=='o' || c=='O') return true ;
        else if(c=='u' || c=='U') return true ;
        return false ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            if(isVowel(s.charAt(i))==true){
                for (int j = i; j < s.length() ; j++) {
                    if(isVowel(s.charAt(j))==true){
                        System.out.println(s.substring(i,j+1));
                    }
                    else {
                        break ;
                    }
                }

            }
        }
    }
}
