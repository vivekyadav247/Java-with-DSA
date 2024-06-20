public class Rotatearrray {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 3 ;
        int n = nums.length;
        if(k>n){k=k%n ;}
        rev(nums,0,n-k-1);
        rev(nums,n-k,n-1);
        rev(nums,0,n-1);
        for (int num : nums) {
            System.out.print(num + " ");
        }

    }
    static void rev(int[] nums, int i, int j) {
        while(i<=j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp ;
            i++;
            j--;
        }
    }
}
