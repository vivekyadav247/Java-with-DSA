import java.util.Scanner;

public class BinaryStrings {
    public static void Printbinary(String ans, int n){
        int m = ans.length();
        if(m==n){
            System.out.println(ans);
            return ;
        }
        if(m==0 || ans.charAt(m-1)=='0') {
            Printbinary(ans + 0, n);
            Printbinary(ans + 1, n);
        }
        else Printbinary(ans+0,n);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n -: ");
        int n = sc.nextInt();
        Printbinary("",n);
    }
}
