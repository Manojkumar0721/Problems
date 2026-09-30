package com.programs.arrays;

import java.util.Arrays;

/**
 * Transpose Matrix (LeetCode #867)
 *
 * Problem Statement:
 * Given a 2D integer array matrix, return the transpose of matrix.
 * The transpose of a matrix is the matrix flipped over its main diagonal,
 * switching the matrix's row and column indices.
 *
 * Explanation:
 * Because the matrix is not guaranteed to be a perfect square (n x n), it can
 * be rectangular (m x n). Therefore, an in-place swap is impossible as the physical
 * dimensions of the matrix will change.
 *
 * This solution creates a new matrix with swapped dimensions (n x m). It then
 * iterates through every element in the original matrix, mapping the element
 * at original row 'i' and column 'j' to the new row 'j' and column 'i'.
 *
 * Complexity Analysis:
 * - Time Complexity: O(M * N) — Where M is the number of rows and N is the number
 *   of columns in the original matrix. We visit every single element exactly once.
 * - Space Complexity: O(M * N) — We must allocate a completely new 2D array of
 *   the same total size to hold the transposed result.
 *
 * Example:
 * Input: matrix = [[1,2,3],
 *                  [4,5,6]]
 * Output: [[1,4],
 *          [2,5],
 *          [3,6]]
 */
public class TransposeMatrix {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };

        System.out.println("Original Matrix:");
        for(int[] row : matrix){
            System.out.println(Arrays.toString(row));
        }

        int[][] result = transpose(matrix);

        System.out.println("\nTransposed Matrix:");
        for(int[] row : result){
            System.out.println(Arrays.toString(row));
        }
    }

    public static int[][] transpose(int[][] matrix) {
        // Defensive check for empty or null matrices
        if (matrix == null || matrix.length == 0) {
            return new int[0][0];
        }

        int m = matrix.length;
        int n = matrix[0].length;

        // Create the new matrix with flipped dimensions
        int[][] result = new int[n][m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // Swap the row and column indices
                result[j][i] = matrix[i][j];
            }
        }

        return result;
    }
}