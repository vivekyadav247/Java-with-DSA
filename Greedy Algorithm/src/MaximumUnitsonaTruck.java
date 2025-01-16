import java.util.*;

public class MaximumUnitsonaTruck {
    public static void main(String[] args) {
        int[][] b = {{35,14},{57,99},{70,48},{50,70},{59,24},{48,72},{27,48},{50,89},{91,9},{87,66},{74,58},{52,29},{10,19},{11,87},{56,71},{83,67},{73,31},{41,58},{26,39},{100,99},{96,51},{33,34},{43,23},{22,41},{89,28},{43,19},{87,56},{30,95},{54,93},{81,98},{84,26},{51,52},{21,16}};
        //int[][] b =  {{1,3},{2,2},{3,1}};
        //int[][] b = {{5,10},{2,5},{4,7},{3,9}};
        int truckSize = 270 ;
        int n = b.length ;
        Arrays.sort(b, Comparator.comparingInt(o -> -o[1]));
        int ans = 0, i = 0;
        while (i < n && truckSize > 0) {
            int maxi = Math.min(b[i][0], truckSize);
            ans += maxi * b[i][1];
            i++;
            truckSize -= maxi;
        }
        System.out.println(ans);
    }
}
