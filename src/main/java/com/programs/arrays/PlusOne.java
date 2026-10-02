package com.programs.arrays;

import java.util.Arrays;

/**
 * Plus One (LeetCode #66)
 *
 * Problem Statement:
 * You are given a large integer represented as an integer array digits, where each
 * digits[i] is the ith digit of the integer. The digits are ordered from most significant```java
 package com.programs.arrays;

 import java.util.Arrays;

 /**
 * Solution for incrementing a large integer represented as a digit array.
 *
 * Problem Concept:
 * Given a non-empty array of decimal digits representing a non-negative integer,
 * increment the integer by one and return the resulting digit array. Digits are
 * stored such that the most significant digit is at the head of the list.
 *
 * Algorithmic Approach:
 * 1. Traverse backwards from the least significant digit (end of array).
 * 2. If a digit is strictly less than 9, increment it and immediately return the array,
 *    as no carry propagates further.
 * 3. If a digit is 9, it rolls over to 0, and the carry continues to the left.
 * 4. If the loop completes, every digit was 9 (e.g., 999 -> 1000). A new array of
 *    size (n + 1) is instantiated. By default, Java initializes int arrays to zeros,
 *    so setting the leading element at index 0 to 1 produces the correct representation.
 *
 * Complexity Analysis:
 * - Time Complexity: O(N) — Traversing the array once in the worst case.
 * - Space Complexity: O(1) auxiliary space in standard cases, or O(N) only when
 *   allocating a new array for full rollover (e.g., all 9s).
 */
public class PlusOne {

    public static void main(String[] args) {
        int[] digits = {9, 9, 9};
        int[] result = plusOne(digits);
        System.out.println(Arrays.toString(result)); // Outputs: [1, 0, 0, 0]
    }

    public static int[] plusOne(int[] nums) {
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] < 9) {
                nums[i]++;
                return nums;
            }
            nums[i] = 0;
        }

        // If all digits were 9, create an array of length n + 1
        int[] result = new int[nums.length + 1];
        result[0] = 1;
        return result;
    }
}