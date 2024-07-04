public class SubString {
    public static void main(String[] args) {
        String s = "abcd";
//        System.out.println(s.substring(1)); // print bcde
//        System.out.println(s.substring(1,4)); // print bcd
//        System.out.println(s.substring(2,3));
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                System.out.print(s.substring(i,j+1)+" ");
            }
        }
    }
}
