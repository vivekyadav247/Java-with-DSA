import java.util.Scanner;

public class A6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter odd no. : ");
        int n = sc.nextInt();
        int m = (n-1)/2;

        for(int i = 1 ; i<=m ; i++){
            for(int j=m ; j>=i ; j--){
                System.out.print(" "+" ");
            }
            for(int j=1;j<=i;j++){
                if(j==1 )
                    System.out.print("*"+" ");
            }
            for(int j=1;j<=i-2;j++){
                System.out.print(" "+" ");
            }
            for(int j=i;j<=i && j!=1 ;j++){
                System.out.print("*"+" ");
            }
            for(int j=1;j<=i-2;j++){
                System.out.print(" "+" ");
            }
            for(int j=1;j<=i-1;j++){
                if(j==1)
                    System.out.print("*"+" ");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            System.out.print("*"+" ");
        }
        System.out.println();

        for(int i = 1 ; i<=m ; i++){
            for(int j=1;j<=i;j++){
                System.out.print(" "+" ");
            }
            for(int j=i;j<=i;j++){
                System.out.print("*"+" ");
            }
            for(int j=m-2 ; j>=i ; j--){
                System.out.print(" "+" ");
            }
            for(int j=i;j<=i && j!=5 ;j++){
                System.out.print("*"+" ");
            }
            for(int j=m-2 ; j>=i ; j--){
                System.out.print(" "+" ");
            }
            for(int j=i;j<=i ;j++){
                if(i!=m)
                    System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
