package com.programs.arrays;

import java.util.Arrays;

/**
 * Maximum Subarray (LeetCode #53)
 *
 * Problem Statement:
 * Given an integer array nums, find the contiguous subarray (containing at least one number)
 * which has the largest sum and return its sum.
 *
 * Explanation:
 * This solution uses Kadane's Algorithm to find the maximum subarray sum in a single pass.
 * At each index, the algorithm makes a local decision: either add the current element to the
 * existing running sum, or start a completely new running sum from the current element.
 * By dropping "dead weight" (negative running sums), it efficiently tracks the local maximum
 * and updates the global maximum (`maxSum`) whenever a new peak is reached.
 *
 * Complexity Analysis:
 * - Time Complexity: O(N) — The array is traversed exactly once.
 * - Space Complexity: O(1) — Only two integer variables are used for tracking, requiring constant extra space.
 *
 * Example:
 * Input: nums = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
 * Output: 6
 * Explanation: The subarray [4, -1, 2, 1] has the largest sum = 6.
 */
public class MaximumSubArray {

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Input Array: " + Arrays.toString(nums));

        int result = maxSubArray(nums);
        System.out.println("Maximum Subarray Sum: " + result);
    }

    public static int maxSubArray(int[] nums) {
        // Defensive check for empty or null arrays
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // Decide whether to continue the streak or start fresh
            currentSum = Math.max(nums[i], currentSum + nums[i]);

            // Record the all-time high
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}