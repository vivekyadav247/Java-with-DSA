package Assignmentquestions;

import java.util.Scanner;

public class Str_Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = "";
        for (int i = s.length()-1; i >= 0 ; i--) {
            t += s.charAt(i);
        }
        System.out.println(s.concat(t));
    }
}
