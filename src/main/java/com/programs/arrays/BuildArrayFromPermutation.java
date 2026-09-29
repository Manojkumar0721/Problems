package com.programs.arrays;

import java.util.Arrays;

/**
 * Build Array from Permutation (LeetCode #1920)
 *
 * Problem Statement:
 * Given a zero-based permutation nums (0-indexed), build an array ans of the
 * same length where ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.
 * A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1
 * (inclusive).
 *
 * Explanation:
 * The array acts as both a collection of values and a collection of pointers.
 * For every index 'i', we look at the value stored at that index. We then treat
 * THAT value as a new coordinate, jump to that new coordinate, and retrieve the
 * final target value.
 *
 * Method 1: Standard Approach (O(N) Space)
 * 1. Create a new array of the exact same size as the input.
 * 2. Loop through the original array.
 * 3. Assign newArray[i] = num[num[i]].
 * 4. Return the new array.
 * Time Complexity: O(N) | Space Complexity: O(N)
 *
 * Edge Cases Handled:
 * - Empty/Null Array: A defensive guard instantly returns an empty array if
 *   invalid data is passed to the method.
 *
 * Method 2: Advanced In-Place Approach (O(1) Space)
 *   Uses Euclidean mathematical encoding to store two values inside a single array slot.
 *   1. Encoding Pass: We pack the old value and the target value together using the formula:
 *      nums[i] = nums[i] + (nums[nums[i]] % n) * n
 *      The modulo (% n) ensures we only extract the original un-encoded value from the target.
 *   2. Decoding Pass: We divide every element by n. Because Java performs integer division,
 *      the old value (the remainder) is dropped, leaving only the new target value.
 *      Time Complexity: O(N) | Space Complexity: O(1)
 *
 * Example 1:
 * Input: nums = [0,2,1,5,3,4]
 * Output: [0,1,2,4,5,3]
 * Explanation:
 *   - ans[0] = nums[nums[0]] = nums[0] = 0
 *   - ans[1] = nums[nums[1]] = nums[2] = 1
 *   - ans[2] = nums[nums[2]] = nums[1] = 2
 *   - ans[3] = nums[nums[3]] = nums[5] = 3
 *   - ans[4] = nums[nums[4]] = nums[3] = 4
 *   - ans[5] = nums[nums[5]] = nums[4] = 5
 *
 * Example 2:
 * Input: nums = [5,0,1,2,3,4]
 * Output: [4,5,0,1,2,3]
 *
 * Method 2: Advanced In-Place Approach (O(1) Space)
 *
 * Uses Euclidean mathematical encoding to store two values inside a single array slot.
 * The Formula: nums[i] = nums[i] + (nums[nums[i]] % n) * n
 *
 * Step-by-Step Example Trace for nums = [5, 0, 1, 2, 3, 4] (n = 6):
 *
 * Pass 1: The Encoding Loop
 * - i=0: nums[0]=5. Target is nums[5]=4. Math: 5 + (4 % 6) * 6 = 29.  Array: [29, 0, 1, 2, 3, 4]
 * - i=1: nums[1]=0. Target is nums[0]=29. Math: 0 + (29 % 6) * 6 = 30. Array: [29, 30, 1, 2, 3, 4]
 *   *(Note at i=1: nums[0] was already overwritten to 29. The modulo 29 % 6 safely extracts the original 5)*
 * - i=2: nums[2]=1. Target is nums[1]=30. Math: 1 + (30 % 6) * 6 = 1.  Array: [29, 30, 1, 2, 3, 4]
 * - i=3: nums[3]=2. Target is nums[2]=1.  Math: 2 + (1 % 6) * 6 = 8.   Array: [29, 30, 1, 8, 3, 4]
 * - i=4: nums[4]=3. Target is nums[3]=8.  Math: 3 + (8 % 6) * 6 = 15.  Array: [29, 30, 1, 8, 15, 4]
 * - i=5: nums[5]=4. Target is nums[4]=15. Math: 4 + (15 % 6) * 6 = 22. Array: [29, 30, 1, 8, 15, 22]
 *
 * Pass 2: The Decoding Loop
 * Divides every element by n (6). Integer division automatically drops the remainder (the old value),
 * leaving only the shifted target value.
 * - 29 / 6 = 4
 * - 30 / 6 = 5
 * -  1 / 6 = 0
 * -  8 / 6 = 1
 * - 15 / 6 = 2
 * - 22 / 6 = 3
 *
 * Final In-Place Array: [4, 5, 0, 1, 2, 3]
 *
 */
public class BuildArrayFromPermutation {

    public static void main(String[] args) {
        // A valid zero-based permutation array of length 6 (contains 0 through 5)
        int[] nums = {0, 2, 1, 5, 3, 4};

        System.out.println("Input:  " + Arrays.toString(nums));
        int[] newArray = create(nums);
        System.out.println("Output: " + Arrays.toString(newArray));
    }

    // Method 1: O(N) Space Complexity
    public static int[] create(int[] nums){
        if (nums == null || nums.length == 0) {
            return new int[0];
        }

        int[] newArray = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            newArray[i] = nums[nums[i]];
        }

        return newArray;
    }

    // Method 2: O(1) Space Complexity (Mathematical Encoding)
    public static int[] createArray(int[] nums){
        int n = nums.length;

        for(int i = 0; i < n; i++){
            nums[i] = nums[i] + (nums[nums[i]] % n) * n;
        }
        for(int i = 0; i < n; i++){
            nums[i] = nums[i] / n;
        }
        return nums;
    }

}