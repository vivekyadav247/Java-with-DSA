package SortAssignmentQues;

public class Sort_Q5 {
    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // Check if the given array is almost sorted(elsements are one position away from sorted
        int arr[] = {1,3,2,4,5,7,6};
        boolean flag = true;
        for (int i = 0; i < arr.length-2; i++) {
            if(arr[i]<=arr[i+1]){
                flag = true ;
            }
            else {
                flag = false ;
                break;
            }
        }

        if(flag==false) System.out.println("Array is Unsorted ");
        else System.out.println("Array is almost sorted");
        print(arr);
    }
}
