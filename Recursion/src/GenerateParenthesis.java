import java.util.Scanner;

public class GenerateParenthesis {
    public static void GnrtParenthesis(int o , int c ,String ans,int n){
        int m = ans.length();
        if(m==2*n){
            System.out.println(ans);
            return;
        }
        if(o<n) GnrtParenthesis(o+1,c,ans + "(", n);
        if(c<o) GnrtParenthesis(o,c+1,ans + ")", n);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter n -: ");
        int n = sc.nextInt();
        GnrtParenthesis(0,0,"",n);
    }
}
