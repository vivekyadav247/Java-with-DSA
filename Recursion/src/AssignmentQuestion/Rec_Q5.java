package AssignmentQuestion;

import java.util.Scanner;

public class Rec_Q5 {
    public static void index(int target,int arr[],int i){
        if(i>=0 && arr[i]==target){
            System.out.println(i);
            return;
        }
        if(i>=0)index(target,arr,i-1);
        else System.out.println(-1);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,3,4,5,6};
        int target = sc.nextInt();
        index(target,arr,arr.length-1);
        //System.out.println(index(target,arr,0));
    }
}
