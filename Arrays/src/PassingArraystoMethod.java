public class PassingArraystoMethod {
    public static void main(String[] args) {
        int[] arr = {10,29,39,40};
        System.out.println(arr[0]);
        change(arr);
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }

    static void change(int[] arr) {
        arr[0] = 19 ;
    }
}
