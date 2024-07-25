public class SmallestDivisor {
    public static boolean Isless(int mid, int arr[] , int t){
        int sum = 0 ;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%mid==0) sum += arr[i]/mid ;
            else sum += arr[i]/mid + 1 ;
        }
        if(sum<=t) return true ;
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,5,9};
        int threshold = 6;
        int mx = -1;
        for(int i = 0 ; i < nums.length ; i++){
            mx = Math.max(mx,nums[i]);
        }
        int d = 1 ;
        int lo = 1 , hi = mx ;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2 ;
            if(Isless(mid,nums,threshold) == true){
                d = mid ;
                hi = mid - 1 ;
            }
            else lo = mid + 1;
        }
        System.out.println(d);
    }
}
