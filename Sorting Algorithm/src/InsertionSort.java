public class InsertionSort {
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
        int[] arr = {2,5,3,4,1};
        int n = arr.length ;

        // using for and nested for loop Insertion sort
//        for (int i = 0; i < n-1 ; i++) {
//            for (int j = i+1; j > 0; j--) {
//                if(arr[j]<arr[j-1]){
//                    swap(arr,j,j-1);
//                }
//                else
//                    break;
//            }
//        }

        // Using for and nested while loop Insertion sort
        // Standard code of Insertion sort
        for (int i = 0; i < n-1 ; i++) {
            int j = i+1 ;
            while(j>0 && arr[j]<arr[j-1]){
                swap(arr,j,j-1);
                j-- ;
            }
        }
        print(arr);
    }
}
