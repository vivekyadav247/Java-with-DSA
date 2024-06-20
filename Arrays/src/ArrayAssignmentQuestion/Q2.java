package ArrayAssignmentQuestion;

import java.util.Arrays;

public class Q2 {
    public static void main(String[] args) {
        int[] arr = {12,34,5,45,23,17,35};
        int n = arr.length;

        int mx = Integer.MIN_VALUE;
        int smx = Integer.MIN_VALUE ;
        for (int i = 0; i < n ; i++) {
            if(arr[i]>mx){
                smx = mx ;
                mx = arr[i];
            }
            else if(arr[i]>smx){
                smx = arr[i];
            }


        }
        System.out.println(smx);
    }
}
