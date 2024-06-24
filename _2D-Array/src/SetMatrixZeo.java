public class SetMatrixZeo {
    public static void print(int[][] arr ){
        int m = arr.length , n = arr[0].length ;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[][] arr = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        int m =  arr.length , n = arr[0].length ;
        boolean zerothrow = false;
        boolean zerothcol = false;
        for(int i = 0 ; i < m ; i++){
            if(arr[i][0]==0){
                zerothcol = true ;
            }
        }
        for(int j = 0 ; j < n ; j++){
            if(arr[0][j]==0){
                zerothrow = true ;
            }
        }
        for(int i = 1 ; i < m ; i++){
            for(int j = 1 ; j < n ; j++){
                if(arr[i][j]==0){
                    arr[0][j] = 0 ;
                    arr[i][0] = 0 ;
                }
            }
        }
        for(int i = 1 ; i < m ; i++){
            if(arr[i][0]==0){
                for(int j = 0 ; j < n ; j++){
                    arr[i][j] = 0 ;
                }
            }
        }
        for(int j = 1 ; j < n ; j++){
            if(arr[0][j]==0){
                for(int i = 0 ; i < m ; i++){
                    arr[i][j] = 0 ;
                }
            }
        }
        if(zerothcol==true){
            for(int i = 0 ; i < m ; i++){
                arr[i][0] = 0 ;
            }
        }
        if(zerothrow==true){
            for(int j = 0 ; j < n ; j++){
                arr[0][j] = 0 ;
            }
        }
        print(arr);
    }
}
