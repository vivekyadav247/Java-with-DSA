import java.util.Scanner ;
import java.util.ArrayList ;
///// Print all increasing sequences of length k from first n natural number //////
public class Printallincrease {
    public static void print(int i , int k , int n,ArrayList<Integer> arr){
        if(i==n){
            arr.add(i);
            return ;
        }
        print(i+1.k,n,arr);
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter n-: ");
        int n =  sc.nextInt();
        System.out.println("Enter n-: ");
        int k =  sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        print(1,k,n,arr);
    }
}
