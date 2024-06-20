import java.util.Scanner;

public class Profit_Loss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Cost Price : ");
        int cp = sc.nextInt();
        System.out.print("Enter the Selling Price : ");
        int sp = sc.nextInt();
        int P = sp-cp;

        if(P>0){
            System.out.println("The Profit is : "+P);
        } else if (P<0) {
            System.out.println("The Loss is : "+(-P));
        }else {
            System.out.println("No Profit No Loss !");
        }
    }
}
