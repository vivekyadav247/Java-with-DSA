import java.util.Scanner;
import java.util.Stack;

public class PreviousGreaterElement {
    public static int[] prevgreater(int[] arr){
         // Brute Force
//        int res = 0;
//        int[] ans = new int[arr.length];
//        ans[0] = -1;
//        for (int i = 1; i < arr.length ; i++) {
//            res = -1;
//            for (int j = i-1; j >=0; j--) {
//                if(arr[i]<arr[j]){
//                    res = arr[j];
//                    break;
//                }
//            }
//            ans[i] = res;
//        }
//        return ans;

        // Stack Method
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        ans[0] = -1;
        st.push(arr[0]);
        for (int i = 1; i < n ; i++) {
            while(!st.isEmpty() && st.peek()<=arr[i]){
                st.pop();
            }
            if(st.isEmpty()) ans[i] = -1;
            else ans[i] = st.peek();
            st.push(arr[i]);
        }
        return ans ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] res = prevgreater(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(res[i]+" ");
        }
    }
}
