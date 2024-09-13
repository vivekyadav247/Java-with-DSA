import java.util.Stack;

public class PrefixtoInfix {
    public static void main(String[] args) {
        String str = "-9/*+5346";
        Stack<String> val = new Stack<>();
        for (int i = str.length()-1; i >=0; i--) {
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if(ascii>=48 && ascii<=57){
                String s =""+ch;
                val.push(s);
            }
            else{
                String val1 = val.pop();
                String val2 = val.pop();
                if(ch=='+')
                    val.push('('+val1+ch+val2+')');
                else if(ch=='-')
                    val.push('('+val1+ch+val2+')');
                else if(ch=='*')
                    val.push('('+val1+ch+val2+')');
                else if(ch=='/')
                    val.push('('+val1+ch+val2+')');
            }
        }
        System.out.println(val.peek());
    }
}
