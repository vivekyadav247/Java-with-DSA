import java.util.Stack;

public class PrefixtoPostfix {
    public static void main(String[] args) {
        String str = "-9/*+5346";
        Stack<String> val = new Stack<>();
        for (int i = str.length()-1; i >=0; i--) {
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if(ascii>=48 && ascii<=57){
                String s = ""+ch;
                val.push(s);
            }
            else{
                String val1 = val.pop();
                String val2 = val.pop();
                val.push(val1+val2+ch);
            }
        }
        System.out.println(val.peek());
    }
}