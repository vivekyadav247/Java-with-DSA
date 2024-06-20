public class SecondLargestValue {
    public static void main(String[] args) {
        int[] arr = {10,8,430,12,2,56,3};
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i<n ;i++){
            max = Math.max(max,arr[i]);
        }
        int smax = Integer.MIN_VALUE;
        for(int i = 0 ; i<n ;i++){
            if(arr[i] != max)
                smax = Math.max(smax,arr[i]);
        }
        System.out.println(smax);
    }
}
