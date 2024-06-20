import java.util.Scanner;

public class GradeofStudents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Marks : ");
        int x = sc.nextInt();

        if(x>=81 && x<=100) System.out.println("Very Good !");
        else if (x>=61 && x<=80 ) System.out.println("Good !");
        else if (x>=41 && x<=60) System.out.println("Average");
        else System.out.println("Fail !");
    }
}
