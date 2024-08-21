public class Subarray {
    public static void printsubarray(int[] arr, int i){
        if(i==arr.length) return ;
        for (int j = i; j < arr.length ; j++) {
            for (int k = i;k <= j ; k++) {
                System.out.print(arr[k]+" ");
            }
            System.out.println();
        }
        printsubarray(arr,i+1);
    }
    public static void main(String[] args) {
        int arr[]= {1,2,3};
        printsubarray(arr,0);
    }
}
