package AssignmentQuestion;

public class _2DQ11 {
    public static void main(String[] args) {
        int[][]  arr = new int[3][3];
        int m = arr.length ;
        int n = arr[0].length;
        int x = 1 ;
        int minr=0 , minc=0 , maxr=m-1, maxc = n-1 ;

        while(minr<=maxr && minc<=maxr){
            //left to right
            for (int j = minc; j <= maxc ; j++) {
                arr[minr][j] = x ;
                System.out.print( arr[minr][j]+" ");
                x++;
            }minr++;
            //up to down
            if(minr>maxr || minc>maxc) break;
            for (int i = minr; i <= maxr ; i++) {
                arr[i][maxc] = x ;
                System.out.print(arr[i][maxc]+" ");
                x++;
            }maxc--;
            // right to left
            if(minr>maxr || minc>maxc) break;
            for (int j = maxc ; j >= minc; j--) {
                arr[maxr][j] = x ;
                System.out.print(arr[maxr][j]+" ");
                x++ ;
            } maxr--;
            // down to up
            if(minr>maxr || minc>maxc) break;
            for (int i = maxr; i >= minr ; i--) {
                arr[i][minc] = x ;
                System.out.print(arr[i][minc]+" ");
                x++ ;
            }minc++;

        }
    }
}
