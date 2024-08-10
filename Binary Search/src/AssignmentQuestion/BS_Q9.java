package AssignmentQuestion;

public class BS_Q9 {
    public static void main(String[] args) {
        int arr[][] = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int x = 17;
        BinarySrchInMatrix(arr,x);
        System.out.println(BinarySrchInMatrix(arr,x));
    }
    public static boolean BinarySrchInMatrix(int[][] arr , int x){
        int lo = 0 , hi = arr.length;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(x==arr[mid][0] || x==arr[mid][arr.length-1]) return true ;
            else if(x>arr[mid][0] && x<arr[mid][arr.length-1])
                return BinarySrchInArray(arr,mid,x);
            else{
                if(x<arr[mid][0]) hi = mid - 1 ;
                else if(x>arr[mid][arr.length-1]) lo = mid + 1;
            }
        }
        return false;
    }
    public static boolean BinarySrchInArray(int[][] arr , int row , int x){
        int lo = 0 , hi = arr[0].length ;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[row][mid]==x) return true ;
            else if(arr[row][mid]<x) lo = mid + 1;
            else hi = mid - 1;
        }
        return false;
    }
}
