import java.util.Scanner;

public class MazePath {

    // Here we use 4 variable where x and y is 1 and
    // m , n are input by user of row and column
//    public static long maze(int x , int y,int m , int n ){
//        if(y==n || x==m) return 1 ;
//        return maze(x,y+1,m,n) + maze(x+1,y,m,n) ;
//    }

    // here we use only two variables
    public static long maze(int m , int n ){
        if(m==1 || n==1) return 1 ;
        return maze(m-1,n) + maze(m,n-1) ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row-: ");
        int a = sc.nextInt();
        System.out.print("Enter column: ");
        int b = sc.nextInt();
        System.out.println("The number of ways is "+maze(a,b));
    }
}
