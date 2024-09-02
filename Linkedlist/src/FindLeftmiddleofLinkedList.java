public class FindLeftmiddleofLinkedList {
    public static Node leftmiddle(Node head){
        Node slow = head;
        Node fast = head;
        while(fast.next != null && fast.next.next!=null ){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        LinkedList a = new LinkedList();
        a.addhead(1);
        a.addNode(2);
        a.addNode(3);
        a.addNode(4);
        a.addNode(5);
        a.addNode(6);
        LinkedList b = new LinkedList();
        b.addNode(1);
        b.addNode(2);
        b.addNode(3);
        b.addNode(4);
        b.addNode(5);
        System.out.println(leftmiddle(b.head).val);
    }
}
