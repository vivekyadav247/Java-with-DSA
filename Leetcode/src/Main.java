import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main{

    public static void main(String[] args) {
        int[] nums = {-1,0,2,-1,4};
        int n = nums.length ;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < n-2; i++) {
            for (int j = i+1; j < n-1; j++) {
                for (int k = j+1; k < n ; k++) {
                    if(nums[i]+nums[j]+nums[k]==0) {
                        ans.add(Arrays.asList(nums[i] + nums[j] + nums[k]));
                    }
                }
            }
        }
        

        System.out.println(ans);

    }
}