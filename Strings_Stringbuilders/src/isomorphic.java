public class isomorphic {
    public static void main(String[] args) {
        boolean x = true ;
        String s = "race" ;
        String t = "moed" ;
        // for s prespective
        char[] ch = new char[128];
        for(int i = 0; i<s.length(); i++){
            char a = s.charAt(i);
            char b = t.charAt(i);
            int idx = (int)a;
            if(ch[idx] == '\0' ) ch[idx] = t.charAt(i);
            else {
                if(ch[idx] != b){
                    x = false ;
                    break ;
                }
            }
        }
        // for t prespective
        char[] dh = new char[128];
        for(int i = 0; i<t.length(); i++){
            char a = t.charAt(i);
            char b = s.charAt(i);
            int idx = (int)a;
            if(dh[idx] == '\0' ) dh[idx] = s.charAt(i);
            else {
                if(dh[idx] != b) {
                    x = false ;
                    break ;
                }
            }
        }
        System.out.println(x);
    }
}
