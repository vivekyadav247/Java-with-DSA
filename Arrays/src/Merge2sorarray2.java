public class Merge2sorarray2 {
    public static void main(String[] args) {
        int[] arr = {11,33,42,62,};
        int[] brr = {26,54,69,81,94,100};
        int[] crr = new int[arr.length + brr.length];
        int i=arr.length-1,j=brr.length-1,k=crr.length-1 ;
        while(i>=0 && j>=0){
            if(arr[i]>=brr[j]){
                crr[k]=arr[i];
                i--;
            }
            else {
                crr[k] = brr[j];
                j-- ;
            }
            k--;
        }
        if(i == 0 ) { // now take element from b only
            crr[k] = arr[i];
            i--;
        }
        if(j == 0 ) { // now take element from a only
            crr[k] = brr[j];
            j--;
        }
        for(int ele : crr) {
            System.out.print(ele + " ");
        }

    }
}
