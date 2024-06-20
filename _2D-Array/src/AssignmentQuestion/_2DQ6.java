package AssignmentQuestion;

public class _2DQ6 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4,5},{3,4,5,6,7},{7,6,5,4,3},{8,7,6,5,4},{1,2,37,8,0}};
        int m = arr.length; int n = arr[0].length ;
        middlerow(arr,m,n);
    }

    static void middlerow(int[][] arr, int m, int n) {
        if(m==n && m/2!=0){
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if(i==n/2){
                        System.out.print(arr[i][j]+" ");
                    }
                    else if(j==n/2){
                        System.out.print(arr[i][j]+" ");
                    }
                    else{
                        System.out.print(" "+" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
