public class FindMinValue {
    public static void main(String[] args) {
        int[] arr = {10,8,430,12,2,56,3};
        int n = arr.length;
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i<n ;i++){
            min = Math.min(min,arr[i]);
        }
        System.out.println(min);
    }
}
