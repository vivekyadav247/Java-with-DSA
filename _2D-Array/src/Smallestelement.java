public class Smallestelement {
    public static void main(String[] args) {
        int[][] arr = {{1,219},{-4,4}};
        int m = arr.length;
        int n = arr[0].length;
        int min = Integer.MAX_VALUE ;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                min = Math.min(min,arr[i][j]);
            }
        }
        System.out.println(min);
    }
}
