package AssignmentQuestion;
import java.util.Scanner;
public class Rec_Q3 {
    public static void Sqrt(int n){
        if(n==2 && n%2==0) {
            System.out.println(true);
            return ;
        }
        if(n%2==0) Sqrt(n/2);
        else System.out.println(false);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Sqrt(n);
    }
}
