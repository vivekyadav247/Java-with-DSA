import java.util.Stack;

public class InsertAtEnd {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);
        int new_element = 1;
        Stack<Integer> sttemp = new Stack<>();
        while(!st.isEmpty()){
            sttemp.push(st.pop());
        }
        st.push(new_element);
        while(!sttemp.isEmpty()){
            st.push(sttemp.pop());
        }
        System.out.println(st);
    }
}
