package com.programs.arrays;

/**
 * Matrix Diagonal Sum (LeetCode #1572)
 *
 * Problem Statement:
 * Given a square matrix mat, return the sum of the matrix diagonals.
 * Only include the sum of all the elements on the primary diagonal and all the
 * elements on the secondary diagonal that are not part of the primary diagonal.
 *
 * Explanation:
 * This solution avoids a slow O(N^2) traversal by using coordinate mathematics
 * in a single pass O(N) loop.
 * - The primary diagonal elements always share the same row and column index (i, i).
 * - The secondary diagonal elements follow the pattern (i, n - 1 - i).
 * If the matrix has an odd length, the exact center element is counted twice
 * during the loop, so it is subtracted once at the very end to correct the sum.
 *
 * Complexity Analysis:
 * - Time Complexity: O(N) — Where N is the number of rows in the matrix. We only
 *   loop N times rather than visiting every single cell in the grid.
 * - Space Complexity: O(1) — We only use integer variables to keep track of the
 *   sum and the matrix size, requiring constant extra space.
 *
 * Example:
 * Input: mat = [[1,2,3],
 *               [4,5,6],
 *               [7,8,9]]
 * Output: 25
 * Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25.
 * Notice that element mat[1][1] = 5 is counted only once.
 */
public class MatrixDiagonalSum {

    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int sum = diagonalSum(mat);
        System.out.println("Diagonal Sum: " + sum);
    }

    public static int diagonalSum(int[][] mat) {
        // Defensive check
        if (mat == null || mat.length == 0) {
            return 0;
        }

        int sum = 0;
        int n = mat.length;

        // Single pass through the rows
        for (int i = 0; i < n; i++) {
            // Add primary diagonal element
            sum += mat[i][i];
            // Add secondary diagonal element
            sum += mat[i][n - 1 - i];
        }

        // If the matrix size is odd, subtract the double-counted center element
        if (n % 2 != 0) {
            sum -= mat[n / 2][n / 2];
        }

        return sum;
    }
}