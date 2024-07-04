public class Interning {
    public static void main(String[] args) {
        String s = "Vivek";
        // If we want to change String
        // Vivek -> Vikash
//        s.charAt(2) = 'a' ;  Error dega
//        s.charAt(3) = 's' ;  Error dega
//        s.charAt(4) = 'h' ;  Error dega
        // individually change nhi ho raha hai string me
        s = "Vikash";

        String r = "Vikash";
        System.out.println(s);
        System.out.println(r);
    }
}
