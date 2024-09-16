public class CircularQueueLinkedList {
    public static class Node{
        int val;
        Node next;
        public Node(int val){
            this.val = val;
        }
    }
    public static class CircularQueueLL{
        Node head = null;
        Node tail = null ;
        int size = 0;
        void add(int val){
            Node temp = new Node(val);
            if(size==0){
                head = tail = temp;
                tail.next = head;
            }
            else{
                tail.next = temp;
                tail = tail.next;
                tail.next = head;
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
            tail.next = head;
            size--;
            return x;
        }
        void display(){
            if(size==0)
                System.out.println("Queue is Empty!");
            else {
                Node temp = head;
                System.out.print(temp.val + " ");
                temp = temp.next;
                while (temp != head) {
                    System.out.print(temp.val + " ");
                    temp = temp.next;
                }
                System.out.println();
            }
        }
        boolean isEmpty(){
            if(size==0) return  true;
            else return false;
        }
    }
    public static void main(String[] args) {
        CircularQueueLL q = new CircularQueueLL();
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
        q.display(); // 2 3 4 5 6
    }
}
