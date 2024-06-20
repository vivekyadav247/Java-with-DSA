import java.util.Scanner;

public class A8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter odd no. : ");
        int n = sc.nextInt();

        for(int i = 1 ; i<=n ; i++){
            for(int j=n ; j>=i+1 ; j--){
                System.out.print(" "+" ");
            }
            for(int j=1;j<=i;j++){
                if(j==1 )
                    System.out.print("*"+" ");
            }
            for(int j=1;j<=i-1;j++){
                System.out.print(" "+" ");
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

        for(int i = 1 ; i<=n-1 ; i++){
            for(int j=1;j<=i;j++){
                System.out.print(" "+" ");
            }
            for(int j=i;j<=i;j++){
                System.out.print("*"+" ");
            }
            for(int j=n-2 ; j>=i ; j--){
                System.out.print(" "+" ");
            }
            for(int j=n-3 ; j>=i ; j--){
                System.out.print(" "+" ");
            }
            for(int j=i;j<=i;j++){
                if(i!=n-1)
                    System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
