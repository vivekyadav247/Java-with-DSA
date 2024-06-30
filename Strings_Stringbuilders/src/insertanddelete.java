public class insertanddelete {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abcdef");
        System.out.println(sb);
        sb.deleteCharAt(3);
        System.out.println(sb); // abcef
        sb.append("xyz");
        System.out.println(sb); // abcefxyz
        sb.delete(2,5); // if delete cef ,(i,j-1 delete hota hai yaha i = 2 , j = 5)
        System.out.println(sb); // abxyz
//        sb.setCharAt(2,'g'); // here g replace x at index 2 // abgyz
//        System.out.println(sb);
        sb.insert(2,'g'); // abgxyz // we can add character
        sb.insert(3,67);  // abg67xyz // we can add integer
        sb.insert(5,true);  // abg67truexyz // we can add boolean
        sb.insert(9,"svg"); // abg67truesvgxyz // we can add string
        System.out.println(sb);
    }
}
