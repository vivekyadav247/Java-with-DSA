import java.util.Scanner;

public class linearsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Target : ");
        int x = sc.nextInt();
        System.out.println("Enter Array size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Array element : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // solution
        boolean flag = false ;
        for(int i=0;i<n;i++){
            if(arr[i]==x) {
                flag = true ;
                break;
            }
        }
        if(flag==true) System.out.println("Element found ");
        else System.out.println("Element not found");
    }
}
