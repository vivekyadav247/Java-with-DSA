import java.util.Scanner;

public class ReverseStarTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        for(int i = 1 ; i<=n ; i++){ // rows
            for(int j=1 ; j<=n+1-i ; j++){ //columns
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
