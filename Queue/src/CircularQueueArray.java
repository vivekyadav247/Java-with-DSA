public class CircularQueueArray {
    public static class CircularQueueArr{
        int front = -1;
        int rear = -1;
        int size = 0;
        int[] arr = new int[5];
        void add(int val){
            if(size==arr.length){
                throw new Error("Queue is full");
            }
            else if(size==0){
                front = rear = 0;
                arr[0] = val;
            }
            else if(rear<arr.length-1){
                arr[++rear] = val;
            }
            else if(rear==arr.length-1){
                rear = 0;
                arr[0] = val;
            }
            size++;
        }
        int remove(){
            if(size==0) throw new Error("Queue is empty");
            else if(front==arr.length-1){
                int val = arr[front];
                front = 0;
                size--;
                return val;
            }
            else{
                int val = arr[front];
                front++;
                size--;
                return val;
            }
        }
        int peek(){
            if(size==0) throw new Error("Queue is Empty!");
            else return arr[front];
        }
        boolean isEmpty(){
            if(size==0) return true;
            else return false;
        }
        void display(){
            if(size==0) System.out.println("Queue is Empty!");
            else if(front<=rear){
                for (int i = front; i <= rear ; i++) {
                    System.out.print(arr[i]+" ");
                }
            }
            else{
                for(int i = front; i<= arr.length-1;i++){
                    System.out.print(arr[i]+" ");
                }
                for (int i = 0; i <= rear ; i++) {
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        CircularQueueArr q = new CircularQueueArr();
        q.display();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.display(); // 1 2 3 4
        q.remove();
        q.display(); //   2 3 4
        q.add(5);
        q.display(); //   2 3 4 5
        q.add(6);
        q.display(); // 6 2 3 4 5  --> 2 3 4 5 6
        for (int i = 0; i < q.arr.length; i++) {
            System.out.print(q.arr[i]+" ");
        }
    }
}
