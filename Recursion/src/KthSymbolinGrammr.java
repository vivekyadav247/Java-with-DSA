public class KthSymbolinGrammr {
    public static int kthGrammar(int n, int k) {
        if(n < 3)
            return k - 1;
        int half = (int)Math.pow(2, n - 2);
        if(k <= half)
            return kthGrammar(n - 1, k);
        return kthGrammar(n - 1, k - half) == 0? 1 : 0;
    }
    public static void main(String[] args) {
        int n = 4;
        int k = 4;
        if(k<=Math.pow(n,2)) {
            System.out.println(kthGrammar(n, k));
        }
        else System.out.println("Invalid k ");
    }
}