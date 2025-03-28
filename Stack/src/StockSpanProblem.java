import java.util.Scanner;
import java.util.Stack;

public class StockSpanProblem {
    public static int[] StockSpan(int[] price){
        // Method - 1 ( Brute Force)
//        int n = price.length;
//        int x = 0;
//        int span[] = new int[n];
//        span[0] = 1;
//        for (int i = 1; i < n; i++) {
//            x = 1;
//            for (int j = i-1; j >= 0; j--) {
//                if(price[i]<price[j])break;
//                if(price[i]>=price[j]) x++;
//            }
//            span[i] = x;
//        }
//        return span;

        // Method - 2
        int n = price.length;
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            if(st.isEmpty()){
                ans[i] = i+1;
            }
            else {
                while (price[st.peek()] <= price[i]) {
                    st.pop();
                }
                ans[i] = i - st.peek();
            }
            st.push(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] price = new int[n];
        for (int i = 0; i < n; i++) {
            price[i] = sc.nextInt();
        }
        int[] stockspan = StockSpan(price);
        for (int i = 0; i < n; i++) {
            System.out.print(stockspan[i]+" ");
        }
    }
}
