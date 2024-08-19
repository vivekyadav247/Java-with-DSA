package AssignmentQuestion;

import java.util.ArrayList;
import java.util.Scanner;

public class Rec_Q9 {
    public static void increaseseq(int n, int k,int start,int[] seq,int index){
        if(index==k){
            for (int i = 0; i < k; i++) {
                System.out.print(seq[i]+" ");
            }
            System.out.println();
            return ;
        }
        for (int i = start; i <= n; i++) {
            seq[index] = i ;
            increaseseq(n,k,i+1,seq,index+1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n Natural Number -: ");
        int n = sc.nextInt();
        System.out.print("Enter the length k -: ");
        int k = sc.nextInt();
        int seq[] = new int[k];
        increaseseq(n,k,1,seq,0);
    }
}
