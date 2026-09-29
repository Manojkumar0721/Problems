package com.programs.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Kids With the Greatest Number of Candies (LeetCode #1431)
 *
 * Problem Statement:
 * Given an integer array candies, where each candies[i] represents the number of
 * candies the i-th kid has, and an integer extraCandies, denoting the number of
 * extra candies that you have. Return a boolean array result of length n, where
 * result[i] is true if, after giving the i-th kid all the extraCandies, they will
 * have the greatest number of candies among all the kids, or false otherwise.
 *
 * Explanation:
 * This requires a Two-Pass algorithm. We cannot know if a kid will have the maximum
 * amount of candies until we know what the absolute maximum currently is.
 * 1. Pass 1: Iterate through the array to find the current highest number of candies.
 * 2. Pass 2: Iterate through the array again. For each kid, evaluate if their
 *    current candies plus the extraCandies is greater than or equal to the maximum.
 *
 * Complexity Analysis:
 * - Time Complexity: O(N) — We traverse the array exactly twice, which simplifies to O(N).
 * - Space Complexity: O(N) — We create an ArrayList of size N to store the boolean results
 *   (or O(1) auxiliary space if the output array is not counted).
 *
 * Example:
 * Input: candies = [2,3,5,1,3], extraCandies = 3
 * Output: [true, true, true, false, true]
 */
public class KidsWithCandies {

    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;

        System.out.println("Input Candies: " + Arrays.toString(candies));
        System.out.println("Extra Candies: " + extraCandies);

        List<Boolean> result = kidsWithCandies(candies, extraCandies);

        System.out.print("Output: ");
        for(boolean isItMax : result){
            System.out.print(isItMax + " ");
        }
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies){
        // Defensive check against null or empty arrays
        if (candies == null || candies.length == 0) {
            return new ArrayList<>();
        }

        int maxCandies = 0;

        // Pass 1: Find the absolute maximum number of candies any one kid has
        for(int i = 0; i < candies.length; i++){
            // Pro-Tip: You could also use maxCandies = Math.max(maxCandies, candies[i]);
            if(candies[i] > maxCandies){
                maxCandies = candies[i];
            }
        }

        List<Boolean> result = new ArrayList<>(candies.length);

        // Pass 2: Test each kid to see if they can reach or beat the maximum
        for(int i = 0; i < candies.length; i++){
            // Simplification: Evaluate the expression and add the resulting boolean directly
            result.add(candies[i] + extraCandies >= maxCandies);
        }

        return result;
    }
}