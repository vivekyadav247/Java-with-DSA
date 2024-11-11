import java.util.Collections;
import java.util.PriorityQueue;
public class BasicHeapCollectionFramework {
    public static void main(String[] args) {
        /// Heap are two types
        // 1. Min Heap  and  2. Max Heap

        /// Min Heap
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        pq1.add(2);
        System.out.println(pq1+" "+pq1.peek());
        pq1.add(1);
        System.out.println(pq1+" "+pq1.peek());
        pq1.add(10);
        System.out.println(pq1+" "+pq1.peek());
        pq1.remove();
        System.out.println(pq1+" "+pq1.peek());
        pq1.add(0);
        System.out.println(pq1+" "+pq1.peek());
        pq1.add(-34);
        System.out.println(pq1+" "+pq1.peek());
        System.out.println("\n");


        /// Max Heap
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Collections.reverseOrder());
        pq2.add(2);
        System.out.println(pq2+" "+pq2.peek());
        pq2.add(1);
        System.out.println(pq2+" "+pq2.peek());
        pq2.add(10);
        System.out.println(pq2+" "+pq2.peek());
        pq2.remove();
        System.out.println(pq2+" "+pq2.peek());
        pq2.add(0);
        System.out.println(pq2+" "+pq2.peek());
        pq2.add(34);
        System.out.println(pq2+" "+pq2.peek());

    }
}