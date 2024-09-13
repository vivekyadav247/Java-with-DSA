import java.util.Stack;

public class PrefixEvaluation {
    public static void main(String[] args) {
        String str = "-9/*+5346";
        Stack<Integer> val = new Stack<>();
        for (int i = str.length()-1; i >=0; i--) {
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if(ascii>=48 && ascii<=57) val.push(ascii-48);
            else{
                int val1 = val.pop();
                int val2 = val.pop();
                if(ch=='+')
                    val.push(val1+val2);
                else if(ch=='-')
                    val.push(val1-val2);
                else if(ch=='*')
                    val.push(val1*val2);
                else if(ch=='/')
                    val.push(val1/val2);
            }
        }
        System.out.println(val.peek());
    }
}
