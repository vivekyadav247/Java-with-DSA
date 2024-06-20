import java.util.Scanner;

public class OddnumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        for(int i = 1 ; i<=n ; i++){ // rows
            for(int j=1 ; j<=i ; j++){
                int x = 2*j-1 ;
                    System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
