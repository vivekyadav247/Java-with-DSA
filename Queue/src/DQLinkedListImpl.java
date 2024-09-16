public class DQLinkedListImpl {
    public static class DNode{
        int val ;
        DNode next ;
        DNode prev ;
        DNode(int val){
            this.val = val ;
        }
    }
    public static class DequeLL{
        DNode head = null;
        DNode tail = null;
        int size = 0;
        void addFirst(int val){
            DNode temp = new DNode(val);
            if(size==0){
                head = tail = temp;
            }
            else{
                head.prev = temp;
                temp.next = head;
                head = head.prev;
            }
            size++;
        }
        void add(int val){
            DNode temp = new DNode(val);
            if(size==0){
                head = tail = temp;
            }
            else{
                tail.next = temp;
                temp.prev = tail;
                tail = tail.next;
            }
            size++;
        }
        void addLast(int val){
            add(val);
        }
        int removeFirst(){
            if(size==0) throw new Error("Queue is Empty");
            else{
                int x = head.val;
                head = head.next;
                head.prev = null;
                size--;
                return x;
            }
        }
        int removeLast(){
            if(size==0) throw new Error("Queue is Empty!");
            else{
                int x = tail.val;
                tail = tail.prev;
                tail.next = null;
                size--;
                return x;
            }
        }
        int remove(){
            return removeFirst();
        }
        int getFirst(){
            return head.val;
        }
        int getLast(){
            return tail.val ;
        }
        void display(){
            DNode temp = head;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        DequeLL dq = new DequeLL();
        dq.addLast(1);
        dq.addLast(2);
        dq.addLast(3);
        dq.addLast(4);
        dq.display();
        dq.addFirst(5);
        dq.display();
        dq.removeLast();
        dq.display();
        dq.removeFirst();
        dq.display();
        System.out.println(dq.getFirst());
        System.out.println(dq.getLast());
    }
}
