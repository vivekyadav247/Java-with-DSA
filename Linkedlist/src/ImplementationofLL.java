
class SLL{
    Node head;
     Node tail;
    int size;
    void add(int val){
        Node temp = new Node(val);
        if(head==null) head = tail = temp;
        else{
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    void addhead(int val){
        Node temp = new Node(val);
        if(head==null) head = tail = temp;
        else{
            temp.next = head;
            head = temp;
        }
        size++;
    }
    void insert(int idx, int val){
        if(idx==0) {
            addhead(val);
            return;
        }
        if(idx==size){
            add(val);
            return;
        }
        if(idx>=size || idx<0){
            throw new Error("Invalid Error0");
        }
        Node temp = new Node(val);
        Node x = head ;
        for (int i = 1; i <= idx-1 ; i++) {
            x = x.next ;
        }
        temp.next = x.next;
        x.next = temp ;
        size++;
    }
    void deletehead(){
        if(head==null) throw new Error ("Invalid Size");
        head = head.next;
        size--;
    }
    void delete(int idx){
        if(idx<0 || idx>=size) throw new Error("Invalid index");
        Node temp = head;
        for (int i = 1; i <= idx-1 ; i++) {
            temp = temp.next;
        }
        if(temp.next==tail) tail = temp ;
        temp.next = temp.next.next;
        size--;
    }
    int get(int idx){
        if(idx==size-1) return tail.val;
        if(idx>=size || idx<0){
            throw new Error ("Index sahi se Daal");
        }
        Node temp = head ;
        for (int i = 1; i <= idx ; i++) {
            temp = temp.next;
        }
        return temp.val;
    }
    void  set(int idx, int val){
        if(idx==size-1) tail.val = val;
        if(idx>=size || idx<0){
            throw new Error ("Index sahi se Daal");
        }
        Node temp = head ;
        for (int i = 1; i <= idx ; i++) {
            temp = temp.next;
        }
        temp.val = val;
    }
    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }

}
public class ImplementationofLL {
    // Implementation of Linked List
    public static void main(String[] args) {
        SLL x = new SLL();
        x.add(10);
        x.add(20);
        x.display();
        System.out.println(x.size);
        x.add(97);
        x.display();
        System.out.println(x.size);
        x.addhead(1);
        x.display();
        x.insert(3,80);
        x.display();
        System.out.println(x.get(3));
        x.set(2,200);
        x.display();
        x.deletehead();
        x.display();
        x.delete(2);
        x.display();
    }
}
