import java.util.ArrayList;
public class SubsetofString {
    static ArrayList<String> arr = new ArrayList<>(); //global
    public static void Subset(int i ,String s,String ans){
        if(i==s.length()) {
            arr.add(ans);
            return;
        }
        Subset(i+1,s,ans); //not take
        Subset(i+1,s,ans+s.charAt(i)); // take
    }
    public static void main(String[] args) {
        String s = "ABCD";
        arr = new ArrayList<>(); //reset
        Subset(0,s,"");
        System.out.println(arr);
    }

}
