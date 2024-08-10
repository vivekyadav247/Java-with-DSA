package AssignmentQuestion;

public class BS_Q10 {
    public static void main(String[] args) {
         int arr[] = {2,5,6,0,0,1,2};
         int target = 1 ;
         BSinRotatedArray(arr,target);
        System.out.println(BSinRotatedArray(arr,target));
    }
    public static boolean BSinRotatedArray(int[] arr, int x){
        int lo = 0 , hi = arr.length -1 ;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid]==x) return true ;
            else if(arr[mid]>arr[mid+1]){
                if(arr[lo]<x) lo = mid + 1 ;
                else hi = mid - 1;
            }
            else{
                if(arr[mid]<x) lo = mid + 1 ;
                else hi = mid - 1;
            }
        }
        return false;
    }
}
