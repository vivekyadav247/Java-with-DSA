import java.util.Scanner;

public class APmethod1 {
    /// with maths formula ap print ////
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter nth term : ");
        int n = sc.nextInt();

        // 1,3,5,7,9 ..... nth term //
//        for (int i=1;i<=2*n-1;i+=2){
//            System.out.print(i+" ");
//        }

        // 4,7,10,13,16 .... nth term //
        for(int i=4;i<=3*n+1;i+=3){
            System.out.print(i+" ");
        }
    }
}
