package ArrayAssignmentQuestion;

public class Q14 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int n = arr.length ;
        int sum = 9 ;
        int count = 0 ;
        for (int i = 0; i < n-2; i++) {
            for (int j = i+1; j < n-1; j++) {
                for (int k = j+1; k < n; k++) {
                    if(arr[i]+arr[j]+arr[k]==sum){
                        System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
