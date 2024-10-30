import java.util.HashSet;

public class setiterate {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(20);
        set.add(200);
        set.add(100);
        set.add(-8);
        set.add(10);
        // In a HashSet for iterate
        // we can only use for each loop
        // because hashset have no index
        for(int x : set){
            System.out.print(x+" ");
        }
    }
}
