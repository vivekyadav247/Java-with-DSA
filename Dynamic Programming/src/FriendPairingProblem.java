import java.util.Arrays;
import java.util.Scanner;

public class FriendPairingProblem {
    static long[] dp ;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the N number of friends -: ");
        int n = sc.nextInt();
        dp = new long[n+1];
        Arrays.fill(dp,-1);
        System.out.println(pair(n));
        System.out.println(pairs(n));
    }
    /// Memoization Technique in Dp
    public static long pair(int n){
        if(n<=2) return n;
        if(dp[n]!=-1) return dp[n];
        return dp[n] = pair(n-1) + (n-1)*pair(n-2) ;
    }
    /// Tabulation Method of DP
    public static long pairs(int n){
        dp = new long[n+1];
        dp[0] = 0 ; dp[1] = 1 ; dp[2] = 2;
        for(int i=3; i<=n; i++){
            dp[i] = dp[i-1] + ((i-1)*dp[i-2]);
        }
        return dp[n];
    }
}
