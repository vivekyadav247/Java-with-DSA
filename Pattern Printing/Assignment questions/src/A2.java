import java.util.Scanner;

public class A2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=3*n/2;j++){
                if(i==1 || i==n || j==1)
                    System.out.print("*");
                if(i!=1 && i!=n && j==n-2)
                    System.out.print(" ");
                if(i!=1 && i!=n && j==n-1)
                    System.out.print("*");
            }


            System.out.println();
        }
    }
}
