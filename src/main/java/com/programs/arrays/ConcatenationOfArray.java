package com.programs.arrays;

import java.util.Arrays;

/**
 * Concatenation of Array (LeetCode #1929)
 *
 * Problem Statement:
 * Given an integer array nums of length n, you want to create an array ans of
 * length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
 * Specifically, ans is the concatenation of two nums arrays.
 *
 * Explanation:
 * Because Java arrays are strictly fixed in size upon creation, this problem
 * fundamentally requires O(N) space allocation. We must physically allocate a
 * new array that is exactly twice the size of the original.
 *
 * Algorithm (Double Placement Strategy):
 * Instead of iterating 2N times through the massive new array, we iterate
 * exactly N times through the small original array. For every element found at
 * index 'i', we drop it into the first half (ans[i]) and immediately drop a
 * copy into the second half (ans[i + n]).
 *
 * Edge Cases Handled:
 * - Empty/Null Array: A defensive guard instantly returns an empty array if
 *   invalid data is passed, preventing NullPointerExceptions.
 *
 * Example:
 * Input: nums = [1, 2, 1]
 * Output: [1, 2, 1, 1, 2, 1]
 * Explanation:
 *   - ans[0] = nums[0] = 1, ans[0 + 3] = nums[0] = 1
 *   - ans[1] = nums[1] = 2, ans[1 + 3] = nums[1] = 2
 *   - ans[2] = nums[2] = 1, ans[2 + 3] = nums[2] = 1
 */
public class ConcatenationOfArray {

    public static void main(String[] args) {
        int[] nums = {1, 2, 1};

        System.out.println("Input:  " + Arrays.toString(nums));
        int[] ans = getConcatenation(nums);
        System.out.println("Output: " + Arrays.toString(ans));
    }

    public static int[] getConcatenation(int[] nums) {
        // Defensive guard clause
        if (nums == null || nums.length == 0) {
            return new int[0];
        }

        int n = nums.length;
        // Allocate O(N) space for the exact required size
        int[] ans = new int[2 * n];

        // O(N) Time Complexity iteration
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];           // Place in the first half
            ans[i + n] = nums[i];       // Place in the second half
        }

        return ans;
    }
}