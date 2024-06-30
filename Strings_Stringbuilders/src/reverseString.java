import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an String : ");
        StringBuilder sb = new StringBuilder(sc.nextLine());
        // built in function
//        sb.reverse();
//        System.out.println(sb);
        //without built in function
        int n = sb.length();
        int i = 0, j = n - 1;
        reversestring(sb,i,j);
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
