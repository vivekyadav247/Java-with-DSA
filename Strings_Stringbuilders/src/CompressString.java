public class CompressString {
    public static void main(String[] args) {
        String s = "abaaddnnr";
        char[] ch = s.toCharArray();
        String ans = "";
        int i = 0 , j = 0;
        while(j<ch.length){
            if(ch[i]==ch[j]) j++ ;
            else{
                ans += ch[i];
                int l = j - i ;
                if(l>1) ans += l ;
                i = j ;
            }
        }
        ans += ch[i];
        int l = j - i ;
        if(l>1) ans += l ;
        for (int k = 0; k < ans.length(); k++) {
            ch[k] = ans.charAt(k);
            System.out.print(ch[k]+" ");
        }
        System.out.println();
        System.out.println(ans.length());
    }
}
