import java.util.Scanner;

public class AreaofCircleInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Radius : ");
        float r = sc.nextFloat();
        float a = 3.141592f * r * r  ;
        System.out.print("Area of Circle of radius "+r+" is "+a);
    }
}
