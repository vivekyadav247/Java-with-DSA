public class sqrtofxwithBS {
    public static void main(String[] args) {
        int x = 1676534 ;
        int sqrt = 0;
        boolean flag = false ;
        // method -1 in lang data type use
        // here we use mid * mid = x ;
//        long lo = 0 , hi = (long)x ;
//        while(lo<=hi){
//            long mid = lo + (hi-lo)/2 ;
//            if(mid*mid==(long)x) {
//                sqrt = (int)mid;
//                System.out.println(sqrt);
//                flag = true ;
//                break ;
//            }
//            else if(mid*mid>(long)x) hi = mid - 1 ;
//            else lo = mid + 1 ;
//        }
//        if(flag==false){
//            sqrt = (int)hi ;
//            System.out.println(sqrt);
//        }

        // method - 2 for without long data type
        // here we use mid = x/mid ;
        int lo = 0 , hi = x ;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2 ;
            if(mid==x/mid) {
                sqrt = mid;
                System.out.println(sqrt);
                flag = true ;
                break ;
            }
            else if(mid>x/mid) hi = mid - 1 ;
            else lo = mid + 1 ;
        }
        if(flag==false){
            sqrt = hi ;
            System.out.println(sqrt);
        }
    }
}
