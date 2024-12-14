import java.util.Arrays;
public class SubsetSum {
    /// Using Recursion Approach
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
    /// Using DP Recursion + Memoization
    public static boolean subsets(int i, int[] arr, int target, int[][] dp) {
        if (i<0) {
            if(target==0) return true;
            else return false;
        }
        if (dp[i][target]!=-1) return (dp[i][target]==1);
        boolean ans = false;
        boolean skip = subsets(i-1,arr,target,dp);
        if (target-arr[i]<0) ans = skip;
        else {
            boolean pick = subsets(i-1,arr,target-arr[i],dp);
            ans = pick || skip;
        }
        if(ans) dp[i][target] = 1;
        else dp[i][target] = 0;
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {8, 1, 2, 7};
        int target = 6;
        int n = arr.length ;
        /// Method -1 (Only Recursion)
        //System.out.println(subset(0, arr, target));

        /// Method -2 (Recursion + Memoization)
        int[][] dp = new int[n][target+1];
        for (int[] nums : dp){
            Arrays.fill(nums,-1);
        }
        System.out.println(subsets(n-1,arr,target,dp));

        /// Reset Array element to 0
        for(int[] nums : dp) Arrays.fill(nums,0);

        /// Method - 03 (DP Tabulation)
        for(int i=0; i<n; i++){
            for(int j=0; j<target+1; j++){
                boolean ans = false;
                boolean skip = (i>0) ? (dp[i-1][j]==1) : (j==0)? true : false;
                if (j-arr[i]<0) ans = skip;
                else {
                    boolean pick = (i>0) ? (dp[i-1][j-arr[i]]==1) : (j==0)? true : false;
                    ans = pick || skip;
                }
                if(ans) dp[i][j] = 1;
                else dp[i][j] = 0;
            }
        }
        System.out.println((dp[n-1][target]==1));
    }
}
