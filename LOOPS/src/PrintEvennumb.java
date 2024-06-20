import java.util.Scanner;

public class PrintEvennumb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 100 rounds //
//        for(int i=1;i<=n;i++) {
//            if(i%2==0)
//                System.out.println(i);
//        }

        // 50 rounds //
        for(int i=2;i<=n;i+=2) {
                System.out.println(i);
        }

    }
}
