import java.util.LinkedList;
import java.util.Queue;

public class PrintQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1); q.add(2); q.add(3); q.add(4); q.add(5);
        // Built in method
        System.out.println(q);
        // using extra space
        Queue<Integer> tempq = new LinkedList<>();
        while(q.size()!=0){
            System.out.print(q.peek()+" ");
            tempq.add(q.peek());
            q.remove();
        }
        while (tempq.size()!=0){
            q.add(tempq.peek());
            tempq.remove();
        }
        System.out.println(q);
    }
}
