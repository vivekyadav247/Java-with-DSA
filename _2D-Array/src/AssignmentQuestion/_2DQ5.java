package AssignmentQuestion;

public class _2DQ5 {
    public static void main(String[] args) {
        int[][] a = {{1,3,5,7},{3,4,7,8},{1,4,12,3}};
        int max = Integer.MIN_VALUE;
        int rowno = 0;
        for (int i = 0; i < a.length; i++) {
            int sumofrow = 0 ;
            for (int j = 0; j < a[0].length; j++) {
                sumofrow += a[i][j] ;
            }
            if(sumofrow>max){
                max = sumofrow;
                rowno = i+1 ;
            }
        }
        System.out.println(max);
        System.out.println(rowno);
    }
}
