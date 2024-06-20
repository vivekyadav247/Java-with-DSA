package HW;

import java.util.Scanner;

public class third {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        if(9999<n && n<100000){
            System.out.println("This is Five Digit Number .");
        } else{
            System.out.println("This is not Five digit Number .");
        }
    }
}
