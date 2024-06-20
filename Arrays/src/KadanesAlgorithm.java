public class KadanesAlgorithm {
    public static void main(String[] args) {
        // Maximum Sub-array //
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int n = arr.length;
        int maxi = Integer.MIN_VALUE;
        int sum = 0 ;
        for (int i = 0; i < n; i++) {
            sum = sum+arr[i];
            maxi = Math.max(sum,maxi);
            if(sum<0){
                sum = 0;
            }
        }
        System.out.println(maxi);
    }
}
