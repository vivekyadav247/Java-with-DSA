import java.util.Arrays;

public class reversearrays {
    public static void main(String[] args) {
        int[] arr = {12,34,54,67,89,13,15,62,2};
        int n = arr.length;
        Arrays.sort(arr);
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        //reverse method 1
//        for(int i=0;i<n/2;i++){
//            int j = n-1-i;
//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j]=temp ;
//        }

        //reverse method 2
        int i=0, j = n-1 ;    //Full array is reverse
        // int i=1, j = n-4;   // part of array reverse
        while(i<=j){
            swap(arr , i , j );
            i++;
            j--;
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }

    public static void swap(int[] arr , int i , int j ) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]=temp ;
    }
}
