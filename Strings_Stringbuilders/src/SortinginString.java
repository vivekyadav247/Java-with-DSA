import java.util.Arrays;

public class SortinginString {
    public static void main(String[] args) {
        // Sorting in Char ARRAY
        char[] ch = {'V','I','V','E','K'};
        for ( char ele : ch  ) {
            System.out.print(ele);
        }
        System.out.println();
        Arrays.sort(ch);
        for ( char ele : ch  ) {
            System.out.print(ele);
        }
        System.out.println();

        // Process of Sorting in string
        String s = "vivek";
        char[] chh = s.toCharArray();
        Arrays.sort(chh);
        for ( char ele : chh  ) {
            System.out.print(ele);
        }
        System.out.println();

        //Process of Sorting in StringBuilder
        StringBuilder sb = new StringBuilder("YADAV");
        char[] chhh =  sb.toString().toCharArray();
        Arrays.sort(chhh);
        for ( char ele : chhh  ) {
            System.out.print(ele);
        }
        System.out.println();
    }
}
