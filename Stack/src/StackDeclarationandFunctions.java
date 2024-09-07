import java.util.Stack;

public class StackDeclarationandFunctions {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        System.out.println(st.isEmpty());
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st.isEmpty());
        System.out.println(st); // for print stack;
        System.out.println(st.peek());// for access topmost element in Stack
        System.out.println(st.pop());
        System.out.println(st);// For access and delete the topmost element in stack
        System.out.println(st.peek());
        System.out.println(st.size());// For access size of stack
        while(st.size()>1){
            st.pop();
        }
        System.out.println(st.peek());
        System.out.println(st);
    }
}