import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double b = (double) a ;
        double x = sc.nextDouble();
        int y = (int) x;
        System.out.println(b);
        System.out.println(y);
    }
}
