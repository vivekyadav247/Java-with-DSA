public class MultiplicationofMatrices {
    public static void print(int[][] arr  ){
        int m = arr.length;
        int n = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[][] a = {{1,2},{3,4}};
        int m = a.length;
        int n = a[0].length;
        int[][] b = {{5,6},{7,8}};
        int p = b.length;
        int q = b[0].length;
        int[][] c = new int[a.length][b[0].length];
        int x = c.length ;
        int y = c[0].length;
        if(a[0].length!=b.length){
            System.out.println("Multiplication not possible");
        }
        else{
            for (int i = 0; i < c.length; i++) {
                for (int j = 0; j < c[0].length; j++) {
                    c[i][j]=0;
                    for (int k = 0; k < b.length; k++) {
                        c[i][j] += a[i][k] * b[k][j];
                    }
                    //System.out.print(c[i][j]+" ");
                }
                //System.out.println();
            }
            print(a);
            print(b);
            print(c);

        }
    }
}
