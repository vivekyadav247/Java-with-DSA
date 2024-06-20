package ArrayAssignmentQuestion;

import java.math.BigInteger;
import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        BigInteger f = new BigInteger("1");
        int n = 100 ;
        for (int i = 2; i <= n ; i++) {
            f = f.multiply(BigInteger.valueOf(i));
        }
        System.out.println(f);
    }
}
