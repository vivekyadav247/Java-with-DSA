import java.util.Scanner;

public class OddnumberTriangle2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
//        for(int i = 1 ; i<=n ; i++){ // rows
//            for(int j=1 ; j<=2*i-1 ; j+=2){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }

        for(int i = 1 ; i<=n ; i++){
            int a =1;
            for(int j=1 ; j<=i ; j++){
                System.out.print(a+" ");
                a+=2;
            }
            System.out.println();
        }
    }
}
