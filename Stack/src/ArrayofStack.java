class Stack{
    private int[] arr = new int[5];
    private int idx = 0;
    void push(int top){
        if(isFull()) throw new Error("Stack IS FULL");
        arr[idx] = top ;
        idx++;
    }
    int peek(){
        if(idx==0) throw new Error("Stack is empty");
        return arr[idx-1];
    }
    int pop(){
        if(idx==0) throw new Error("Stack is empty");
        int x = arr[idx-1];
        idx--;
        return x;
    }
    void display(){
        for (int i = 0; i < idx; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    int size(){
        return idx;
    }
    boolean isEmpty(){
        if(idx==0) return true;
        else return false;
    }
    boolean isFull(){
        if(arr.length==idx) return true;
        else return false;
    }
}
public class ArrayofStack {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.isEmpty();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st.size());
        st.display();
        System.out.println(st.isFull());
        System.out.println(st.peek());
        st.pop();
        st.display();
        System.out.println(st.size());
    }
}
