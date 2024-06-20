import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Area of Circle //
        System.out.print("Enter the Radius of circle : ");
        double r = sc.nextDouble();
        double area = 3.141592 * r * r ;
        System.out.println(area);

        // Simple Interest //
        System.out.print("Enter the Principle : ");
        int p = sc.nextInt();
        System.out.print("Enter the rate of interest : ");
        double rate = sc.nextDouble();
        System.out.print("Enter the time (in years) : ");
        double time = sc.nextDouble();
        double SI = p * rate * time / 100 ;
        System.out.println(SI);
    }
}
