import java.util.Scanner;

public class PermutationofString {
    public static void PermutationStr(String ans , String s){
        if(s.length()==0){
            System.out.print(ans+", ");
            return ;
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            String left = s.substring(0,i);
            String right = s.substring(i+1);
            PermutationStr(ans+ch,left+right);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String -: ");
        String s = new String(sc.next());
        PermutationStr("",s);
    }
}
