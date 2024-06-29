public class StringBuilderFunction {
    public static void main(String[] args) {

        // lowercase and Upper case function are not work
        StringBuilder sb = new StringBuilder("Vivek");
        StringBuilder tb = new StringBuilder("Vikash");
        System.out.println(sb.compareTo(tb));
        System.out.println(sb.length());
        System.out.println(sb.indexOf("k"));

        // set any character in string are possible in StringBuilder
        sb.setCharAt(1,'v');
        System.out.println(sb);
    }
}
