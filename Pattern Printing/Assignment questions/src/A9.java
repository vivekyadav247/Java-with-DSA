import java.util.Scanner;

public class A9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();

        int m = n-1;
        for(int i = 1;i<=m;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            for(int j=1;j<=n-i;j++){
                System.out.print(" "+" ");
            }
            for(int j=1;j<=n-i-1;j++){
                System.out.print(" "+" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for(int i=1;i<=n*2-1;i++){
            System.out.print("*"+" ");
        }
        System.out.println();

        for(int i=1;i<=n*2-1;i++){
            System.out.print("*"+" ");
        }
        System.out.println();

        for(int i = 1;i<=m;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("*"+" ");
            }
            for(int j=1;j<=(i*2)-1;j++){
                System.out.print(" "+" ");
            }
            for(int j=1;j<=n-i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}