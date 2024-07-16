package SortAssignmentQues;

public class Sort_Q14 {
    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,1,3};
        int n = arr.length ;
        int zer = 0 ;
        for (int x = 0; x < n-1; x++) {
            boolean flag = true;
            for (int i = 0; i < n-1-x; i++) {
                if(arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp ;
                    flag = false ;
                }
            }
            zer++;
            if(flag==true){
                break ;
            }
        }
        print(arr);
        System.out.println(zer);
        for (int i = 0; i < zer; i++) {
            arr[i] = 0 ;
        }
        print(arr);
    }
}
