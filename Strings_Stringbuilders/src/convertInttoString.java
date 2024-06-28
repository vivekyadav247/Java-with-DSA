import java.util.Scanner;

public class convertInttoString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Integer : ");
        int n = sc.nextInt();
        String s = "";
        s += n ;
        System.out.println(s);
    }
}
