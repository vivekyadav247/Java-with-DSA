package AssignmentQuestion;

public class Rec_Q4 {
    public static void rev(int[] arr,int i){
        if(i==-1) return ;
        System.out.print(arr[i]+" ");
        rev(arr,i-1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,4,5,6,7};
        rev(arr,arr.length-1);
    }
}
