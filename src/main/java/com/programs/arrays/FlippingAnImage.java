package com.programs.arrays;

import java.util.Arrays;

/**
 * Flipping an Image (LeetCode #832)
 *
 * Problem Statement:
 * Given an n x n binary matrix image, flip the image horizontally, then invert it,
 * and return the resulting image.
 * - To flip an image horizontally means that each row of the image is reversed.
 * - To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.
 *
 * Explanation:
 * This solution uses the Two-Pointer pattern to perform both the horizontal flip
 * and the color inversion simultaneously in a single pass per row.
 * By maintaining a 'left' and 'right' pointer for each row, we swap the elements
 * from the outside moving inward. During the swap, we apply the mathematical trick
 * (1 - x) to invert the binary values instantly without needing a secondary loop.
 *
 * Complexity Analysis:
 * - Time Complexity: O(N) — Where N is the total number of pixels (elements) in the matrix.
 *   We touch every element exactly once.
 * - Space Complexity: O(1) — The matrix is modified in-place, requiring no extra
 *   memory allocations other than a few pointer variables.
 *
 * Example:
 * Input: image = [[1,1,0],[1,0,1],[0,0,0]]
 * Output: [[1,0,0],[0,1,0],[1,1,1]]
 */
public class FlippingAnImage {

    public static void main(String[] args) {
        int[][] image = {
                {1, 1, 0},
                {1, 0, 1},
                {1, 1, 1}
        };

        System.out.println("Original Image:");
        for (int[] row : image) {
            System.out.println(Arrays.toString(row));
        }

        int[][] result = flipAndInvertImage(image);

        System.out.println("\nFlipped and Inverted Image:");
        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static int[][] flipAndInvertImage(int[][] image) {
        // Defensive programming check
        if (image == null || image.length == 0) {
            return image;
        }

        for (int[] row : image) {
            int left = 0;
            int right = row.length - 1;

            // The <= is crucial here to ensure the middle element of an odd-length row is inverted
            while (left <= right) {
                int temp = row[left];

                // Overwrite left with inverted right
                row[left] = 1 - row[right];

                // Overwrite right with inverted original left
                row[right] = 1 - temp;

                left++;
                right--;
            }
        }

        return image;
    }
}