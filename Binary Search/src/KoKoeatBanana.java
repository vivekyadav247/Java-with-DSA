public class KoKoeatBanana {
    public static int minEatingSpeed(int[] piles, int h) {
        int mx = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<piles.length;i++){
            if(piles[i]>mx) mx = piles[i];
        }
        int lo = 1 , hi = mx ;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2 ;
            long sum = 0;
            for(int i=0;i<piles.length;i++){
                sum += (piles[i]+mid-1)/mid;
            }
            if(sum>h) lo = mid + 1;
            else {
                hi = mid - 1 ;
                if(mid<min) min = mid ;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] arr = {30,11,23,4,20};
        int h = 5 ;
//        minEatingSpeed(arr,h);
        System.out.println(minEatingSpeed(arr,h));
    }

}
