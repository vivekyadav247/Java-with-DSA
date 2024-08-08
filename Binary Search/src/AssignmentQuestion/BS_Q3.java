package AssignmentQuestion;

public class BS_Q3 {
    public static void main(String[] args) {
        int arr[][] = {{0,0,1,1},{0,1,1,1},{1,1,1,1},{0,0,0,0}};
        int ones , rowno = 0 , max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            ones = CountOnes(arr[i]);
            if(ones>max){
                max = ones ;
                rowno = i+1 ;
            }
        }
        System.out.println("Row no."+rowno+"  has Maximum Ones .");
    }
    public static int CountOnes(int[] arr){
        int lo = 0 , hi = arr.length - 1 ;
        boolean flag = false;
        int idx = -1 ;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2 ;
            if(arr[mid]==1){
                idx = mid ;
                flag = true ;
                hi = mid-1 ;
            }
            else lo = mid + 1;
        }
        if(flag==true) return arr.length - idx;
        return 0;
    }
}
