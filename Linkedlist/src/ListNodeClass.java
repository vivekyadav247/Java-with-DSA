
class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
public class ListNodeClass {
    public static void main(String[] args){
        Node a = new Node(10);
        Node b = new Node(17);
        Node c = new Node(29);
        Node d = new Node(43);
        Node e = new Node(76);
        a.next = b ; // 10->17
        b.next = c ; // 10->17->29
        c.next = d ; // 10->17->29->43
        d.next = e ; // 10->17->29->43->76

        System.out.println(a.val);
        System.out.println(a.next.val);
        System.out.println(a.next.next.val);
        System.out.println(a.next.next.next.val);
        System.out.println(a.next.next.next.next.val);
    }
}