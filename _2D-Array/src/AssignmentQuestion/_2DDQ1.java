package AssignmentQuestion;

public class _2DDQ1 {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = 10;
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
