import java.util.Scanner;

public class Printtableof19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the table of : ");
        int n = sc.nextInt();
        for(int i=n;i<=n*10;i+=n) {
            System.out.println(i);
        }
    }
}
