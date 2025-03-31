import java.util.HashMap;

public class MapIterate {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Vivek",07);
        map.put("Raghav",76);
        map.put("Raja",82);
        map.put("Kundan",86);
        map.put("Ritu",15);
        map.put("Vivek",map.getOrDefault("Vivek",0)+1) ;
        //  3 types of iterate in HashMAp using for each loop

        // Iterate by KeySet Stl function (More Use)
        for(String key : map.keySet()){
            int val = map.get(key);
            System.out.print(key+" "+val+"  ");
        }
        System.out.println();

        // Iterate by value Stl function (Less Use)
        for(int val : map.values()){
            System.out.println(val);
        }
        System.out.println();

        // Iterate by EntrySet Stl function (Less Use)
        for(Object ele : map.entrySet()){
            System.out.print(ele+" ");
        }
    }
}
