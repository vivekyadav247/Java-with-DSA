package ArrayAssignmentQuestion;

public class Q10 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if(i%2==0){
                arr[i] = arr[i] + 10 ;
            }
            else if(i%2!=0){
                arr[i] = arr[i]*2 ;
            }
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
