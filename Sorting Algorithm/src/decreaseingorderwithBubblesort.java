public class decreaseingorderwithBubblesort {
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
        int[] arr = {3,1,2,5,4};
        int n = arr.length;
        // in this code after every pass the greatest element will be at start
//        for (int i = 0; i < n-1; i++) {
//            boolean x = true ;
//            for (int j = n-1; j > i; j--) {
//                if(arr[j]>arr[j-1]){
//                    swap(arr,j,j-1);
//                    x = false ;
//                }
//            }
//            if(x==true){
//                break ;
//            }
//        }
//        print(arr);

        // In this code after every pass the smallest number will be at end
        for (int i = 0; i < n-1; i++) {
            boolean x = true ;
            for (int j = 0; j < n-i-1; j++) {
                if(arr[j]<arr[j+1]){
                    swap(arr,j,j+1);
                    x = false ;
                }
            }
            if(x==true){
                break ;
            }
        }
        print(arr);
    }
}
