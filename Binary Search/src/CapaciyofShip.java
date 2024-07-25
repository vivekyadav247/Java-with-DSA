public class CapaciyofShip {
    public static boolean Ispossible(int[] arr , int c , int d){
        int load = 0 , days = 1 ;
        for(int i = 0 ; i < arr.length ; i++){
            if(load + arr[i] <= c ) load += arr[i];
            else{
                load = arr[i];
                days++;
            }
        }
        if(days>d) return false ;
        return true ;
    }
    public static void main(String[] args) {
        int[] arr = {3,2,2,4,1,4};
        int d = 3 ;
        int sum = 0 , mx = -1;
        for(int i = 0 ; i < arr.length ; i++){
            sum += arr[i];
            mx = Math.max(arr[i],mx);
        }
        int lo = mx , hi = sum , minc = sum ;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2 ;
            if(Ispossible(arr,mid,d)==true){
                minc = mid ;
                hi = mid - 1 ;
            }
            else lo = mid + 1 ;
        }
        System.out.println(minc);
    }

}
