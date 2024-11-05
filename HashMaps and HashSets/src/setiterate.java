import java.util.HashSet;
import java.util.Iterator;

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
        System.out.println("Iterating using For Each Loop:");
        for(int x : set){
            System.out.print(x+" ");
        }
        System.out.println();

        System.out.println("Iterating using Iterator:");
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            System.out.print(element+" ");
        }
    }
}
