public class functionsofStrings {
    public static void main(String[] args) {
        String s = "Vivek Yadav";
        // indexOf()
        System.out.println(s.indexOf('V'));
        System.out.println(s.indexOf('v'));
        System.out.println(s.lastIndexOf('v'));

        // compareTo()
        String a = "abcddddd";
        String b = "abc";
        System.out.println(a.compareTo(b));

        // contains() or startswith() or endswithfunction()
        String x = "Jay Shree Ram";
        System.out.println(x.contains("Ra"));
        System.out.println(x.startsWith("Jay"));
        System.out.println(x.endsWith("am"));

        // toLowerCase() and concat() and toUpperCase()
        String v = "Vivek Yadav is 18 years";
        System.out.println(v.toLowerCase());
        System.out.println(v.toUpperCase());
        String str1 = "abcd";
        String str2 = "xyz";
        System.out.println(str1.concat(str2));

        //Empty String
        String e = "";
        System.out.println(e.length());
    }
}
