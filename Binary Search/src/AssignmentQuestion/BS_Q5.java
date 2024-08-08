package AssignmentQuestion;

public class BS_Q5 {
    public static void main(String[] args) {
        int n = 45;
        ValidSqrornot(n);
        if(ValidSqrornot(n)==true) System.out.println("Yes , this number have perfect square.");
        else System.out.println("No, this number have not perfect square.");
    }
    public static boolean ValidSqrornot(int x){
        int lo = 1 , hi = x ;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2 ;
            int d = x/mid ;
            if(d==mid) return true;
            else if(d>mid) lo = mid + 1;
            else hi = mid - 1;
        }
        return false ;
    }
}
