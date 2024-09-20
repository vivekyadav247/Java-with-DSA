import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class ReversefirstKelementsofQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        Stack<Integer> st = new Stack<>();
        while(q.size()>=k){
            st.push(q.poll());
        }
        while(st.size()>0){
            q.add(st.pop());
        }
        Queue<Integer> temp = new LinkedList<>();
        while(q.size()-k>0){
            temp.add(q.remove());
        }
        while(temp.size()>0){
            q.add(temp.remove());
        }
        System.out.println(q);
    }
}
