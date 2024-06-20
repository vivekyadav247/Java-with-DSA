import java.util.Scanner;

public class A5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter odd no. : ");
        int n = sc.nextInt();
        int a = n+1;

        for(int i = 1 ; i<=n ; i++){
            for(int j=1 ; j<=n ; j++){
                if(j==i )
                    System.out.print("*"+" ");
                else
                    System.out.print(" "+" ");

            }
            for(int j=a ; j>=i+1 ; j--){
                System.out.print(" ");
            }
            a--;
            for(int j=1;j<=i;j++){
                if(j==1 && (i+j)!=n+1)
                    System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
