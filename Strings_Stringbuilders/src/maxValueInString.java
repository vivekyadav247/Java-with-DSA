public class maxValueInString {
    public static void main(String[] args) {
        String arr[] = {"19903","646623766","0005654","7823767865875454587845687456","4546545145","75877653"};
        String maxs = arr[0];
        for (int i = 0; i < arr.length; i++) {
            maxs = max(maxs,arr[i]);
        }
        System.out.print(maxs);
    }
    public static String max(String a , String b){
        String s = purify(a) , t = purify(b);
        if(s.length()>t.length()) return a ;
        if(s.length()<t.length()) return b ;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)!=t.charAt(i)){
                if(s.charAt(i)>t.charAt(i)) return a ;
                else return b ;
            }
        }
        if(a.length()>=b.length())  return a ;
        else return b ;
    }
    public static String purify(String s){
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)!=0) return s.substring(i);
        }
        return s ;
    }
}
