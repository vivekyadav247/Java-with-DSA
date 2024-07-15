public class PushZeroestoEnd {
    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {1,2,0,4,3,0,5,0};
        int n = arr.length ;
        int count = 0 ;
        for (int i = 0; i < n; i++) {
            if(arr[i]!=0){
                arr[count++] = arr[i] ;
            }
        }
        while(count<n){
            arr[count++] = 0 ;
        }
        print(arr);
    }
}
