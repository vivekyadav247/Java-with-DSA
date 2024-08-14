import java.util.Scanner ;
import java.util.List ;
import java.util.ArrayList ;
///// Print all increasing sequences of length k from first n natural number //////
public class Printallincrease {
    public static void generateSequences(int n, int k, int start, List<Integer> current) {
        // Base case: If the sequence has the required length, print it
        if (current.size() == k) {
            System.out.println(current);
            return;
        }

        // Generate sequences by choosing the next element from start to n
        for (int i = start; i <= n; i++) {
            // Include the current element in the sequence
            current.add(i);
            // Recursively generate the next element in the sequence
            generateSequences(n, k, i + 1, current);
            // Backtrack by removing the last element added
            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {
        int n = 4;
        int k = 3;

        System.out.println("All increasing sequences of length " + k + " from first " + n + " natural numbers:");
        generateSequences(n, k, 1, new ArrayList<>());
    }
}
