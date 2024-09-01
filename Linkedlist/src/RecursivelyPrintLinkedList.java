public class RecursivelyPrintLinkedList {
    public static void print(Node a){
        Node temp = a;
        if(temp==null) return ;
        System.out.print(temp.val+" ");
        print(temp.next);
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
        print(a);
    }
}
