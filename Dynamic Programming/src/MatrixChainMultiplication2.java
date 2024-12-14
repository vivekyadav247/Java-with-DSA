public class MatrixChainMultiplication2 {
    private static int MCM1(int i, int j, int[][] arr, int[][] dp){
        if(i==j) return 0;
        if(dp[i][j]!=0) return dp[i][j] ;
        int mincost = Integer.MAX_VALUE;
        for(int k=i; k<j; k++){
            int x = arr[i][0] * arr[k][1] * arr[j][1];
            int tc = MCM1(i,k,arr,dp) + MCM1(k+1,j,arr,dp) + x ;
            mincost = Math.min(mincost,tc);
        }
        return mincost ;
    }
    private static int MCM(int i, int j, int[][] arr) {
        if(i==j) return 0;
        int mincost = Integer.MAX_VALUE ;
        for(int k=i; k<j; k++){
            int x = arr[i][0] * arr[k+1][0] * arr[j][1] ;
            int tc = MCM(i,k,arr) + MCM(k+1,j,arr) + x ;
            mincost = Math.min(tc,mincost) ;
        }
        return mincost ;
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2},{2,3},{3,4},{4,5},{5,6}};
        int n = arr.length ;

        // Method - 1 (Using Recursion)
        int ans = MCM(0,n-1,arr);
        System.out.println(ans);

        // Method - 2 (Using DP Memoization)
        int[][] dp = new int[n][n];
        int ans1 = MCM1(0,n-1,arr,dp);
        System.out.println(ans1);
    }
}
