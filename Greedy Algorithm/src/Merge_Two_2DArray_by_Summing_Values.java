import java.util.Arrays;
import java.util.HashMap;

public class Merge_Two_2DArray_by_Summing_Values {
    public static void main(String[] args) {
        int[][] nums1 = {{1,2},{2,3},{4,5}};
        int[][] nums2 = {{1,4},{3,2},{4,1}};

        merge2darrays(nums1,nums2);
    }
    public static int[][] merge2darrays(int[][] nums1, int[][] nums2){
        HashMap<Integer,Integer> ans = new HashMap<>();
        for(int i=0; i<nums1.length; i++){
            if(ans.containsKey(nums1[i][0])){
                int key = nums1[i][0] ;
                int val = ans.get(key) ;
                val = val + nums1[i][1] ;
                ans.put(key,val);
            }
            else{
                ans.put(nums1[i][0],nums1[i][1]);
            }
        }
        for(int i=0; i<nums1.length; i++){
            if(ans.containsKey(nums2[i][0])){
                int key = nums2[i][0] ;
                int val = ans.get(key) ;
                val = val + nums2[i][1] ;
                ans.put(key,val);
            }
            else{
                ans.put(nums2[i][0],nums2[i][1]);
            }
        }

        int n = ans.size();
        int[][] res = new int[n][2];
        int i = 0 ;
        for(int key : ans.keySet()){
            int val = ans.get(key);
            res[i][0] = key ;
            res[i][1] = val ;
            i++ ;
        }
        Arrays.sort(res, (a,b) -> Integer.compare(a[0],b[0]));
        for(int j = 0; j<res.length; j++){
            System.out.println(res[j][0]+","+res[j][1]);
        }
        return res ;
    }
}
