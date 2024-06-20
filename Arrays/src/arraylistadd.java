import java.util.ArrayList;

public class arraylistadd {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println(arr+" "+arr.size());
        arr.add(29);
        System.out.println(arr+" "+arr.size());
        arr.add(459);
        System.out.println(arr+" "+arr.size());
        arr.add(90);
        System.out.println(arr+" "+arr.size());
        arr.add(60);
        System.out.println(arr+" "+arr.size());
        arr.remove(2); // this remove element of index no. entered
        System.out.println(arr+" "+arr.size());
    }
}
