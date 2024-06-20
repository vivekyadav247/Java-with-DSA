package ArrayAssignmentQuestion;

public class Q7 {
    public static void main(String[] args) {
        int[] arr = {6,2,7,4,5,1,3,8};
        int first,second,third ;
        first = second = third = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>first){
                third = second;
                second = first;
                first = arr[i];
            }
            else if(arr[i]>second){
                third = second;
                second = arr[i];
            }
            else if(arr[i]>third){
                third = arr[i];
            }
        }
        System.out.println(first+","+second+","+third);

    }
}
