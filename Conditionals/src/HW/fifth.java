package HW;

import java.util.Scanner;

public class fifth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Age of Ram : ");
        int x = sc.nextInt();
        System.out.print("Enter the Age of Shyam  : ");
        int y = sc.nextInt();
        System.out.print("Enter the Age of Ajay : ");
        int z = sc.nextInt();

        if(x<y){
            if(x<z) System.out.println("Ram is youngest .");
            else System.out.println("Ajay is youngest .");
        }
        else{
            if(y<z) System.out.println("Shyam is youngest .");
            else System.out.println("Ajay is youngest .");
        }
    }
}
