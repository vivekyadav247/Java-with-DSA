package AssignmentQuestion;

import java.util.ArrayList;
import java.util.List;

public class Rec_Q10 {

    // Function to generate all possible arrays
    static void generateUtil(int A[], int B[], int C[], int i, int j, int m, int n, int len, boolean flag) {
        // If the array is constructed successfully
        if (flag) {
            // Add last element from B[] and end with B[]
            for (int k = 0; k < len; k++) {
                System.out.print(C[k] + " ");
            }
            System.out.println();
        }

        // If flag is true, then it means we need to select an element from A[]
        if (flag) {
            // Select the element from A[] and recur
            for (int l = i; l < m; l++) {
                if (len == 0) {
                    C[len] = A[l];
                    generateUtil(A, B, C, l + 1, j, m, n, len + 1, false);
                } else if (A[l] > C[len - 1]) {
                    C[len] = A[l];
                    generateUtil(A, B, C, l + 1, j, m, n, len + 1, false);
                }
            }
        }
        // If flag is false, then it means we need to select an element from B[]
        else {
            // Select the element from B[] and recur
            for (int l = j; l < n; l++) {
                if (B[l] > C[len - 1]) {
                    C[len] = B[l];
                    generateUtil(A, B, C, i, l + 1, m, n, len + 1, true);
                }
            }
        }
    }

    // Wrapper function
    static void generate(int A[], int B[], int m, int n) {
        int C[] = new int[m + n];
        generateUtil(A, B, C, 0, 0, m, n, 0, true);
    }

    public static void main(String[] args) {
        int A[] = {10, 15, 25};
        int B[] = {1, 5, 20, 30};
        int m = A.length;
        int n = B.length;
        generate(A, B, m, n);
    }
}