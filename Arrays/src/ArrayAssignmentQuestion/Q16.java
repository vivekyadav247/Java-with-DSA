package ArrayAssignmentQuestion;

public class Q16 {
    public static void main(String[] args) {
        int[] arr = {2,1,5,3,2,4,4,1};
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
                break;
            }
        }
        System.out.println(uniqno);
    }
}
