import java.util.HashSet;

public class AddSameInSet {
    public static void main(String[] args) {

        // In Hashset only one occurence  of every element
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(10);
        set.add(10);
        set.add(10);
        System.out.println(set);
        System.out.println(set.size());
        set.remove(10);
        System.out.println(set);
        System.out.println(set.size());
    }
}
