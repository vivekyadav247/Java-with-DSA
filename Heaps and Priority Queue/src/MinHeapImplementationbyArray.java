import java.util.ArrayList;
import java.util.List;

class MinHeap{
    int arr[] ;
    int size ;
    MinHeap(int capacity){
        arr = new int[capacity] ;
        size = 0;
    }
    void add(int ele){
        if(size==arr.length) throw new Error("Heap is Full !");
        arr[size++] = ele ;
        upheapify(size-1);
    }
    int remove(){
        if(size==0) throw new Error("Heap is null");
        int peek = arr[0];
        swap(0,size-1);
        size--;
        downheapify(0);
        return peek ;
    }
    int peek(){
        return arr[0];
    }
    void upheapify(int idx){
        if(idx==0) return ;
        int parent = (idx-1)/2 ;
        if(arr[parent]>arr[idx]){
            swap(idx,parent);
            upheapify(parent);
        }
    }
    void downheapify(int i){
        if(i>=size-1) return;
        int lc = 2*i + 1 , rc = 2*i + 2;
        int minidx = i ;
        if(lc<size && arr[lc]<arr[minidx]) minidx = lc ;
        if(rc<size && arr[rc]<arr[minidx]) minidx = rc ;
        if(i==minidx) return ;
        swap(i,minidx);
        downheapify(minidx);
    }
    void swap(int i, int j){
        int temp = arr[i] ;
        arr[i] = arr[j] ;
        arr[j] = temp;
        return ;
    }
    int size(){
        return size ;
    }
    void print(){
        List<Integer> dis = new ArrayList<>();
        for(int i=0; i<size(); i++) {
            dis.add(arr[i]);
        }
        System.out.println(dis);
    }
}
public class MinHeapImplementationbyArray {
    public static void main(String[] args) {
        MinHeap mh = new MinHeap(10);
        mh.add(2);
        mh.add(8);
        mh.add(15);
        mh.add(16);
        System.out.println(mh.size());
        mh.print();
        mh.remove();
        mh.print();
        System.out.println(mh.peek());
    }
}
