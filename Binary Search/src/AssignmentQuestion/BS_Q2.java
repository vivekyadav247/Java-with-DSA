package AssignmentQuestion;

public class BS_Q2 {
    public static void main(String[] args) {
        int arr[] = {0,0,0,0,1,1,1};
        System.out.println(CountOnes(arr));
    }
    public static int CountOnes(int[] arr){
        int lo = 0 , hi = arr.length - 1 ;
        boolean flag = false;
        int idx = -1 ;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2 ;
            if(arr[mid]==1){
                idx = mid ;
                flag = true ;
                hi = mid-1 ;
            }
            else lo = mid + 1;
        }
        if(flag==true) return arr.length - idx;
        return 0;
    }
}
