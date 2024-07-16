package SortAssignmentQues;

import java.util.Scanner;

public class Sort_Q9 {
    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the even Length of array : ");
        int n = sc.nextInt();
        if(n%2 != 0){
            System.out.print("Invalid Input! length is odd");
        }
        else {
            System.out.print("Enter the Elements of Array : ");
            int arr[] = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            int res[] = new int[n / 2];
            int x = 0, y = x + 1, z = 0;
            while (y < n && z < n / 2) {
                res[z] = arr[x] + arr[y];
                x += 2;
                y+=2 ;
                z++;
            }
            print(res);
            for (int i = 0; i < n/2-1; i++) {
                for (int j = i+1; j > 0 ; j--) {
                    if(res[j]<res[j-1]){
                        swap(res,j,j-1);
                    }
                    else{
                        break ;
                    }
                }
            }
            print(res);
            System.out.println(res[0]);
        }

    }
}
