package com.programs.arrays;

import java.util.Arrays;

/**
 * Find N Unique Integers Sum up to Zero (LeetCode #1304)
 *
 * Problem Statement:
 * Given an integer n, return any array containing n unique integers such that
 * they add up to 0.
 *
 * Explanation:
 * This solution utilizes the Two-Pointer technique to generate symmetric pairs
 * that naturally cancel each other out (e.g., -1 and 1, -2 and 2).
 * By moving pointers from the outside edges inward, we place a negative value
 * on the left and its positive counterpart on the right.
 * If 'n' is an odd number, the pointers will stop before touching the center
 * element, naturally leaving it as the default integer value of 0, which perfectly
 * maintains the zero-sum condition.
 *
 * Complexity Analysis:
 * - Time Complexity: O(N) — We loop exactly N/2 times to fill the array, which
 *   simplifies to a linear O(N) time complexity.
 * - Space Complexity: O(N) — We create and return an array of size N to hold
 *   the result. (Auxiliary space is O(1) as no extra scaling data structures are used).
 *
 * Example:
 * Input: n = 5
 * Output: [-1, -2, 0, 2, 1]
 * Explanation: (-1) + (-2) + 0 + 2 + 1 = 0.
 */
public class UniqueIntegerSumUpToZero {

    public static void main(String[] args) {
        int n = 5;

        System.out.println("Input n: " + n);

        int[] result = sumZero(n);
        System.out.println("Resulting Array: " + Arrays.toString(result));
    }

    public static int[] sumZero(int n) {
        int[] result = new int[n];

        int left = 0;
        int right = result.length - 1;

        int value = 1;

        while (left < right) {
            result[left] = -value;
            result[right] = value;
            left++;
            right--;
            value++;
        }

        return result;
    }
}