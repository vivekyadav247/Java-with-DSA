public class LinkedListofStack {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static class StackLL{
        Node head ;
        int size ;
        void push(int val){
            Node temp = new Node(val);
            temp.next = head;
            head = temp;
            size++;
        }
        int size(){
            return size;
        }
        int pop(){
            if(head==null) throw new Error("Stack is Empty");
            int x = head.val;
            head = head.next;
            size--;
            return x ;
        }
        int peek(){
            if(head==null) throw new Error("Stack is Empty");
            return head.val;
        }
        boolean isEmpty(){
            if(head==null) return true ;
            else return false;
        }
        void display(){
            displayrec(head);
            System.out.println();
        }
        void displayrec(Node h){
            if(h==null) return ;
            displayrec(h.next);
            System.out.print(h.val+" ");
        }

    }
    public static void main(String[] args) {
        StackLL stll = new StackLL();
        stll.isEmpty();
        stll.push(10);
        stll.push(20);
        stll.push(30);
        stll.push(40);
        stll.push(50);
        stll.display();
        System.out.println(stll.size());
        stll.isEmpty();
        stll.pop();
        System.out.println(stll.peek());
        stll.pop();
        stll.display();
        System.out.println(stll.size());
    }
}
