import java.util.Scanner;

public class Gp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 1,2,4,8,16,32,.... nth term //
//        int a = 1 , r = 2;
//        for(int i=1;i<=n;i++){
//            System.out.print(" "+a);
//            a *= r;
//        }

        // 3,12,48,..... nth term //
        int a = 3 , r = 4;
        for(int i=1;i<=n;i++){
            System.out.print(" "+a);
            a *= r;
        }
    }
}
