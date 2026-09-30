package com.programs.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Add to Array-Form of Integer (LeetCode #989)
 *
 * Problem Statement:
 * The array-form of an integer num is an array representing its digits in left to right order.
 * Given num, the array-form of an integer, and an integer k, return the array-form of the integer num + k.
 *
 * Explanation:
 * To avoid integer overflow from massive arrays (up to 10^4 digits), we simulate
 * grade-school addition right-to-left.
 * We use the integer 'k' itself as the carry. At each step, we add the current array
 * digit to 'k', extract the last digit using modulo (k % 10) to place into our result,
 * and then divide 'k' by 10 to act as the carry for the next column.
 *
 * Complexity Analysis:
 * - Time Complexity: O(max(N, log K)) — Where N is the length of the array and log K
 *   is the number of digits in K. We iterate through whichever is longer.
 * - Space Complexity: O(max(N, log K)) — The result list must be large enough to
 *   hold the final sum, which is at most one digit longer than the largest input.
 *
 * Example:
 * Input: num = [1,2,0,0], k = 34
 * Output: [1,2,3,4]
 * Explanation: 1200 + 34 = 1234
 */
public class AddToArrayFormOfInteger {

    public static void main(String[] args) {
        int[] num = {1, 2, 0, 0};
        int k = 34;

        List<Integer> result = addToArrayForm(num, k);
        System.out.println("Result: " + result);
    }

    public static List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        int i = num.length - 1;

        // Continue as long as there are array digits OR a carry value in k
        while (i >= 0 || k > 0) {

            // If there are still digits in the array, add them to k
            if (i >= 0) {
                k = k + num[i];
            }

            // Extract the last digit and add it to the result list
            result.add(k % 10);

            // Chop off the last digit of k to act as the carry for the next loop
            k = k / 10;

            // Move pointer left
            i--;
        }

        // The list was built right-to-left, so we must reverse it
        Collections.reverse(result);

        return result;
    }
}