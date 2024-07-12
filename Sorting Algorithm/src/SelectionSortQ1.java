public class SelectionSortQ1 {
    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        // Q. Sort a given array in increasing order using selection  sort,
        //  but in each pass, put the kth maximum element at the right position
        int[] arr = {2,5,3,4,1};
        int n = arr.length ;
        for (int i = n-1 ; i > 0; i--) {
            int max = Integer.MIN_VALUE;
            int mxidx = -1 ;
            for (int j = i; j >= 0; j--) {
                if(arr[j]>max){
                    max = arr[j];
                    mxidx = j ;
                }
            }
            // swap the max number from end position
            swap(arr,i,mxidx);
        }
        print(arr);
    }
}
