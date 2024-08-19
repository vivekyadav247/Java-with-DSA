import java.util.Scanner;

public class TowerofHanoi {
    public static void toh(int n,String src, String help , String des){
        if(n==1){
            System.out.println("Disk "+n+" from "+src+" to "+des);
            return ;
        }
        toh(n-1,src,des,help);
        System.out.println("Disk "+n+" from "+src+" to "+des);
        toh(n-1,help,src,des);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        toh(n,"A","B","C");
    }
}
