package SortAssignmentQues;

public class Sort_Q13 {
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
        int[] arr = {3,4,5,7,6,2};
        int k = 4 ;
        for (int i = 0; i < arr.length-1; i++) {
            int j = i+1;
            while(j>0 && arr[j]<arr[j-1]){
                swap(arr,j,j-1);
                j-- ;
            }
        }
        print(arr);
        System.out.println(arr[k-1]);
    }
}
