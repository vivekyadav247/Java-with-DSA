import java.util.Scanner;

public class SumandReverseofgivennumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int sum = 0;
        int r = 0  ;
        while(n!=0){
            int ld = n%10;
            n/=10;
            sum += ld ;
            r *= 10;
            r += ld ;
        }
        System.out.println(r);
        System.out.println(sum);
    }
}
