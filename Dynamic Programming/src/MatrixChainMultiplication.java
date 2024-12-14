public class MatrixChainMultiplication {
    /// Function give answer Using Recursion
    private static int mcm(int i, int j, int[] arr){
        if(i==j) return 0;
        int mincost = Integer.MAX_VALUE ;
        for(int k=i; k<j; k++){
            int x = arr[i] * arr[k+1] * arr[j+1] ;
            int tc = mcm(i,k,arr) + mcm(k+1,j,arr) + x;
            mincost = Math.min(mincost,tc) ;
        }
        return mincost ;
    }
    /// Function give answer Using DP Memoization
    private static int mcm1(int i, int j, int[] arr, int[][] dp){
        if(i==j) return 0;
        if(dp[i][j]!=0) return dp[i][j];
        int mincost = Integer.MAX_VALUE ;
        for(int k=i; k<j; k++){
            int x = arr[i] * arr[k+1] * arr[j+1] ;
            int tc = mcm1(i,k,arr,dp) + mcm1(k+1,j,arr,dp) + x;
            mincost = Math.min(mincost,tc) ;
        }
        return dp[i][j] = mincost ;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length ;

        // Method - 01 (Using Recursion)
        int ans = mcm(0,n-2,arr);
        System.out.println(ans);

        // Method - 02 (Using DP Memoization)
        int[][] dp = new int[n-1][n-1];
        int ans2 = mcm1(0,n-2,arr,dp);
        System.out.println(ans2);
    }
}
