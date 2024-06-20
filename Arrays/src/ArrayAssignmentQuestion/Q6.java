package ArrayAssignmentQuestion;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target :");
        int x = sc.nextInt();
        int count = 0;
        int[] arr = {1,2,3,4,5,6,7,8,10,34};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>x){
                count++;
            }
            else{
                continue;
            }
        }
        System.out.println(count);
    }
}
