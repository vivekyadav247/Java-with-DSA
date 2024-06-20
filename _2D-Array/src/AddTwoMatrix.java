import java.sql.SQLOutput;

public class AddTwoMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1,2},{3,4}};
        int m = arr.length;
        int n = arr[0].length;
        int[][] brr = {{5,6},{6,7}};
        int p = brr.length;
        int q = brr[0].length;

        if(m+n==p+q){
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = arr[i][j] + brr[i][j];
                }
            }
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        }
        else
            System.out.println("Order of matrix are not sama");
    }
}
