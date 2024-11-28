import java.util.Arrays;

public class SubsetSum {
    public static boolean subset(int i, int[] arr, int target) {
        if (i == arr.length) {
            if (target == 0) return true;
            else return false;
        }
        boolean skip = subset(i + 1, arr, target);
        if (target - arr[i] < 0) return skip; // Only valid for +ve numbers
        boolean pick = subset(i+1,arr,target-arr[i]);
        return pick || skip;
    }
    public static boolean subsets(int i, int[] arr, int target, int[][] dp) {
        if (i==arr.length) {
            if(target==0) return true;
            else return false;
        }
        if (dp[i][target]!=-1) return (dp[i][target]==1);
        boolean ans = false;
        boolean skip = subsets(i+1,arr,target,dp);
        if (target-arr[i]<0) ans = skip;
        else {
            boolean pick = subsets(i+1,arr,target-arr[i],dp);
            ans = pick || skip;
        }
        if(ans) dp[i][target] = 1;
        else dp[i][target] = 0;
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {8, 1, 2, 4};
        int target = 6;
        /// Method -1 (Only Recursion)
        //System.out.println(subset(0, arr, target));

        /// Method -2 (Recursion + Memoization)
        int[][] dp = new int[arr.length][target+1];
        for (int[] nums : dp){
            Arrays.fill(nums,-1);
        }
        System.out.println(subsets(0,arr,target,dp));
    }
}
