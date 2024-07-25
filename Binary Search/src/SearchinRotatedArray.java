public class SearchinRotatedArray {
    public static int bs(int nums[] ,int lo , int hi, int target){
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]>target) hi = mid - 1;
            else lo = mid + 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 7 ;
        // Method -1 with  pivot index
         int n = nums.length ;
         if(n<=2){
             for(int i=0;i<n;i++){
                 if(nums[i] == target) {
                     System.out.println(i);
                     break;
                 }
             }
         }
         int pidx = -1 ;
         int lo = 1 , hi = n-2 ;
         while(lo<=hi){
             int mid = lo+(hi-lo)/2;
             if(nums[mid-1] < nums[mid] && nums[mid] > nums[mid+1]){
                 pidx = mid ;
                 break;
             }
             else if(nums[mid-1] < nums[mid] && nums[mid] < nums[mid+1]){
                 if(nums[mid]>nums[n-1]) lo = mid + 1 ;
                 else hi = mid-1;

             }
             else if(nums[mid-1] > nums[mid] && nums[mid] < nums[mid+1]){
                 pidx = mid - 1 ;
                 break;
             }
         }
         if(pidx==-1){ //array was never rotated
             System.out.println(bs(nums,0,n-1,target));

         }
         int left = bs(nums,0,pidx,target);
         if(left!=-1){
             System.out.println(left);
         }
         else {
             int right = bs(nums, pidx + 1, n - 1, target);
             System.out.println(right);
         }

        // method - 2
//        int n = nums.length;
//        int lo = 0 , hi = n-1;
//        while(lo<=hi){
//            int mid = lo + (hi-lo)/2 ;
//            if(nums[mid]==target){
//                System.out.println(mid);
//                break;
//            }
//            else if(nums[mid]<=nums[hi]){ // I am in Right Sorted Array
//                if(nums[mid]<target && target<=nums[hi]) lo = mid + 1;
//                else hi = mid -1 ;
//            }
//            else{ // i am in left sorted Array
//                if(target>=nums[lo] && target<nums[mid]) hi = mid -1 ;
//                else lo = mid + 1 ;
//            }
 //       }
    }
}
