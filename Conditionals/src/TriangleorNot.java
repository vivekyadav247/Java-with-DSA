import java.util.Scanner;

public class TriangleorNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st side : ");
        int x = sc.nextInt();
        System.out.print("Enter 2nd side : ");
        int y = sc.nextInt();
        System.out.print("Enter 3rd side : ");
        int z = sc.nextInt();

        if((x+y)>z && (y+z)>x && (z+x)>y)
            System.out.println("This is Triangle .");
        else
            System.out.println("This is not Triangle .");
    }
}
