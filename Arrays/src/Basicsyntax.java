public class Basicsyntax {
    public static void main(String[] args) {
        int[] arr; // declaration
        arr = new int[5]; // memory allocation
        arr[0] = 10 ;
        arr[1] = 20 ;
        arr[2] = 30 ;
        arr[3] = 40 ;
        arr[4] = 50 ;

        //Output

        System.out.print(arr[0] + " ");

        //Update

        arr[0] = 99;
        arr[0] += 10;
        System.out.print(arr[0]+" ");
    }
}
