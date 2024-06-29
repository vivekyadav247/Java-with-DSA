public class StringBuilderinJava {
    public static void main(String[] args) {
        // Declaration and Initialization
        StringBuilder s = new StringBuilder("abcde");
        System.out.println(s.length());
        System.out.println(s);

        // Empty String in StringBuilder
        StringBuilder a = new StringBuilder();
        System.out.println(a.length());
        System.out.println(a.capacity());  // by default String ki capacity 16 hoti hai

        // Here 10 is capacity 10 khali dabbe ban jayenge jisme hum character add kar sakte hai
        // or length hamesha used dabe ki hoti hai
        StringBuilder x = new StringBuilder(10);
        System.out.println(x.length());
        System.out.println(x.capacity());

        String y = "Vivek Yadav";
        StringBuilder z = new StringBuilder(y);
        System.out.println(z);
    }
}
