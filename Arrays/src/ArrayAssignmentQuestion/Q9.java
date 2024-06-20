package ArrayAssignmentQuestion;

public class Q9 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int n = arr.length;
        int evenSum = 0 , oddSum = 0 ;
        for (int i = 0; i < n; i++) {
            if(i%2==0){
                evenSum += arr[i];
            }
            else if (i%2!=0) {
                oddSum += arr[i];
            }
        }
        int diff = evenSum - oddSum ;
        System.out.println(diff);
    }
}
