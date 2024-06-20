package HW;

import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length : ");
        int l = sc.nextInt();
        System.out.print("Enter the breadth: ");
        int b = sc.nextInt();
        int P = 2*(l+b) ;
        int A = l*b ;

        if(A>P){
            System.out.println("Area is greater than Perimeter .");
        } else if (A<P) {
            System.out.println("Area is Less than the Perimeter .");
        } else{
            System.out.println("Area and Perimeter both are equal .");
        }
    }
}
