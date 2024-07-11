import com.sun.security.jgss.GSSUtil;

public class checharraysorteedornot {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        boolean flag = true;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]<=arr[i+1]){
                flag = true ;
            }
            else {
                flag = false ;
                break;
            }
        }
        if(flag==false) System.out.println("Array is Unsorted ");
        else System.out.println("Array is sorted");
    }
}
