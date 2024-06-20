import java.util.Scanner;

public class MarkRollStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[4][2];
        int m = a.length;
        int n = a[0].length;
        System.out.println("Enter the Marks with roll no. ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();;
            }
        }
        System.out.println("Rollno. Marks ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j]+"     ");
            }
            System.out.println();
        }
    }
}
