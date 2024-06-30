import java.util.Scanner;

public class ReverseEachWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an String : ");
        StringBuilder sb = new StringBuilder(sc.nextLine());
        int i = 0 , j = i , n = sb.length() ;
        while(j<n){
            if (sb.charAt(j) != ' ') j++;
            else{
                reversestring(sb,i,j-1);
                i = j+1;
                if(sb.charAt(i)==' '){  // if more than 1 space then this work //
                    for(int k = i ; k<n ; k++){
                        if(sb.charAt(i)!=0);
                    }
                }
                j = i ;
            }
        }
        reversestring(sb,i,j-1); // for last word reverse
        System.out.println(sb);
    }
    static StringBuilder reversestring(StringBuilder sb , int i , int j) {
//        int n = sb.length();
//        int i = 0, j = n - 1;
        while (i <= j) {
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);
            i++;
            j--;
        }
        return sb ;
    }
}
