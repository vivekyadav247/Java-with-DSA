package ArrayAssignmentQuestion;

public class Q5 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,4,5,6,8,9,11,13};
        for (int i = 0; i < arr.length; i++) {
            int n = arr[i]+ 1;
            int j = i+1 ;
            if(arr[j]==n){
                continue;
            }
            else {
                System.out.println(n);
                break;
            }
        }
    }
}
