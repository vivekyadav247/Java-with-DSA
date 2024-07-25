public class PeakIndexInMountainArray {
    public static void main(String[] args) {
        int[] nums = {0,2,4,9,8,5,4,1,0};
        int lo = 1 , hi = nums.length - 1 ;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(nums[mid-1]<nums[mid] && nums[mid]>nums[mid+1]){
                System.out.println(mid);
                break;
            }
            else if(nums[mid-1]<nums[mid] && nums[mid]<nums[mid+1]){
                lo = mid+1;
            }
            else if(nums[mid-1]>nums[mid] && nums[mid]>nums[mid+1]){
                hi = mid -1;
            }
        }
    }
}
