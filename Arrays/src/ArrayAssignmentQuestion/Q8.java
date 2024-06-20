package ArrayAssignmentQuestion;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,42,6,7};
        int n = arr.length ;
        int count2 = 0;
        for(int i=n-1;i>0;i--){
            int count1 = 0 ;
            for (int j=i-1;j>=0;j--){
                if(arr[i]>=arr[j]){
                    count1++ ;
                }
            }
            if(count1==i){
                count2++;
            }
        }
        if(count2==n-1){
            System.out.println("Array is sorted");
        }
        else {
            System.out.println("Array is not sorted");
        }

    }
}
