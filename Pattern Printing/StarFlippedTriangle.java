import java.util.Scanner;

public class StarFlippedTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();

        // My method
//        for(int i = 1;i<=n;i++){
//            for(int j=1;j<=n;j++){
//                if(j<=n-i)
//                    System.out.print(" ");
//                else
//                    System.out.print("*");
//            }
//            System.out.println();
//        }

        // PW method
        for(int i = 1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                    System.out.print(" "+" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
