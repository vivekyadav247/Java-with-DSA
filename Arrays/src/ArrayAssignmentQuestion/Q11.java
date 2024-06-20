package ArrayAssignmentQuestion;

public class Q11 {
    public static void main(String[] args) {
        int[] arr = {2,1,3,2,4,4,1};
        int uniqno = 0 ;
        for (int i = 0; i < arr.length; i++) {
            int count = 0 ;
            for (int j = 0; j < arr.length ; j++) {
                if(arr[i]==arr[j]){
                   count++;
                }
            }
            if(count==1){
                uniqno = arr[i];
            }
        }
        System.out.println(uniqno);
    }
}
