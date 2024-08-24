public class QuickSort {
    public static void print(int[] arr){
    for (int ele : arr ) {
        System.out.print(ele+" ");
    }
    System.out.println();
}
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i] ;
        arr[i] = arr[j] ;
        arr[j] = temp ;
    }
    public static int partition(int[] arr , int lo , int hi ){
        int pivtele = arr[lo] , pivtidx = lo ;
        int smallercount = 0 ;
        for (int i = lo+1; i <= hi; i++) {
            if(arr[i]<=pivtele) smallercount++;
        }
        int correctidx = pivtidx+smallercount;
        swap(arr,pivtidx,correctidx);
        // partition
        int i = lo , j = hi;
        while(i<correctidx && j>correctidx){
            if(arr[i]<=pivtele) i++;
            else if(arr[j]>pivtele) j--;
            else if(arr[i]>pivtele && arr[j]<=pivtele){
                swap(arr,i,j);
            }
        }
        return correctidx ;
    }

    public static void quicksort(int[] arr,int lo , int hi){
        if(lo>=hi) return ;
        // idx is correctindex
        // partition function return partition of smaller and greater element from pivtelement
        int idx = partition(arr,lo,hi);
        quicksort(arr,lo,idx-1);
        quicksort(arr,idx+1,hi);
    }
    public static void main(String[] args) {
        int[] arr = {4,9,7,1,2,3,6,5,8};
        print(arr);
        quicksort(arr,0,arr.length-1);
        print(arr);
    }
}
