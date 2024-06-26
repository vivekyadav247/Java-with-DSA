public class IndexOforCompareTo {
    public static void main(String[] args) {
        String s = "Vivek Yadav";
        // Index of
        System.out.println(s.indexOf('V'));
        System.out.println(s.indexOf('v'));
        System.out.println(s.lastIndexOf('v'));

        // Compare to
        String a = "abcddddd";
        String b = "abc";
        System.out.println(a.compareTo(b));
    }
}
