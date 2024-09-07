import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);

        Stack<Integer> streverse = new Stack<>();
        while(!st.isEmpty()){
            streverse.push(st.pop());
        }
        System.out.println(streverse);
    }
}
