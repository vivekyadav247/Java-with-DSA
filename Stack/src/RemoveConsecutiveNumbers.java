import java.util.Scanner;
import java.util.Stack;

public class RemoveConsecutiveNumbers {
    public static int[] removeconsecutive(int[] arr){
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if(st.size()==0 || st.peek()!=arr[i]) st.push(arr[i]);
            else if(st.peek()==arr[i]){
                if(i==arr.length-1 || arr[i]!=arr[i+1]) st.pop();
                else continue;
            }
        }
        int[] ans = new int[st.size()];
        for (int i = st.size()-1; i >= 0 ; i--) {
            ans[i] = st.pop();
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] res = removeconsecutive(arr);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
    }
}
