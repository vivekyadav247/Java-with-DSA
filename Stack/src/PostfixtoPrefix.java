import java.util.Stack;

public class PostfixtoPrefix {
    public static void main(String[] args) {
        String str = "953+4*6/-";
        Stack<String> val = new Stack<>();
        for (int i = 0; i < str.length() ; i++) {
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if(ascii>=48 && ascii<=57){
                String s = ""+ch;
                val.push(s);
            }
            else{
                String val2 = val.pop();
                String val1 = val.pop();
                val.push(ch+val1+val2);
            }
        }
        System.out.println(val.peek());
    }
}