public class Maximumswaps {
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
        int[] arr = {6,5,4,3,2,1};
        int n = arr.length;
        int swaps = 0 ;
        for (int i = 0; i < n-1; i++) {
            boolean flag = true;
            for (int j = 0; j < n-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                    flag = false ;
                    swaps++;
                }
            }
            if(flag==true){
                break ;
            }
        }
        print(arr);
        System.out.println(swaps);
    }

}
