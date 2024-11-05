import java.util.HashSet;

public class basichashsets {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        // Insert : TC = O(1)
        set.add(20);
        set.add(200);
        set.add(100);
        set.add(-8);
        set.add(10);
        System.out.println(set); // TC to print : O(n)
        set.remove(100);   // TC ro remove : O(1)
        System.out.println(set);
        // TC of Size : O(1)
        System.out.println(set.size());
        System.out.println(set.contains(100));

        // Built In function to convert HashSet to Array
        Object[] arr = set.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
