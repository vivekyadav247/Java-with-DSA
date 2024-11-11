import java.util.*;

public class kthSmallestelement {
    public static void main(String[] args) {
        int[] arr = {10,2,3,8,-6,4,1,0,-2,5};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter K for Kth Smallest Element : ");
        int k = sc.nextInt();
        if(k>arr.length) throw new Error("K is out from array length") ;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int ele : arr){
            pq.add(ele);
            if(pq.size()>k) pq.poll();
        }
        System.out.println(pq.peek());
    }
}
