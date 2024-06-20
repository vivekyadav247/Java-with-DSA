package ArrayAssignmentQuestion;;

public class Q4 {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        int n = arr.length;
        int[] ans = new int[6];
        int k = 0 ;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i] == arr[j]) {
                    ans[k] = arr[i];
                    k++;
                }
            }
        }
        for (int ele : ans) {
            System.out.print(ele+" ");
        }
    }
}
