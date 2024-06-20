import java.util.Scanner;

public class Apmethod2 {
    /// without maths AP print ///
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 4,7,10,13,.... nth terms //
//        int a = 4 , d = 3;
//        for(int i=1;i<=n;i++){
//            System.out.print(" "+a);
//            a += d;
//        }

        // 2,5,8,11,14,17,20 .... nth term //
//        int a = 2 , d = 3;
//        for(int i=1;i<=n;i++){
//            System.out.print(" "+a);
//            a += d;
//        }

        // 5 1 -3 -7 ...... nth term //
        int a = 5 , d = -4;
        for(int i=1;i<=n;i++){
            System.out.print(" "+a);
            a += d;
        }
    }
}
