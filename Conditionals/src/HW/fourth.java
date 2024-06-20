package HW;

import java.util.Scanner;

public class fourth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int x = sc.nextInt();
        System.out.print("Enter the Number : ");
        int y = sc.nextInt();
        System.out.print("Enter the Number : ");
        int z = sc.nextInt();

        if(x<=y && x<=z)
            System.out.println(x+" is least.");
        else if(y<=x && y<=z)
            System.out.println(y+" is least.");
        else
            System.out.println(z+" is least.");


    }
}
