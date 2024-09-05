class LinkedList{
    Node head;
    Node tail;
    int length;
    void addNode(int val){
        Node temp = new Node(val);
        if(head==null) head=tail=temp ;
        else{
            tail.next = temp;
            tail = temp ;
        }
        length++;
    }
    void addhead(int val){
        Node temp = new Node(val);
        if(head==null) head=tail=temp;
        else {
            temp.next = head;
            head = temp;
        }
        length++;
    }
    void insertNode(int idx,int val){
        if(idx==length) addNode(val);
        if(idx<0 || idx>=length) throw new Error("Invalid index");
        Node temp = new Node(val);
        Node x = head;
        for (int i = 1; i <= idx-1 ; i++) {
            x = x.next;
        }
        temp.next = x.next;
        x.next = temp ;
        length++;
    }
    void deletehead(){
        if(head==null) throw new Error("Invalid Index");
        head = head.next;
        length--;
    }
    void delete(int idx){
        if(head==null) throw new Error("Invalid index");
        if(idx<0 || idx>=length) throw new Error("Invalid index");
        Node temp = head;
        for (int i = 0; i < idx-1; i++) {
            temp = temp.next;
        }
        if(temp.next==tail) tail = temp;
        temp.next = temp.next.next;
    }
    int get(int idx){
        Node temp = head;
        for (int i = 1; i <= idx-1 ; i++) {
            temp = temp.next;
        }
        return temp.val;
    }
    void set(int idx, int val){
        Node temp = new Node(val);
        Node x = head;
        for (int i = 1; i <= idx-1 ; i++) {
            x = x.next;
        }
        x.val = temp.val ;
    }
    Node merge(Node a, Node b){
        Node dummy = new Node(100);
        Node t = dummy;
        while(a!=null &&  b!=null){
            if(a.val<=b.val){
                t.next = a;
                a = a.next;
            }
            else{
                t.next = b;
                b = b.next;
            }
            t = t.next;
        }
        if(a==null) t.next = b;
        else t.next = a;
        return dummy.next;
    }
    Node reverseList(Node head) {
        Node curr = head;
        Node Next = null;
        Node Prev = null;
        while(curr!=null){
            Next = curr.next;
            curr.next = Prev;
            Prev = curr;
            curr = Next;
        }
        return Prev;
    }
    void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class LL {
    public static void main(String[] args) {
        LinkedList a = new LinkedList();
        a.addhead(2);
        a.addNode(3);
        a.addNode(5);
        a.addNode(7);
        a.insertNode(2,4);
        a.deletehead();
        a.delete(2);
        a.set(2,9);
        a.print();
        System.out.println(a.length);
        System.out.println(a.get(1));

    }
}
