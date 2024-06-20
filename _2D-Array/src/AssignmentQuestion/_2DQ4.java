package AssignmentQuestion;

public class _2DQ4 {
    public static void main(String[] args) {
        int[][] a = {{1,3,4,6},{2,4,5,1},{3,5,6,8},{4,6,7,9}};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if(a[i][j]>max){
                    max = a[i][j];
                }
            }
        }
        System.out.println(max);
    }
}
