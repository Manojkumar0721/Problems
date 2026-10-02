package com.programs.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * Lucky Numbers in a Matrix (LeetCode #1380)
 *
 * Problem Statement:
 * Given an m x n matrix of distinct numbers, return all lucky numbers in the matrix in any order.
 * A lucky number is an element of the matrix such that it is the minimum element in its row
 * and maximum in its column.
 *
 * Explanation:
 * This solution optimizes the search by pre-computing the row minimums and column maximums.
 * 1. Iterate through each row to find and store the minimum value.
 * 2. Iterate through each column to find and store the maximum value.
 * 3. Iterate through the matrix one final time. If a cell's value equals its pre-computed
 *    row minimum AND its column maximum, it is a lucky number (saddle point).
 *
 * Complexity Analysis:
 * - Time Complexity: O(M * N) — We perform three separate passes over the matrix
 *   (one for rows, one for columns, one for intersection), which drops the constant
 *   to remain O(M * N). This is significantly faster than checking rows/cols repeatedly.
 * - Space Complexity: O(M + N) — We allocate two 1D arrays to store the pre-computed
 *   minimums and maximums.
 *
 * Example:
 * Input: matrix = [[3,7,8],
 *                  [9,11,13],
 *                  [15,16,17]]
 * Output: [15]
 */
public class LuckyNumberInTheMatrix {

    public static void main(String[] args) {
        int[][] matrix = {
                {3, 7, 8},
                {9, 11, 13},
                {15, 16, 17}
        };

        List<Integer> result = luckyNumber(matrix);
        System.out.println("Lucky Numbers: " + result);
    }

    public static List<Integer> luckyNumber(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int[] rowMins = new int[m];
        int[] colMaxs = new int[n];
        List<Integer> result = new ArrayList<>();

        // Step 1: Find the minimum in each row
        for (int i = 0; i < m; i++) {
            rowMins[i] = Integer.MAX_VALUE; // Reset for each new row
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] < rowMins[i]) {
                    rowMins[i] = matrix[i][j];
                }
            }
        }

        // Step 2: Find the maximum in each column
        for (int j = 0; j < n; j++) {
            // Numbers are guaranteed to be positive, so 0 is a safe minimum starting point
            colMaxs[j] = 0;
            for (int i = 0; i < m; i++) {
                if (matrix[i][j] > colMaxs[j]) {
                    colMaxs[j] = matrix[i][j];
                }
            }
        }

        // Step 3: Find the lucky numbers (the intersection)
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // If the number is BOTH the row min and col max, it's lucky!
                if (matrix[i][j] == rowMins[i] && matrix[i][j] == colMaxs[j]) {
                    result.add(matrix[i][j]);
                }
            }
        }

        return result;
    }
}