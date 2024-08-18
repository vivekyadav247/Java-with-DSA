package AssignmentQuestion;
//
public class Rec_Q7 {
    public static void SumTriangle(int[] arr,int n){
         if(n==1){
             System.out.println(arr[0]);
             return ;
         }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for (int i = 1 ; i < n; i++) {
            arr[i-1] = arr[i] + arr[i-1] ;
        }
        n=n-1;
        SumTriangle(arr,n);
    }
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        int n = arr.length ;
        SumTriangle(arr,n);
    }
}
