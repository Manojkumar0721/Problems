package com.programs.arrays;

import java.util.Arrays;

/**
 * Number of Good Pairs (LeetCode #1512)
 *
 * Problem Statement:
 * Given an array of integers nums, return the number of good pairs.
 * A pair (i, j) is called good if nums[i] == nums[j] and i < j.
 *
 * Explanation:
 * This class demonstrates two ways to solve the problem:
 *
 * Method 1: Brute Force Approach (User Implementation)
 * Uses nested loops to compare every single element against every other
 * element that comes after it in the array.
 * - Time Complexity: O(N^2)
 * - Space Complexity: O(1)
 *
 * Method 2: Frequency Map Approach (Optimized)
 * Uses a tally sheet (array) to count the occurrences of each number.
 * Since the problem constraints state 1 <= nums[i] <= 100, a fixed-size
 * array of 101 can be used to track frequencies in a single pass.
 * - Time Complexity: O(N)
 * - Space Complexity: O(1) auxiliary space (fixed size 101 array)
 *
 * Example:
 * Input: nums = [1,1,1,1]
 * Output: 6
 * Explanation: Each pair in the array matches. The pairs are (0,1), (0,2),
 * (0,3), (1,2), (1,3), and (2,3).
 */
public class NumberOfGoodPairs {

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 1};
        System.out.println("Input: " + Arrays.toString(nums));

        int result = numIdenticalPairs(nums);
        System.out.println("Good Pairs (Brute Force): " + result);

        int optimizedResult = numIdenticalPairsOptimized(nums);
        System.out.println("Good Pairs (Optimized):   " + optimizedResult);
    }

    // Method 1: Your perfectly executed O(N^2) Solution
    public static int numIdenticalPairs(int[] nums){
        if (nums == null || nums.length == 0) return 0;

        int goodPairs = 0;

        for(int i = 0; i < nums.length; i++){
            // Start j at i+1 to avoid comparing the same elements or going backwards
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    goodPairs++;
                }
            }
        }
        return goodPairs;
    }

    // Method 2: The Interview-Grade O(N) Solution
    public static int numIdenticalPairsOptimized(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        int goodPairs = 0;
        int[] tally = new int[101]; // Constraint: numbers are between 1 and 100

        for (int i = 0; i < nums.length; i++) {
            // Add the current tally of this number to our score
            goodPairs += tally[nums[i]];
            // Increment the tally for the next time we see this number
            tally[nums[i]]++;
        }

        return goodPairs;
    }
}