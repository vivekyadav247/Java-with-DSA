package AssignmentQuestion;

public class BS_Q6 {
    public static void main(String[] args) {
         int x = 16 ;
         Completestair(x);
         System.out.println(Completestair(x));
    }
    public static int Completestair(int x){
        int lo = 1 , hi = x ;
        int stair = 0 ;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            int sum = 0 ;
            for (int i = 1; i <= mid ; i++) {
                sum += i ;
            }
            if(sum>x) hi = mid - 1 ;
            else{
                stair = mid ;
                lo = mid + 1 ;
            }
        }
        return stair ;
    }
}
