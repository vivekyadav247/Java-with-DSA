public class SudokuSolver {
    public static boolean isValid(char[][] board, int i, int j, char c){

        for(int a=0; a<board.length; a++){
            // check in row
            if(board[i][a]==c) return false ;

            // check in column
            if(board[a][j]==c) return false ;

            // check in column
            int subgridRow = 3 * (i / 3) + a / 3; // Calculate row index of subgrid
            int subgridCol = 3 * (j / 3) + a % 3; // Calculate column index of subgrid

            if (board[subgridRow][subgridCol] == c) {
                return false;
            }
        }

        return true ;
    }
    public static boolean solve(char[][] board){
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                if(board[i][j]=='.'){
                    for(char c = '1' ; c <= '9'; c++){
                        if(isValid(board,i,j,c)){
                            board[i][j] = c;
                            if(solve(board)){
                                return true ;
                            }
                            else{
                                board[i][j] = '.' ;
                            }
                        }
                    }
                    return false ;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        char[][] board = {{'5','3','.','.','7','.','.','.','.'},{'6','.','.','1','9','5','.','.','.'},{'.','9','8','.','.','.','.','6','.'},{'8','.','.','.','6','.','.','.','3'},{'4','.','.','8','.','3','.','.','1'},{'7','.','.','.','2','.','.','.','6'},{'.','6','.','.','.','.','2','8','.'},{'.','.','.','4','1','9','.','.','5'},{'.','.','.','.','8','.','.','7','9'}} ;
        solve(board) ;
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
}
