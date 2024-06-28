public class PlusOperator {
    public static void main(String[] args) {
        String s = "abc";
        String t = "pqr";
        s += t;
        System.out.println(s);
        s = 10 + s ;
        System.out.println(s);
        s = s +  10 + 'z';
        System.out.println(s);

        System.out.println("abc"+10+20);  // Hierachary use hota hai yaha
        System.out.println(10+20+"abc"); // yaha bhi hierachary use hota hai

    }
}
