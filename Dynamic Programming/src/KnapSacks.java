import java.util.Scanner;
public class KnapSacks {
    /// Using Only Recursion
    public static int profit(int i, int[] val, int[] wt, int cap){
        if(i==wt.length) return 0;
        int skip = profit(i+1,val,wt,cap);
        if(wt[i]>cap) return skip;
        int take = val[i] + profit(i+1,val,wt,cap-wt[i]) ;
        return Math.max(take,skip);
    }
    /// Using Dp (Recursion + Memoization)
    public static int profits(int i, int[] val, int[] wt, int cap,int[][] dp){
        if(i==wt.length) return 0;
        if(dp[i][cap]!=0) return dp[i][cap] ;
        int skip = profits(i+1,val,wt,cap,dp);
        if(wt[i]>cap) return dp[i][cap] = skip;
        int take = val[i] + profits(i+1,val,wt,cap-wt[i],dp) ;
        return dp[i][cap] = Math.max(take,skip);
    }
    public static void main(String[] args) {
        int[] val = {5,1,3,9,16};
        int[] wt = {1,6,2,8,10} ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Capacity -: ");
        int cap = sc.nextInt();

        // Method - 1 (Using Only Recursion)
        System.out.println(profit(0,val,wt,cap));

        // Method - 2 (Using Dp (Recursion + Memoization))
        int n = wt.length;
        int[][] dp = new int[n][cap+1];
        System.out.println(profits(0,val,wt,cap,dp));
    }
}
