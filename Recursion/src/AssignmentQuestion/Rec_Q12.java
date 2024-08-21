package AssignmentQuestion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Rec_Q12 {
    static List<List<Integer>> arr = new ArrayList<>(); //global
    public static void Subset(int i ,int[] nums,ArrayList<Integer> ans){
        if(i==nums.length) {
            ArrayList<Integer> list = new ArrayList<>();
            for(int j=0;j<ans.size();j++){
                list.add(ans.get(j));
            }
            if(arr.contains(list)) return ;
            else
                arr.add(list);
            return;
        }

        Subset(i+1,nums,ans);
        ans.add(nums[i]);
        Subset(i+1,nums,ans);
        ans.remove(ans.size()-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array -: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        arr = new ArrayList<>(); //reset
        ArrayList<Integer> ans = new ArrayList<>();
        Subset(0,nums,ans);
        System.out.println(arr);
    }
}
