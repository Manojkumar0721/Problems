package com.programs.arrays;

import java.util.Arrays;

/**
 * Running Sum of 1d Array (LeetCode #1480)
 *
 * Problem Statement:
 * Given an array nums, we define a running sum of an array as
 * runningSum[i] = sum(nums[0]...nums[i]). Return the running sum of nums.
 *
 * Explanation:
 * The problem requires calculating a cumulative total at each index.
 * Instead of recalculating the sum from the beginning of the array every
 * time, we can leverage the fact that the immediately preceding index
 * already holds the perfect sum of all previous numbers.
 *
 * Algorithm (O(N) Space approach):
 * 1. Create a new array of the exact same size to avoid modifying the original data.
 * 2. The first element is always just itself, so initialize ans[0] = nums[0].
 * 3. Loop from index 1 to the end, calculating: ans[i] = ans[i-1] + nums[i].
 *
 * Edge Cases Handled:
 * - Empty/Null Array: A defensive guard intercepts empty arrays before the
 *   initial ans[0] assignment, preventing an ArrayIndexOutOfBoundsException.
 *
 * Example 1:
 * Input: nums = [1,2,3,4]
 * Output: [1,3,6,10]
 * Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
 *
 * Example 2:
 * Input: nums = [1,1,1,1,1]
 * Output: [1,2,3,4,5]
 */
public class RunningSumOf1dArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println("Input:  " + Arrays.toString(nums));

        int[] newArray = runningSum(nums);
        System.out.println("Output: " + Arrays.toString(newArray));
    }

    public static int[] runningSum(int[] nums){
        // Defensive guard to prevent out-of-bounds exceptions on empty inputs
        if (nums == null || nums.length == 0) {
            return new int[0];
        }

        int[] newArray = new int[nums.length];

        // Base case: the first element's running sum is just itself
        newArray[0] = nums[0];

        // Dynamic programming approach: look one step backward to calculate the current step
        for(int i = 1; i < nums.length; i++){
            newArray[i] = newArray[i-1] + nums[i];
        }

        return newArray;
    }
}