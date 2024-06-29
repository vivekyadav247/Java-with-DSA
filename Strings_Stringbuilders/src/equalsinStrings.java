public class equalsinStrings {
    public static void main(String[] args) {
        String str1 = "abcxyz";
        String str = "abcxyz";
        System.out.println(str==str1); // == compare addresses of Strings
        String str2 = "abc";
        str2 += "xyz";
        System.out.println(str1==str2 ); // == compare addresses of Strings
        System.out.println(str1.equals(str2)); // str1.equals(str2) compare character by character
    }
}
