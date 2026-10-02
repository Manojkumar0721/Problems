package com.programs.arrays;

import java.util.Arrays;

/**
 * Reshape the Matrix (LeetCode #566)
 *
 * Problem Statement:
 * In MATLAB, there is a handy function called reshape which can reshape an m x n matrix
 * into a new one with a different size r x c keeping its original data.
 * You are given an m x n matrix mat and two integers r and c representing the number
 * of rows and the number of columns of the wanted reshaped matrix.
 * If the reshape operation with given parameters is possible and legal, output the new
 * reshaped matrix; Otherwise, output the original matrix.
 *
 * Explanation:
 * To avoid the overhead of copying data into a temporary 1D array, this solution uses
 * coordinate math. By simulating a 1D traversal from 0 to (total items - 1), we can
 * map any 1D index back to its 2D coordinates using division (row) and modulo (column).
 * - Original Matrix Row: index / originalColumns
 * - Original Matrix Col: index % originalColumns
 * - New Matrix Row: index / newColumns
 * - New Matrix Col: index % newColumns
 *
 * Complexity Analysis:
 * - Time Complexity: O(M * N) — We iterate through all elements of the matrix exactly once.
 * - Space Complexity: O(M * N) — We allocate a new 2D array of the same total size
 *   to hold the reshaped data (ignoring the space required for the output, the auxiliary
 *   space is O(1)).
 *
 * Example:
 * Input: mat = [[1,2],[3,4]], r = 1, c = 4
 * Output: [[1,2,3,4]]
 */
public class ReshapeTheMatrix {

    public static void main(String[] args) {
        int[][] mat = {
                {1, 2},
                {3, 4}
        };

        int r = 1;
        int c = 4;

        System.out.println("Original Matrix:");
        for(int[] row : mat){
            System.out.println(Arrays.toString(row));
        }

        int[][] result = matrixReshape(mat, r, c);

        System.out.println("\nReshaped Matrix (" + r + "x" + c + "):");
        for(int[] row : result){
            System.out.println(Arrays.toString(row));
        }
    }

    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;

        // If the total elements don't match, reshaping is impossible
        if (m * n != r * c) {
            return mat;
        }

        int[][] result = new int[r][c];

        // Traverse the total number of items as if it were a 1D line
        for (int i = 0; i < m * n; i++) {
            // Extract using original column count (n)
            int value = mat[i / n][i % n];

            // Insert using new column count (c)
            result[i / c][i % c] = value;
        }

        return result;
    }
}