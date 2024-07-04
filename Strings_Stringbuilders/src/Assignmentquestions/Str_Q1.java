package Assignmentquestions;

import java.util.Scanner;

public class Str_Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Method - 1 This Contain Lot of Spacess
//        String s = sc.nextLine();
//        String t = "";
//        for (int i = 0; i < s.length() ; i++) {
//            if(i%2==0){
//                t += "#";
//            }
//            else {
//                t += s.charAt(i);
//            }
//        }
//        System.out.println(t);

//        Method - 2 This if efficient method and much less space use
        StringBuilder sb = new StringBuilder(sc.nextLine());
        for (int i = 0; i < sb.length(); i++) {
            if(i%2==0) sb.setCharAt(i,'#');
        }
        System.out.println(sb);
    }
}
