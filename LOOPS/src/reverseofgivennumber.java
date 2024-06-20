import java.util.Scanner;

public class reverseofgivennumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int r = 0  ;
        while(n!=0){
            int ld = n%10;
            n/=10;
            r *= 10;
            r += ld ;
        }
        System.out.println(r);
    }
}
