import java.util.Arrays;

public class BuiltinSort {
    public static void main(String[] args) {
        int[] arr = {7,1,2,8,-4};
        for (int ele: arr) {
            System.out.print(ele+" ");
        }
        System.out.println();
        Arrays.sort(arr); // Built in function
        for (int ele: arr) {
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
