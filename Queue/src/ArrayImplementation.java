import java.util.Queue;

public class ArrayImplementation {
    public static class queueArr{
        int f = -1;
        int r = -1;
        int size = 0;
        int[] arr  = new int[100];
        public void add(int val){
            if(r==arr.length-1) throw new Error("Queue is full");
            else if(f==-1){
                f = r = 0;
                arr[r] = val;
            }
            else{
                arr[++r] = val;
            }
            size++;
        }
        public int remove(){
            if(size==0) throw new Error("Queue is Empty");
            f++;
            size--;
            return arr[f-1];
        }
        public int peek(){
            return arr[f];
        }
        public  boolean isEmpty(){
            if(size==0) return true;
            else return false;
        }
        public void display(){
            if(size==0) System.out.println();
            for (int i = f; i <= r ; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        queueArr q = new queueArr();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.display();
        q.remove();
        q.display();
        System.out.println(q.size);
        System.out.println(q.peek());
    }
}
