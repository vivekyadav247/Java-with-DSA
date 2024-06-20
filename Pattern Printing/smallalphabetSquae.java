import java.util.Scanner;

public class smallalphabetSquae {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        for(int i = 1 ; i <= n ; i++){ // rows
            for(int j=1 ; j<=n ; j++){ //columns
                char x = (char)(j+96) ;
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
