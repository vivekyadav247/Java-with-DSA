import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(6
        );
        arr.add(0,10);
        arr.add(1,20);
        arr.add(2,30);
        arr.add(3,40);
        arr.add(4,50);
        arr.add(5,60);

        System.out.println(arr.size());
        System.out.println(arr);

        arr.set(2,100); // modify the value of index  2
        System.out.println(arr);

        arr.add(90); /// Push back
        System.out.println(arr.size());
        System.out.println(arr);

    }
}
