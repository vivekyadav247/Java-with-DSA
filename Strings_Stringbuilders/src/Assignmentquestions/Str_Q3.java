package Assignmentquestions;

import java.util.Scanner;

public class Str_Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int i = 0 , j = s.length()-1;
        boolean x = false ;
        while (i<=j){
            if(s.charAt(i)==s.charAt(j)){
                x = true;
            }
            i++;
            j--;
        }
        if(x==true){
            System.out.println("This is Palindrome");
        }
        else{
            System.out.println("This is not Palindrome");
        }
    }
}
