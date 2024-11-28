import java.util.Arrays;

public class PathsCheckpoints {
    /// Paths which passes through certain checkpoints
    static int[][] dp;
    public static void main(String[] args) {
        int[][] arr = new int [9][7];
        int m = arr.length;
        int n = arr[0].length;
        for(int[] nums : arr){
            Arrays.fill(nums,0);
        }
        int firstcpi = 3 , firstcpj = 1;
        int secondcpi = 6, secondcpj = 4;
        dp = new int[m][n];
        int a = path(0, 0, firstcpi+1, firstcpj+1);
        System.out.println(a);
        int b = path(firstcpi, firstcpj, secondcpi+1, secondcpj+1);
        System.out.println(b);
        int c = path(secondcpi, secondcpj, m, n);
        System.out.println(c);
    }
    public static int path(int r, int c, int m, int n) {
        for(int i=r; i<m; i++){
            for(int j=c; j<n; j++){
                if(i==0 || j==0) dp[i][j] = 1 ;
                else dp[i][j] = dp[i-1][j] + dp[i][j-1] ;
            }
        }
        return dp[m-1][n-1] ;
    }
}
