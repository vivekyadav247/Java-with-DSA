import java.util.Scanner;

public class FindMaxValue {
    public static void main(String[] args) {
        // method 1
//        int[] arr = {10,8,430,12,5,56,3};
//        int n = arr.length;
//        int max = arr[0];
//        for(int i=0;i<n;i++){
//            if(arr[i]>max)
//                max = arr[i];
//        }
//        System.out.println(max);

        // methdo 2 ( THis is Perfect Method for all test case )
        int[] arr = {10,8,430,12,5,56,3};
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
//            if(arr[i]>max)
//                max = arr[i];
            max = Math.max(max,arr[i]); // We can also use this
        }
        System.out.println(max);
    }
}
