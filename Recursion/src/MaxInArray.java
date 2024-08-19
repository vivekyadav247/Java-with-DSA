public class MaxInArray {
    public static int Max(int[] arr,int i,int n){
        if(i==n-1) return arr[i] ;
        int mx = Max(arr,i+1,n);
        return Math.max(arr[i],mx);
    }
    public static void main(String[] args) {
        int[] arr = {1,5,3,2,4,2};
        Max(arr,0,arr.length);
        System.out.println( Max(arr,0,arr.length));
    }
}
