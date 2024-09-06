class DCLL{
    DNode head;
    DNode tail;
    int size;
    void display(){
        DNode temp = head;
        System.out.print(temp.val+" ");
        temp = temp.next;
        while(temp!=head){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    void add(int val){
        insertAttail(val);
    }
    void insertAttail(int val){
        DNode temp = new DNode(val);
        if(head==null){
            head = tail = temp;
            tail.next = head;
            head.prev = tail;
        }
        else{
            tail.next = temp;
            temp.prev = tail;
            tail = tail.next;
            tail.next = head;
            head.prev = tail;
        }
        size++;
    }
    void insertAthead(int val){
        DNode temp = new DNode(val);
        if(size==0){
            head = tail = temp;
            tail.next = head;
            head.prev = tail;
        }
        else{
            temp.next = head;
            head.prev = temp;
            head = temp ;
            tail.next = head;
            head.prev = tail;
        }
        size++;
    }
    void insertAtindex(int idx, int val){
        if(idx==0) insertAthead(val);
        if(idx==size) insertAttail(val);
        if(idx<0 || idx>size) throw new Error("Invalid Index");
        DNode temp = new DNode(val);
        DNode x = head;
        for(int i=1;i<=idx-1;i++){
            x = x.next;
        }
        DNode y = x.next;
        temp.next = y;
        y.prev = temp;
        x.next = temp;
        temp.prev = x;
        tail.next = head;
        head.prev = tail;
        size++;
    }
    void deletehead(){
        head = head.next;
        head.prev = tail;
        tail.next = head;
        size--;
    }
    void deletetail(){
        tail = tail.prev ;
        tail.next = head;
        head.prev = tail;
        size--;
    }
    void deleteAtindex(int idx){
        if(idx==0) deletehead();
        if(idx==size-1) deletetail();
        if(idx<0 || idx>size) throw new Error("Invalid Index");
        DNode temp = head;
        for (int i = 1; i <= idx-1 ; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        temp = temp.next;
        temp.prev = temp.prev.prev;
        tail.next = head;
        head.prev = tail;
        size--;
    }
    int gethead(){
        return head.val;
    }
    int gettail(){
        return tail.val;
    }
    int getatindex(int idx){
        if(idx==0) return gethead();
        if(idx==size) return gettail();
        if(idx<0 || idx>size) throw new Error("Invalid Index");
        DNode temp = head ;
        for (int i = 1; i <= idx ; i++) {
            temp =temp.next;
        }
        return temp.val;
    }
    void sethead(int val){
        head.val = val;
    }
    void settail(int val){
        tail.val = val;
    }
    void setAtindex(int idx, int val){
        if(idx==0) sethead(val);
        if(idx==size)  settail(val);
        if(idx<0 || idx>size) throw new Error("Invalid Index");
        DNode temp = head;
        for (int i = 1; i <= idx ; i++) {
            temp = temp.next;
        }
        temp.val = val;
    }
}
public class DoublyCircularLinkedList {
    public static void main(String[] args) {
        DCLL list = new DCLL();
        list.add(1);
        list.add(5);
        list.insertAttail(6);
        list.display();
        System.out.println(list.size);
        list.insertAthead(0);
        list.display();
        System.out.println(list.size);
        list.insertAtindex(2,3);
        list.insertAtindex(2,2);
        list.insertAtindex(4,4);
        list.display();
        System.out.println(list.size);
        list.deletehead();
        list.display();
        System.out.println(list.size);
        list.deletetail();
        list.display();
        System.out.println(list.size);
        list.deleteAtindex(3);
        list.display();
        System.out.println(list.size);
        list.setAtindex(0,10);
        list.setAtindex(1,20);
        list.setAtindex(2,30);
        list.setAtindex(3,40);
        list.display();
        System.out.println(list.size);
        System.out.println(list.gethead());
        System.out.println(list.gettail());
        System.out.println(list.getatindex(1));
    }
}
