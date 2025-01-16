import java.util.Arrays;

public class MaximizeSumOfArrayAfterKNegation {
    private static int MaxSum(int[] nums, int k) {
        Arrays.sort(nums) ;
        int i=0;
        while(i<nums.length && nums[i]<0 && k>0){
            nums[i] *= -1;
            i++;
            k--;
        }
        if(k%2==1){
            Arrays.sort(nums);
            nums[0] *= -1 ;
        }
        int ans = 0;
        for(int x : nums){
            ans += x ;
        }
        return ans ;
    }
    public static void main(String[] args) {
        int[] nums = {3,-1,0,2};
        int k = 3 ;
        System.out.println(MaxSum(nums,k));
        
    }


}
