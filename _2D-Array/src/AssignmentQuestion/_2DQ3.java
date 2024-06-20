package AssignmentQuestion;

import java.util.Scanner;

public class _2DQ3 {
    public static void main(String[] args) {
        int[][] a = {{1,2,-3,4},{0,0,-4,2},{1,-1,2,3},{-4,-5,-7,0}};
        int sum = 0 ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row number where rectangle start : ");
        int l1 = sc.nextInt();
        System.out.print("Enter the column number where rectangle start : ");
        int r1 = sc.nextInt();
        System.out.print("Enter the row number where rectangle end : ");
        int l2 = sc.nextInt();
        System.out.print("Enter the column number where rectangle end : ");
        int r2 = sc.nextInt();
        if(l1<a.length && l2<a.length && r1<a[0].length && r2<a[0].length){
            if(l2<l1){
                int temp = l1;
                l1 = l2 ;
                l2 = temp;
            }
            if(r2<r1){
                int temp = r1;
                r1 = r2 ;
                r2 = temp;
            }
            for (int i = l1 ; i <= l2 ; i++) {
                for (int j = r1 ; j <= r2 ; j++) {
                   sum+=a[i][j];
                }
            }
            System.out.println(sum);
        }
        else{
            System.out.println("Invalid Input");
        }
    }
}
