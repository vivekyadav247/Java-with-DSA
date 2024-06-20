import java.util.Scanner;

public class A7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter odd no. : ");
        int n = sc.nextInt();
        int a = n+1;

        for(int i = 1 ; i<=n ; i++){
            for(int j=n ; j>=i+1 ; j--){
                System.out.print(" "+" ");
            }
            for(int j=1;j<=i;j++){
                if(j==1 )
                    System.out.print(i+" ");
            }
            for(int j=1;j<=i-1;j++){
                System.out.print(" "+" ");
            }
            for(int j=1;j<=i-2;j++){
                System.out.print(" "+" ");
            }
            for(int j=1;j<=i-1;j++){
                if(j==1)
                    System.out.print(i+" ");
            }

            System.out.println();
        }
    }
}
