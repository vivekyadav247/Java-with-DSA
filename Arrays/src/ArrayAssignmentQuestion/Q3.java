package ArrayAssignmentQuestion;

public class Q3 {
    public static void main(String[] args) {
        int[] arr = {12,34,5,45,23,17,35};
        int n = arr.length;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
