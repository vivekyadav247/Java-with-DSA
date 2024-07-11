public class SelectionSort {
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
        int arr[] = {10,-4,20,1,8,-6};
        print(arr);
        int n = arr.length;
        // Selection sort //
        for (int i = 0; i < n-1 ; i++) {
            int min = Integer.MAX_VALUE ;
            int mindx = -1;
            for (int j = i; j < n; j++) {
                if(arr[j]<min){
                    min = arr[j];
                    mindx = j ;
                }
            }
            // swap i and mindx
            swap(arr,i,mindx);
        }
        print(arr);
    }
}
