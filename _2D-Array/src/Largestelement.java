public class Largestelement {
    public static void main(String[] args) {
            int[][] arr = {{1,219},{3,4}};
            int m = arr.length;
            int n = arr[0].length;
            int mx = Integer.MIN_VALUE ;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    mx = Math.max(mx,arr[i][j]);
                }
            }
            System.out.println(mx);
    }
}
