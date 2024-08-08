package AssignmentQuestion;

public class BS_Q4 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,3,4,5};
        repeatedno(arr);
        System.out.println("The repeated Number is "+    repeatedno(arr));
    }
    public static int repeatedno(int[] arr){
        int lo = 0 , hi = arr.length-1;
        int ans = -1 ;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;

            if(arr[mid]==mid){
                ans = arr[mid];
                hi = mid - 1 ;
            }
            else lo = mid + 1 ;
        }
        return ans ;
    }
}
