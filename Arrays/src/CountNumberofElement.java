import java.util.Scanner;

public class CountNumberofElement {
    public static void main(String[] args) {
        // Count the number of Element in given Array greater than a given number x . //
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the x : ");
        int x = sc.nextInt();
        int[] arr = {12,34,54,67,89,13,15,62,2,0};
        int n = arr.length;
        int k = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i]>x)
                k++;
            else
                continue ;
        }
        System.out.println(k);
    }
}
