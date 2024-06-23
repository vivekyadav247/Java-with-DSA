public class ScoreAfterFlip {
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
        int[][] grid = {{0,0,1,1},{1,0,1,0},{1,1,0,0}};
        for (int i = 0; i < grid.length; i++) {
            if(grid[i][0]==0){
                for (int j = 0; j < grid[0].length; j++) {
                    if(grid[i][j]==0){  
                        grid[i][j] = 1 ;
                    }
                    else{
                        grid[i][j] = 0 ;
                    }
                }
            }
        }
        for (int j = 1; j < grid[0].length; j++) {
            int countofOne = 0;
            int countofZero = 0;
            for (int i = 0; i < grid.length; i++) {
                if(grid[i][j]==1){
                    countofOne++;
                }
                else{
                    countofZero++;
                }
            }
            if(countofZero>countofOne){
                for (int i = 0; i < grid.length; i++){
                    if(grid[i][j]==0){
                        grid[i][j]=1;
                    }
                    else{
                        grid[i][j]=0;
                    }
                }

            }
        }
        print(grid);
        int score = 0;
        int x =1;
        for(int j =grid[0].length-1; j>=0;j--){
            for(int i =0;i<grid.length;i++){
                score += (grid[i][j]*x);
            }
            x*=2;
        }
        System.out.println(score);
    }
}
