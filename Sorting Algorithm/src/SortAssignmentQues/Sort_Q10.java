package SortAssignmentQues;

import java.util.Scanner;

public class Sort_Q10 {
    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void printstring(StringBuilder s){
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Only Enter lower case for Right Answer : ");
        StringBuilder s = new StringBuilder(sc.next());
        int arr[] = new int[s.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)s.charAt(i);
        }
        print(arr);
        for (int i = 0; i < arr.length-1; i++) {
            boolean x = false;
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                    x = true ;
                }
            }
            if(x==false){
                break ;
            }
        }
        print(arr);
        for (int i = 0; i < arr.length; i++) {
            s.setCharAt(i,(char)arr[i]);
        }
        printstring(s);


    }
}
