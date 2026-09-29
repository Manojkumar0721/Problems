package com.programs.arrays;

import java.util.Arrays;

/**
 * How Many Numbers Are Smaller Than the Current Number (LeetCode #1365)
 *
 * Problem Statement:
 * Given the array nums, for each nums[i] find out how many numbers in the array
 * are smaller than it. That is, for each nums[i] you have to count the number of
 * valid j's such that j != i and nums[j] < nums[i].
 *
 * Explanation:
 * This class demonstrates two approaches to solving the problem:
 *
 * Method 1: Brute Force Approach
 * Compares every single number against every other number using nested loops.
 * - Time Complexity: O(N^2)
 * - Space Complexity: O(N) for the result array.
 *
 * Method 2: Frequency Map & Prefix Sum Approach (Optimized)
 * Leverages the problem constraint (0 <= nums[i] <= 100) to achieve linear time.
 * 1. Tally: Count the occurrences of each number in a frequency array.
 * 2. Prefix Sum: Modify the tally array so each index holds the sum of all previous counts.
 * 3. Map: For any number 'x', the count of smaller numbers is simply the prefix sum at 'x - 1'.
 * - Time Complexity: O(N)
 * - Space Complexity: O(1) auxiliary space (fixed array of size 101).
 *
 * Example:
 * Input: nums = [8,1,2,2,3]
 * Output: [4,0,1,1,3]
 */
public class SmallerNumberThanCurrent {

    public static void main(String[] args) {
        int[] nums = {8, 1, 2, 2, 3};
        System.out.println("Input: " + Arrays.toString(nums));

        int[] resultBrute = smallerNumberThanCurrent(nums);
        System.out.println("Output (Brute Force): " + Arrays.toString(resultBrute));

        int[] resultOptimized = smallerNumberThanCurrent2(nums);
        System.out.println("Output (Optimized):   " + Arrays.toString(resultOptimized));
    }

    // Method 1: O(N^2) Time Complexity
    public static int[] smallerNumberThanCurrent(int[] nums){
        if (nums == null || nums.length == 0) return new int[0];

        int[] result = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            int count = 0;
            for(int j = 0; j < nums.length; j++){
                if(nums[j] < nums[i]){
                    count++;
                }
            }
            result[i] = count;
        }

        return result;
    }

    // Method 2: O(N) Time Complexity (Interview Grade)
    public static int[] smallerNumberThanCurrent2(int[] nums){
        if (nums == null || nums.length == 0) return new int[0];

        // Step 1: Create the frequency tally
        int[] tally = new int[101];
        for(int i : nums){
            tally[i]++;
        }

        // Step 2: Calculate the running sum (prefix sum)
        for(int i = 1; i < tally.length; i++){
            tally[i] = tally[i] + tally[i - 1];
        }

        // Step 3: Map the results
        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            // If the number is 0, there are no positive numbers smaller than it
            if(nums[i] == 0){
                result[i] = 0;
            } else {
                // The number of strictly smaller items is the prefix sum of the previous integer
                result[i] = tally[nums[i] - 1];
            }
        }

        return result;
    }
}