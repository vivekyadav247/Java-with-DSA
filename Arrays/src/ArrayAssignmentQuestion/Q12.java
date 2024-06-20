package ArrayAssignmentQuestion;

public class Q12 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2,1};
        int n = arr.length;
        int m = 0 ;
//        for (int i = 0  ; i<n/2; i++) {
//            for (int j = n-1; j>n/2 ; j--) {
//                if(arr[i]==arr[j]){
//                    m++;
//                }
//            }
//        }
        int i = 0 , j = n-1 ;
        while(i<n/2 && j>n/2){
            if(arr[i]==arr[j]){
                m++ ;
            }
            i++;
            j--;
        }
        if(m==n/2){
            System.out.println("This Array is palindrome");
        }
        else{
            System.out.println("This Array is not palindrome");
        }
    }
}
