package AssignmentQuestion;

public class BS_Q7 {
    public static void main(String[] args) {
        int arr[] = {52,32,21,18,12,7,4,2};
        int target = 12;
        BinarySearchinDcrsOrdr(arr,target);
        System.out.println(BinarySearchinDcrsOrdr(arr,target));
    }
    public static int BinarySearchinDcrsOrdr(int[] arr , int x){
        int lo = arr.length - 1 , hi = 0;
        while (hi<=lo){
            int mid = hi + (lo-hi)/2;
            if(arr[mid]==x) return mid ;
            else if(arr[mid]>x) hi=mid+1;
            else lo = mid - 1;
        }
        return -1;
    }
}
