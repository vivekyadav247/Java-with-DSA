public class LinkedListImplementationofQueue {
    public static class Node{
        int val;
        Node next;

        public Node(int val){
            this.val = val;
        }
    }
    public static class queueLL{
        Node head = null;
        Node tail = null;
        int size = 0;
        void add(int val){
            Node temp = new Node(val);
            if(size==0){
                head = tail = temp;
            }
            else{
                tail.next = temp;
                tail = tail.next;
            }
            size++;
        }
        int peek(){
            return head.val;
        }
        int remove(){
            if(size==0) throw new Error("Queue is Empty");
            int x = head.val;
            head = head.next;
            size--;
            return x;
        }
        void display(){
            if(size==0) throw new Error("Queue is Empty");
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
            System.out.println();
        }
        boolean isEmpty(){
            if(size==0) return  true;
            else return false;
        }
    }
    public static void main(String[] args) {
        queueLL q = new queueLL();
        System.out.println(q.isEmpty());
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
