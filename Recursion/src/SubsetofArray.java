import java.util.List;
import java.util.ArrayList;

public class SubsetofArray {
    static List<List<Integer>> arr = new ArrayList<>(); //global
    public static void Subset(int i ,int[] nums,ArrayList<Integer> ans){
        if(i==nums.length) {
            ArrayList<Integer> list = new ArrayList<>();
            for(int j=0;j<ans.size();j++){
                list.add(ans.get(j));
            }
            arr.add(list);
            return;
        }
        Subset(i+1,nums,ans);
        ans.add(nums[i]);
        Subset(i+1,nums,ans);
        ans.remove(ans.size()-1);
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        arr = new ArrayList<>(); //reset
        ArrayList<Integer> ans = new ArrayList<>();
        Subset(0,nums,ans);
        System.out.println(arr);
    }
}
