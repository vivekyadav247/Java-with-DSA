import java.util.Scanner;

public class InputofStrBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any STring : ");
        StringBuilder sb = new StringBuilder(sc.nextLine());
        System.out.println(sb);


    }
}
