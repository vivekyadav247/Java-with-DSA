public class Sorts0s1s2s {
    public static void main(String[] args) {
        int[] arr = {0,1,2,0,1,2,1,2,0,0};
        int n = arr.length;
        //  Method - 1
//        int noofZeroes = 0, noofOnes = 0;
//        for (int i = 0; i < n; i++) {
//            if(arr[i]==0) noofZeroes++;
//            if(arr[i]==1) noofOnes++;
//        }
//        for (int i = 0; i < n; i++) {
//            if(i<noofZeroes)
//                arr[i] = 0 ;
//            else if(i<noofZeroes+noofOnes)
//                arr[i]=1;
//            else arr[i] = 2 ;
//        }


        // Method - 2
        int mid = 0 , hi = n-1, lo = 0 ;
        while(mid<=hi){
            if(arr[mid]==0){
                int temp = arr[mid];
                arr[mid] = arr[lo];
                arr[lo] = temp;
                lo++ ; mid++ ;
            }
            else if(arr[mid]==1) {
                mid++;
            }
            else{ // arr[mid] == 2;
                int temp = arr[mid];
                arr[mid] = arr[hi];
                arr[hi] = temp;
                 hi-- ;
            }
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
