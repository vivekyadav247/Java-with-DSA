import java.util.Arrays;

public class copyofArray {
    public static void main(String[] args) {
        int[] arr = {10,8,48,12,2,89};
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();

//        int[] nums = arr; // shallow copy mean this is only change name of first array //
//        for(int ele : nums){
//            System.out.print(ele+" ");
//        }

        int[] brr = Arrays.copyOf(arr,arr.length); // Deep Copy //
        brr[0] = 70;
        for(int ele : brr){
            System.out.print(ele+" ");
        }
    }
}
