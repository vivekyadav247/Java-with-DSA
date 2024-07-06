package Assignmentquestions;

import java.util.Arrays;
import java.util.Scanner;

public class Str_Q9 {
    public static boolean areanagram(char a[] , char b[]){
        if(a.length!=b.length){
            return false;
        }
        Arrays.sort(a);
        Arrays.sort(b);
        for (int k = 0; k < a.length; k++) {
            if(a[k]!=b[k]){
                return false ;
            }
        }
        return true ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s[] = new String[5];
        for (int i = 0; i < s.length; i++) {
            s[i] = sc.next();
        }
        int i = 0 , j = s.length - 1 ;
        int count = 0;
        while(i<j){

            char a[] = s[i].toCharArray();
            char b[] = s[j].toCharArray();
            areanagram(a,b);
            if(areanagram(a,b)== true){
                count++;
            }
            i++ ;
        }
        if(count==s.length-1){
            System.out.println("This is Anagram");
        }
        else{
            System.out.println("This is not Anagram");
        }
    }
}
