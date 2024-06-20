import java.util.Scanner;

public class GraetestofThreeNestedIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int x = sc.nextInt();
        System.out.print("Enter the Number : ");
        int y = sc.nextInt();
        System.out.print("Enter the Number : ");
        int z = sc.nextInt();

        if(x>y){
            if(x>z) System.out.println(x+" is greatest .");
            else System.out.println(z+" is greatest .");
        }
        else{
            if(y>z) System.out.println(y+" is greatest .");
            else System.out.println(z+" is greatest .");
        }
    }
}
