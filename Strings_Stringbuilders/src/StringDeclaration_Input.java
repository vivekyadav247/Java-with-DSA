import java.util.Scanner;

public class StringDeclaration_Input {
    public static void main(String[] args) {
        String str;  //Intialization
        str = "Hello " ; // Declaration
        System.out.println(str);
        // Input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String s = sc.nextLine();
        System.out.print("Welcome ");
        System.out.print(s+" !");
    }
}
