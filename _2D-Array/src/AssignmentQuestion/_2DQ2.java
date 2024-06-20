package AssignmentQuestion;

public class _2DQ2 {
    public static void main(String[] args) {
        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] b = {{7,8,9},{4,5,6},{1,2,3}};
        int[][] c = new int[a.length][a[0].length];
        if(a.length==b.length && a[0].length==b[0].length);
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[0].length; j++) {
                c[i][j] = a[i][j]+b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
