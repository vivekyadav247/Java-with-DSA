public class TransposeofMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1,2},{3,4},{5,6}};
        int m = arr.length;
        int n = arr[0].length;
        int[][]  res = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                res[i][j] = arr[j][i];
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
}
