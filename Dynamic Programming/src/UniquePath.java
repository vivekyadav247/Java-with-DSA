import java.util.Scanner;

public class UniquePath {
    /// 2-D DP problem
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the m -: ");
        int m = sc.nextInt();
        System.out.print("Enter the n -: ");
        int n = sc.nextInt();
        dp = new int[m][n];
        // Calling Memoization Method
        System.out.println(paths(0,0,m,n));
        // Calling Tabulation Method
        System.out.println(path(m,n));
        System.out.println(24*20);
    }
    static int[][] dp ;
    /// Using Memoization method of DP
    public static int paths(int row, int col, int m, int n) {
        if(row>=m || col>=n) return 0;
        if(row==m-1 || col==n-1) return 1;
        if(dp[row][col]!=0) return dp[row][col];
        int rightways = paths(row,col+1,m,n);
        int leftways = paths(row+1,col,m,n);
        return dp[row][col] =rightways+leftways ;
    }
    // Using Tabulation Method of DP
    public static int path(int m, int n) {
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(i==0 || j==0) dp[i][j] = 1 ;
                else dp[i][j] = dp[i-1][j] + dp[i][j-1] ;
            }
        }
        return dp[m-1][n-1] ;
    }
}
