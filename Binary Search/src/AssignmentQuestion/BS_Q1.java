package AssignmentQuestion;

public class BS_Q1 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,3,4,4,4,4,5,6};
        int x = 4 ;
        LastOccurence(arr,x);
        System.out.println(LastOccurence(arr,x));
    }
    public static int LastOccurence(int arr[] , int x){
        int lo = 0 , hi = arr.length-1;
        boolean flag = false ;
        int idx = 0;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2 ;
            if(arr[mid]==x){
                flag = true ;
                idx = mid ;
                lo = mid + 1 ;
            }
            else if(arr[mid]<x) lo = mid + 1;
            else hi = mid - 1 ;
        }
        if(flag==true) return idx ;
        return -1;
    }
}
