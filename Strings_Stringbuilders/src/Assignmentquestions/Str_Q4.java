package Assignmentquestions;

import java.util.Scanner;

public class Str_Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any String : ");
        StringBuilder sb = new StringBuilder(sc.nextLine());
        if(sb.length()%2!=0){
            System.out.println("Please enter string of Even Length ");
        }
        int i = sb.length()/2, j = sb.length()-1;
        while(i<=j){
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(i));
            sb.setCharAt(j, temp);
            i++ ;
            j--;
        }
        System.out.println(sb);
    }
}
