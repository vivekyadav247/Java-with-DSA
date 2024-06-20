import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Year : ");
        int x = sc.nextInt();

        if (x%4==0 || x%100 != 0 && x%400 ==0)
            System.out.println("Leap Year !");
        else
            System.out.println("Not Leap Year !");
    }
}
