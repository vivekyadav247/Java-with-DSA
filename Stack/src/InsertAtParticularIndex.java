import java.util.Stack;

public class InsertAtParticularIndex {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);
        int element = 25;
        int index = 3;
        Stack<Integer> sttemp = new Stack<>();
        while(st.size()>=index){
            sttemp.push(st.pop());
        }
        st.push(element);
        while(!sttemp.isEmpty()){
            st.push(sttemp.pop());
        }
        System.out.println(st);
    }
}
