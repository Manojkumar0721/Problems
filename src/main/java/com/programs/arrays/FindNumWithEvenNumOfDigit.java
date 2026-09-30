package com.programs.arrays;

import java.util.Arrays;

/**
 * Find Numbers with Even Number of Digits (LeetCode #1295)
 *
 * Problem Statement:
 * Given an array nums of integers, return how many of them contain an even number of digits.
 *
 * Explanation:
 * This class provides two distinct approaches to solving the problem:
 *
 * Method 1: String Conversion (findNumbersV1)
 * Converts each integer into a String object and uses the built-in .length() method.
 * - Pros: Extremely readable, concise, and leverages the standard API.
 * - Cons: Slightly slower due to the overhead of allocating new String objects in memory.
 *
 * Method 2: Mathematical Division (findNumbersV2)
 * Uses base-10 integer division to repeatedly chop off the final digit until the
 * number reaches 0, counting the total number of divisions.
 * - Pros: Interview-preferred, highly optimal, and requires zero object allocations.
 *
 * Complexity Analysis:
 * - Time Complexity: O(N * K) — Where N is the number of elements in the array and K
 *   is the maximum number of digits in an element.
 * - Space Complexity:
 *   - V1 (String): O(K) auxiliary space to store the String representation of each number.
 *   - V2 (Math): O(1) auxiliary space, as it only uses primitive integer counters.
 *
 * Example:
 * Input: nums = [12, 345, 2, 6, 7896]
 * Output: 2 (Only 12 and 7896 have an even number of digits)
 */
public class FindNumWithEvenNumOfDigit {

    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println("Input Array: " + Arrays.toString(nums));

        int result = findNumbersV2(nums);
        System.out.println("Numbers with an even amount of digits: " + result);
    }

    // Method 1: The String API Approach
    public static int findNumbersV1(int[] nums) {
        int count = 0;

        for(int i = 0; i < nums.length; i++) {
            String s = String.valueOf(nums[i]);
            int length = s.length();
            if(length % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    // Method 2: The Mathematical Base-10 Approach
    public static int findNumbersV2(int[] nums) {
        int evenCount = 0;

        for(int i = 0; i < nums.length; i++) {
            int currentNumber = nums[i];
            int digitCount = 0;

            while(currentNumber > 0) {
                currentNumber = currentNumber / 10;
                digitCount++;
            }

            if(digitCount % 2 == 0) {
                evenCount++;
            }
        }
        return evenCount;
    }
}