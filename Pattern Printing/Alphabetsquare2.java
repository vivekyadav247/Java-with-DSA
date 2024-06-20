import java.util.Scanner;

public class Alphabetsquare2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        for(int i = 1 ; i <= n ; i++){ // rows
            for(int j=1 ; j<=n ; j++){ //columns
                char x = (char)(i+64) ;
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
