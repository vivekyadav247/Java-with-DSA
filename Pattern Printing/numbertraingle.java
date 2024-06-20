import java.util.Scanner;

public class numbertraingle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++){ // rows
            for(int j=1;j<=i;j++){ //columns
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
