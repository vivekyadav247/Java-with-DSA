package AssignmentQuestion;
import java.util.Scanner;
public class Rec_Q3 {
    public static void Pow0f2(int n){
        if(n==2 && n%2==0) {
            System.out.println(true);
            return ;
        }
        if(n%2==0) Pow0f2(n/2);
        else System.out.println(false);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Pow0f2(n);
    }
}
