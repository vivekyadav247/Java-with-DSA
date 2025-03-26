import java.util.Scanner;

public class XOR_of_numbers_in_given_range {
    public static void main(String[] args) {
        int x = 2 ;
        int y = 9 ;
        int ans = 0;
        if(y%4==1) y = 1 ;
        else if(y%4==2) y = y + 1 ;
        else if(y%4==3) y = 0 ;
        x = x-1 ;
        if(x%4==1) x = 1 ;
        else if(x%4==2) x = x + 1 ;
        else if(x%4==3) x = 0 ;
        ans = x^y ;
        // here we use observation in ans which is
        // the xor(x,y) = xor(1,x-1) ^ xor(1,y)
        System.out.println(ans);

        System.out.println(2^3^4^5^6^7^8^9);

    }
}
