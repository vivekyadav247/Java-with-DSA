import java.util.Arrays;

public class Arraysort {
    public static void main(String[] args) {
        int[] arr = {10,8,48,12,2,89};
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        Arrays.sort(arr);
        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
