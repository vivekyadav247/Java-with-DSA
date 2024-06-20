public class rollnumber {
    public static void main(String[] args) {
        int[] arr = { 99,32,70,38,82,12,56,24};
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if(arr[i]<35)
                System.out.print(i+" ");
        }
    }
}
