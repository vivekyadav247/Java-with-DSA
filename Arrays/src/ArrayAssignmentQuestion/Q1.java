package ArrayAssignmentQuestion;

public class Q1 {
    public static void main(String[] args) {
        int[] arr = {11,27,28,14,35,60,90};
        long mul = 1 ;
        for (int i = 0; i < arr.length ; i++) {
            mul *= arr[i];
        }
        System.out.println(mul);
    }
}
