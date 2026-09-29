package com.programs.arrays;

import java.util.Arrays;

/**
 * Find the Highest Altitude (LeetCode #1732)
 *
 * Problem Statement:
 * A biker is going on a road trip. The road trip consists of n + 1 points at
 * different altitudes. The biker starts his trip on point 0 with altitude equal 0.
 * You are given an integer array gain of length n where gain[i] is the net altitude
 * gain between points i and i + 1 for all (0 <= i < n). Return the highest altitude
 * of a point.
 *
 * Explanation:
 * This problem is solved using a Running Sum (Prefix Sum) algorithm. Since we
 * only care about the highest peak, we do not need to store the intermediate
 * altitudes in a new array. We simply maintain a running total (`currentAltitude`)
 * and a variable to track the highest observed value (`maxAltitude`).
 *
 * Complexity Analysis:
 * - Time Complexity: O(N) — We iterate through the gain array exactly once.
 * - Space Complexity: O(1) — Only two integer variables are used, requiring
 *   constant extra space regardless of the input size.
 *
 * Edge Cases Handled:
 * - Negative Gains Only: If every gain is negative, the maxAltitude remains 0
 *   (the starting point), which is handled correctly by initializing maxAltitude to 0.
 *
 * Example:
 * Input: gain = [-4, -3, -2, -1, 4, 3, 2]
 * Output: 0
 * Explanation: The altitudes are [0, -4, -7, -9, -10, -6, -3, -1].
 * The highest is 0.
 */
public class FindTheHighestAltitude {

    public static void main(String[] args) {
        int[] nums = {-4, -3, -2, -1, 4, 3, 2};
        System.out.println("Gain array: " + Arrays.toString(nums));

        int maxAltitude = largestAltitude(nums);
        System.out.println("Highest Altitude: " + maxAltitude);
    }

    public static int largestAltitude(int[] nums) {
        // Defensive check against null arrays
        if (nums == null) {
            return 0;
        }

        int currentAltitude = 0;

        // maxAltitude starts at 0 because the trip starts at altitude 0
        int maxAltitude = 0;

        for (int i = 0; i < nums.length; i++) {
            currentAltitude += nums[i];

            // Pro-Tip: You could also write maxAltitude = Math.max(maxAltitude, currentAltitude);
            if (currentAltitude > maxAltitude) {
                maxAltitude = currentAltitude;
            }
        }

        return maxAltitude;
    }
}