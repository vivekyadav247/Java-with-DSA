import java.util.Stack;

public class CopyStack {
    /// Copy Stack into another Stack in Same order
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);

        Stack<Integer> sttemp = new Stack<>();
        while(!st.isEmpty()){
            sttemp.push(st.pop());
        }

        Stack<Integer> st2 = new Stack<>();
        while(!sttemp.isEmpty()){
            st2.push(sttemp.pop());
        }
        System.out.println(st2);
    }
}
