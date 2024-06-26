import java.util.Scanner;

public class CountVowels {
    public static boolean IsVowels(char c){
        if(c=='a' || c=='A') return true ;
        else if(c=='e' || c=='E') return true ;
        else if(c=='i' || c=='I') return true ;
        else if(c=='o' || c=='O') return true ;
        else if(c=='u' || c=='U') return true ;
        return false ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Sentences or Words : ");
        String s = sc.nextLine();
        int n = s.length();
        int count = 0 ;
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if(IsVowels(ch)==true){
                count++;
            }
        }
        System.out.println(count);
    }
}
