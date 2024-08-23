public class InversionCountProblem {
    static int count = 0 ;
    public static void merge(int[] a, int[] b, int[] c){
        int i = 0, j = 0, k = 0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]) c[k++] = a[i++];
            else c[k++] = b[j++];
        }
        if(i==a.length){
            while(j<b.length) c[k++] = b[j++];
        }
        if(j==b.length){
            while(i<a.length) c[k++] = a[i++];
        }
    }
    public static void countInversion(int[] a , int[] b){
        int i = 0 , j = 0 ;
        while(i<a.length && j<b.length){
            if(a[i]>b[j]){
                count += (a.length-i);
                j++;
            }
            else i++;
        }
    }
    public static void mergesort(int[] arr){
        int n = arr.length ;
        if(n==1) return ;
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];
        // copy pasting
        for(int i=0;i<n/2;i++){
            a[i] = arr[i];
        }
        for (int i = 0; i < n-n/2 ; i++) {
            b[i] = arr[i+n/2];
        }
        mergesort(a);
        mergesort(b);
        countInversion(a,b);
        merge(a,b,arr);
    }
    public static void main(String[] args) {
        int[] arr = {8,2,5,3,1,4};
        mergesort(arr);
        System.out.println(count);
    }
}
