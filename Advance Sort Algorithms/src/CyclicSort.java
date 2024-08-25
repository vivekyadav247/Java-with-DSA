import java.util.ArrayList;
import java.util.List;

public class CyclicSort {
    static List<Integer> ans = new ArrayList<>();
    public static void swap(int i, int j, int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp ;
    }

    public static List<Integer> findduplicates(int[] nums) {
        int n = nums.length;
        int i = 0;
        while(i<n){
            int ele = nums[i];
            if(ele==i+1 || ele==nums[ele-1]) i++;
            else swap(i,ele-1,nums);
        }
        ans = new ArrayList<>();
        for(i=0;i<n;i++){
            if(nums[i]!=i+1) ans.add(nums[i]) ;
        }
        return ans ;
    }
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        findduplicates(arr);
        System.out.println(findduplicates(arr));
    }
}
