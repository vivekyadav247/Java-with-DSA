public class appendbuiltinfn {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abcde");
        System.out.println(sb);
        sb.append(35);
        System.out.println(sb);
        sb.append("*");
        System.out.println(sb);
        sb.append("xyz");
        System.out.println(sb);
        char[] ch = {'r','a','j','a'};
        sb.append(ch);
        System.out.println(sb);
//        int[] arr = {1,2,3,4,5};
//        sb.append(arr); //does not work , adrress  is appended
//        System.out.println(sb);
        StringBuilder sb1 = new StringBuilder("babu");
        sb.append(sb1);
        System.out.println(sb);
        // s+= "fung"; // not possible
    }
}
