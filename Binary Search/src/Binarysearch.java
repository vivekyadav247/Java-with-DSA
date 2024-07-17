public class Binarysearch {
    public static void main(String[] args) {
        int[] arr = {-1,0,3,5,9,12};
        int target = -1 ;
        int n = arr.length;
        int lo = 0 , hi = n-1 ;
        boolean flag = false ;
        int idx = 0 ;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid]==target){
                idx = mid ;
                flag = true ;
                break ;
            }
            else if(arr[mid]<target) lo = mid +1 ;
            else hi = mid -1 ;
        }
        if(flag==true){
            System.out.println("Target found at index : "+ idx);
        }
        else System.out.println("Target not found");
    }
}
