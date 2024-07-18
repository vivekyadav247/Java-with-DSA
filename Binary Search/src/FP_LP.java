public class FP_LP {
    // Firts Position and Last position
    public static boolean binarysearch(int[] arr , int target){
        int lo = 0 , hi = arr.length-1 ;
        boolean flag = false ;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid]==target){
                return true ;
            }
            else if(arr[mid]<target) lo = mid +1 ;
            else hi = mid -1 ;
        }
        return false ;
    }
    public static void main(String[] args) {
        int nums[] = {10,10,20,20,20,20,20,20,30,30,40,40};
        int target = 20 ;
        int ans[] = {-1,-1};
        // Method 1
//        int lb = nums.length ;
//        if(binarysearch(nums,target)==false){
//            System.out.println(ans);
//        }
//        else {
//            int lo = 0, hi = nums.length - 1;
//            while (lo <= hi) {
//                int mid = lo + (hi - lo) / 2;
//                if (nums[mid] >= target) {
//                    lb = Math.min(mid, lb);
//                    hi = mid - 1;
//                } else lo = mid + 1;
//            }
//            int ub = nums.length;
//            lo = 0;
//            hi = nums.length - 1;
//            while (lo <= hi) {
//                int mid = lo + (hi - lo) / 2;
//                if (nums[mid] > target) {
//                    ub = Math.min(mid, ub);
//                    hi = mid - 1;
//                } else lo = mid + 1;
//            }
//            ans[0] = lb;
//            ans[1] = ub - 1;
//            System.out.println(ans[0]+","+ans[1]);
//        }

        // Method - 2
        int fp = -1 ;
        int lo = 0, hi = nums.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo)/2;
            if (nums[mid] == target) {
                if(mid>0&&nums[mid-1]==nums[mid]) hi = mid -1 ;
                else { fp = mid ; break ; }
            }
            else if(nums[mid]<target) lo = mid + 1;
            else if(nums[mid]>target) hi = mid - 1;
        }
        int lp = -1 ;
        lo = 0 ; hi = nums.length-1;
        while (lo <= hi) {
            int mid = lo + (hi - lo)/2;
            if (nums[mid] == target) {
                if(mid+1<nums.length&&nums[mid+1]==nums[mid]) lo = mid + 1 ;
                else { lp = mid ; break ; }
            }
            else if(nums[mid]<target) lo = mid + 1;
            else if(nums[mid]>target) hi = mid - 1;
        }
        ans[0] = fp ;
        ans[1] = lp ;
        System.out.println(ans[0]+","+ans[1]);
    }
}
