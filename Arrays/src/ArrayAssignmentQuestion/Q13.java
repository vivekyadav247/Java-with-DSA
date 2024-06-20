package ArrayAssignmentQuestion;

public class Q13 {
    public static void main(String[] args) {
        int[] nums1 = {5,1,8,6,4,3,2};
        int[] nums2 = {42,39,27,13,7};
        int m = nums1.length;
        int n = nums2.length;
        int o = m+n ;
        int[] Merge = new int[o];
        for (int i = 0; i < m-1; i++) {
            for (int j = i+1; j < m ; j++) {
                if(nums1[i]>nums1[j]){
                    int temp = nums1[i];
                    nums1[i] = nums1[j];
                    nums1[j] = temp ;
                }
            }
        }
        for(int ele : nums1){
            System.out.print(ele+" ");
        }
        System.out.println();
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n ; j++) {
                if(nums2[i]>nums2[j]){
                    int temp = nums2[i];
                    nums2[i] = nums2[j];
                    nums2[j] = temp ;
                }
            }
        }
        for(int ele : nums2){
            System.out.print(ele+" ");
        }
        System.out.println();
        int i = 0 , j = 0 , k = 0 ;
        while (i<m && j<n){
            if(nums1[i]<=nums2[j]){
                Merge[k] = nums1[i];
                i++;
                k++;
            }
            else {
                Merge[k] = nums2[j];
                j++;
                k++;
            }
        }
        if(i==m){
            while(j<n){
                Merge[k] = nums2[j];
                j++;
                k++;
            }
        }
        if(j==n){
            while(i<m){
                Merge[k] = nums1[i];
                i++;
                k++;
            }
        }
        for(int ele : Merge){
            System.out.print(ele+" ");
        }

    }
}
