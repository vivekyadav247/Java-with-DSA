import java.util.Scanner;

public class primrnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        for(int i = 2; i<=n-1;i++){
            if(n%i==1) {
                System.out.println("Prime number");
                break;
            } else System.out.println("Composite number");
        }
    }
}
