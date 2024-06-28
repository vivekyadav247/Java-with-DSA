import java.util.Scanner;

public class ReturnTotalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Integer : ");
        int n = sc.nextInt();
        //String s = ""+n;
        String s = Integer.toString(n);
        System.out.println(s);
        System.out.println(s.length());
    }
}
