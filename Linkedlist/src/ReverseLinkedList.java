public class ReverseLinkedList {
    public static void reverseprint(Node a){
        if(a==null) return ;
        reverseprint(a.next);
        System.out.print(a.val+" ");
    }
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(17);
        Node c = new Node(29);
        Node d = new Node(43);
        Node e = new Node(76);
        a.next = b ;
        b.next = c ;
        c.next = d ;
        d.next = e ;
        reverseprint(a);
    }
}
