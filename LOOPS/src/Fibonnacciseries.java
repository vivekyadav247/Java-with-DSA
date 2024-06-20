import java.util.Scanner;

public class Fibonnacciseries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the nth term : ");
        int n = sc.nextInt();
        int a=0 , b=1 , c ;
        System.out.println(a);
        System.out.println(b);
        for (int i=2;i<n;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.println(c+" ");
        }


    }
}
