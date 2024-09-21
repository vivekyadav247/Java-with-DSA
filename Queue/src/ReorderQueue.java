import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReorderQueue {
    public static Queue<Integer> rearrangeQueue(int N, Queue<Integer> q) {
//        Stack<Integer> st = new Stack<>();
//        Stack<Integer> st1 = new Stack<>();
//
//        while(q.size()!= N/2){
//            st.push(q.remove());
//        }
//        while(q.size()!=0){
//            st1.push(q.remove());
//        }
//        while(!st.isEmpty()){
//            q.add(st.pop());
//        }
//        while(!st1.isEmpty()){
//            q.add(st1.pop());
//        }
//        while(q.size()!= N/2){
//            st.push(q.remove());
//        }
//        while(q.size()!=0){
//            st1.push(q.remove());
//        }
//        while(st.size()!=0 || st1.size()!=0){
//            q.add(st.pop());
//            q.add(st1.pop());
//        }

        //Method - 2
        Stack<Integer> st = new Stack<>();
        while(q.size()!= N/2){
            st.push(q.remove());
        }
        while(!st.isEmpty()){
            q.add(st.pop());
        }
        while(q.size()!= N/2){
            st.push(q.remove());
        }
        while(!st.isEmpty()){
            q.add(st.pop());
            q.add(q.remove());
        }
        while(!q.isEmpty()){
            st.push(q.remove());
        }
        while(!st.isEmpty()){
            q.add(st.pop());
        }
        return q ;
    }
    public static void main(String[] args) {
        int n = 8;
        Queue<Integer> q = new LinkedList<>();
        q.add(1); q.add(2); q.add(3); q.add(4);
        q.add(5); q.add(6); q.add(7); q.add(8);
        System.out.println(rearrangeQueue(n,q));
    }
}
