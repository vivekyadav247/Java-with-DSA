import java.util.ArrayList;
import java.util.List;
public class CyclicSort {
    public static void print(int[] arr){
        for (int ele : arr ) {
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void swap(int i, int j, int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp ;
    }
    public static void cyclesort(int[] nums){
        int n = nums.length;
        int i = 0;
        while(i<n){
            int ele = nums[i];
            if(ele==i+1 || ele==nums[ele-1]) i++;
            else swap(i,ele-1,nums);
        }
    }

    public static void main(String[] args) {
        int[] arr = {4,3,2,1,5};
        print(arr);
        cyclesort(arr);
        print(arr);

    }
}
