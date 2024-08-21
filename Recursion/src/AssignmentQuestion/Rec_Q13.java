package AssignmentQuestion;

import java.util.Scanner;

public class Rec_Q13 {
    public static int longcommonsubstr( String X , String Y , int m , int n , int count){
        if(m==0|| n== 0 ){
            return count ;
        }
        if (X.charAt(n - 1) == Y.charAt(m - 1)) {
            count = longcommonsubstr(X,Y, n - 1, m - 1, count + 1);
        }
        count = Math.max(count,Math.max(longcommonsubstr(X,Y,m-1,n,0),longcommonsubstr(X,Y,m,n-1,0)));
        return count ;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String X = new String(sc.next());
        String Y = new String(sc.next());
        longcommonsubstr(X,Y,X.length(),Y.length(),0);
        System.out.println(longcommonsubstr(X,Y,X.length(),Y.length(),0));
    }
}
