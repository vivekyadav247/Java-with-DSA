public class SearchinMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target = 6;
        int m = matrix.length , n = matrix[0].length;
        int i = 0 , j = n-1  ;
        boolean x = false ;
        while(i<m && j>=0){
            if(matrix[i][j] == target){
                x = true;
                break ;
            }
            else if(matrix[i][j]<target) i++;
            else  j--;
        }
        if(x==true){System.out.println("true");}
        else {
            System.out.println("false");
        }
    }
}
