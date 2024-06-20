import java.util.Scanner;

public class AlphabetTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++){ // rows
            for(int j=1;j<=i;j++){ //columns
                char x = (char)(j+64);
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
