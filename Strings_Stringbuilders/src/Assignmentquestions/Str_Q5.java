package Assignmentquestions;

import java.util.Scanner;

public class Str_Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int x[] = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            x[i] = (int)s.charAt(i);
            System.out.print(x[i]);
        }

    }
}
