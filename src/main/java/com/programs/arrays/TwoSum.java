package com.programs.arrays;

import java.util.Arrays;

/**
 * Two Sum (LeetCode #1)
 *
 * Problem Statement:
 * Given an array of integers nums and an integer target, return indices of the two
 * numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not
 * use the same element twice. You can return the answer in any order.
 *
 * Explanation:
 * This solution uses a Brute Force approach. It checks every possible pair of
 * numbers in the array using a nested loop structure.
 * - The outer loop ('i') selects the first number.
 * - The inner loop ('j') starts at 'i + 1' to avoid checking the same index twice
 *   or repeating combinations backwards, and checks if the sum equals the target.
 *
 * Complexity Analysis:
 * - Time Complexity: O(N^2) — Where N is the number of elements in the array.
 *   In the worst case, we check every combination, which results in N*(N-1)/2 operations.
 * - Space Complexity: O(1) — We do not allocate any additional data structures
 *   that grow with the input size; we only return a small fixed-size array.
 *
 * Future Optimization Note:
 * While this O(N^2) solution is correct, an O(N) solution exists using a HashMap
 * (to store complements), which is the standard optimal solution for this specific problem.
 *
 * Example:
 * Input: nums = [2, 7, 11, 15], target = 9
 * Output: [0, 1]
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 17;

        System.out.println("Input Array: " + Arrays.toString(nums));
        System.out.println("Target Sum: " + target);

        int[] result = twoSumV2(nums, target);

        if(result != null) {
            System.out.println("Indices Found: " + Arrays.toString(result));
            System.out.println("Values: " + nums[result[0]] + " + " + nums[result[1]] + " = " + target);
        } else {
            System.out.println("No matching pairs found.");
        }
    }

    // Method 1: The O(N^2) Brute Force Approach
    public static int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    // Method 2: The O(N) Optimized Two-Pointer Approach
    public static int[] twoSumV2(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while(left < right) {
            int currentSum = nums[left] + nums[right];

            if(currentSum == target) {
                return new int[]{left, right};
            } else if (currentSum < target) {
                left++; // Sum is too small, make it bigger
            } else {
                right--; // Sum is too big, make it smaller
            }
        }
        return null;
    }
}