import java.util.Scanner;

public class OutputusingNestedloop {
    public static void main(String[] args) {
        int[][] grid = new int [3][3];
        Scanner sc = new Scanner(System.in);

        // Length Operator
        int m = grid.length; // no. of rows
        System.out.println(m);
        int n = grid[0].length; // no. of columns
        System.out.println(n);

        // Input of 2D array
        System.out.println("Enter The Elements ");
        for (int i = 0; i < m; i++) { // for rows
            for (int j = 0; j < n; j++) { // for columns
                grid[i][j] = sc.nextInt();
            }
        }
        //output of 2D array
        for (int i = 0; i < 3; i++) { // for rows
            for (int j = 0; j < 3; j++) { // for columns
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }


    }
}
