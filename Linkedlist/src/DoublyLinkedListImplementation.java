class DNode{
    int val;
    DNode next;
    DNode prev;
    DNode(int val){
        this.val = val;
    }
}
class DLL{
    DNode head;
    DNode tail;
    int size;
    void display(){
        DNode temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    void add(int val){
        insertAtTail(val);
    }
    void insertAtTail(int val){
        DNode temp = new DNode(val);
        if(size==0) head = tail = temp;
        else{
            tail.next = temp;
            temp.prev = tail;
            tail = tail.next;
        }
        size++;
    }
    void insertAthead(int val){
        DNode temp = new DNode(val);
        if(size==0) head = tail = temp ;
        else{
            head.prev = temp;
            temp.next = head;
            head = head.prev;
        }
        size++;
    }
    void insertAtindex(int idx, int val){
        if(idx==0){
            insertAthead(val);
        }
        if(idx==size){
            insertAtTail(val);
        }
        if(idx<0 || idx>size) throw new Error("Invalid Index");
        DNode temp = new DNode(val);
        DNode x = head;
        for (int i = 1; i <= idx-1 ; i++) {
            x = x.next;
        }
        DNode y = x.next;
        x.next = temp; temp.prev = x;
        temp.next = y; y.prev = temp;
        size++;
    }
    void deletehead(){
        if(size==0) throw new Error("List is Null");
        head = head.next;
        head.prev = null;
    }
    void deletetail(){
        if(size==0) throw new Error("List is Null");
        tail = tail.prev ;
        tail.next = null;
    }
    void deleteindex(int idx){
        if(idx==0){
            deletehead();
        }
        if(idx==size-1){
            deletetail();
        }
        if(idx<0 || idx>size) throw new Error("Invalid Index");
        DNode temp = head;
        for (int i = 1; i <= idx-1 ; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        temp = temp.next;
        temp.prev = temp.prev.prev;

    }
    int gethead(){
        return head.val;
    }
    int gettail(){
        return tail.val;
    }
    int get(int idx){
        if(idx==0){
            return  gethead();
        }
        if(idx==size){
            return gettail();
        }
        DNode temp = head;
        for (int i = 1; i <= idx ; i++) {
            temp = temp.next;
        }
        return temp.val;
    }
    void sethead(int val){
        head.val = val;
    }
    void settail(int val){
        tail.val = val;
    }
    void set(int idx, int val){
        if(idx==0) sethead(val);
        if(idx==size) settail(val);
        DNode temp = head;
        for (int i = 1; i <= idx; i++) {
            temp = temp.next;
        }
        temp.val = val;
    }
}
public class DoublyLinkedListImplementation {
    public static void print(DNode head){
        DNode temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void printreverse(DNode head){
        DNode temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.prev;
        }
        System.out.println();
    }
    public static void disp(DNode head){
        DNode temp = head;
        while(temp.prev!=null){
            temp = temp.prev;
        }
        print(temp);
    }
    public static void main(String[] args) {
        DLL list = new DLL();
        list.display();
        list.add(10);
        list.add(20);
        list.insertAtTail(40);
        list.display();
        System.out.println(list.size);
        list.insertAthead(5);
        list.display();
        System.out.println(list.size);
        list.insertAtindex(2,25);
        list.display();
        System.out.println(list.get(2));
        list.deletehead();
        list.display();
        list.deletetail();
        list.display();
        list.deleteindex(1);
        list.display();
        list.insertAtTail(50);
        list.insertAtTail(30);
        list.display();
        list.set(2,25);
        list.display();
    }
}
