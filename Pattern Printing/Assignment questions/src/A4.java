import java.util.Scanner;

public class A4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print(i+" ");
        }
        for(int i=n-1;i>=1;i--){
            System.out.print(i+" ");
        }
        System.out.println();
        int m = n-1;

        for(int i = 1;i<=m;i++){
            int a = 1;
            int b = m;

            for(int j=1;j<=n-i;j++){
                System.out.print(a++ +" ");
            }
            for(int j=1;j<=(i*2)-1;j++){
                System.out.print(" "+" ");
                a++;
            }
            if(i>1)b=n-i;
            for(int j=1;j<=n-i;j++){

                System.out.print(b-- +" ");
            }

            System.out.println();
        }
    }

}

