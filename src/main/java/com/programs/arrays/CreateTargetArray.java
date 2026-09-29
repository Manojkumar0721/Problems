package com.programs.arrays;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Create Target Array in the Given Order (LeetCode #1389)
 *
 * Problem Statement:
 * Given two arrays of integers nums and index. Your task is to create a target
 * array under the following rules:
 * - Initially target array is empty.
 * - From left to right read nums[i] and index[i], insert at index index[i]
 *   the value nums[i] in the target array.
 * - Repeat the previous step until there are no elements to read in nums and index.
 *
 * Explanation:
 * This solution leverages a dynamic array (ArrayList) to handle complex memory
 * shifting operations automatically. When an element is inserted at an existing
 * index, ArrayList natively shifts all subsequent elements to the right. After
 * all insertions are complete, the dynamic list is converted back into a primitive
 * array to satisfy the return type requirements.
 *
 * Complexity Analysis:
 * - Time Complexity: O(N^2) — While our loop runs N times, the ArrayList.add(index, value)
 *   method takes O(N) time under the hood because it must physically shift elements
 *   in memory. N insertions * N shifts = O(N^2).
 * - Space Complexity: O(N) — We allocate an ArrayList of size N to build the target
 *   before transferring it to the final array.
 *
 * Example:
 * Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
 * Output: [0,4,1,3,2]
 */
public class CreateTargetArray {

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};

        System.out.println("Nums:  " + Arrays.toString(nums));
        System.out.println("Index: " + Arrays.toString(index));

        int[] result = createTargetArray(nums, index);
        System.out.println("Output: " + Arrays.toString(result));
    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        // Defensive check
        if (nums == null || index == null || nums.length != index.length) {
            return new int[0];
        }

        // Step 1: Use a dynamic list to automatically handle right-shifts
        ArrayList<Integer> targetList = new ArrayList<>(nums.length);

        for (int i = 0; i < nums.length; i++) {
            targetList.add(index[i], nums[i]);
        }

        // Step 2: Convert the dynamic list back into a primitive array
        int[] result = new int[nums.length];

        // Use a standard index-based loop to safely extract values
        for (int i = 0; i < targetList.size(); i++) {
            result[i] = targetList.get(i);
        }

        return result;
    }
}