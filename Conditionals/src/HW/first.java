package HW;

import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int x = sc.nextInt();
        if(x % 5 == 0)
            System.out.println("Number is divisible by 5.");
        else
            System.out.println("Number is not divisible by 5.");
    }
}
