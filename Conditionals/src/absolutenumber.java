import java.util.Scanner;

public class absolutenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int x = sc.nextInt();

        if(x<0) {
            System.out.println(-x);
        }else {
            System.out.println(x);
        }
    }
}
