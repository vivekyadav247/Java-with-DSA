import java.util.HashMap;
public class MapsBasic {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Vivek",2407);
        map.put("Raghav",76);
        map.put("Raja",82);
        map.put("Kundan",86);
        map.put("Ritu",15);
        System.out.println(map);  // TC -> O(1)
        System.out.println(map.get("Vivek"));
        System.out.println(map.size());
        map.remove("Raghav");
        System.out.println(map);
        System.out.println(map.containsKey("Vikash"));
        System.out.println(map.containsValue(2407));
        System.out.println(map.keySet());
        System.out.println(map.entrySet());

//  --------------------------------------------------------------------------
        // Collection Framework STL function for Map

        //  Put
        //  Get
        //  Size
        //  Remove
        //  ContainsKey
        //  ContainsValue
        //  KeySet
        //  EntrySet
    }
}
