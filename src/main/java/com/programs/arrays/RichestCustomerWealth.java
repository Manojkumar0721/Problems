package com.programs.arrays;

import java.util.Arrays;

/**
 * Richest Customer Wealth (LeetCode #1672)
 *
 * Problem Statement:
 * You are given an m x n integer grid accounts where accounts[i][j] is the amount
 * of money the i-th customer has in the j-th bank. Return the wealth that the
 * richest customer has. A customer's wealth is the amount of money they have across
 * all their bank accounts.
 *
 * Algorithm (O(M * N) Time Complexity):
 * 1. Initialize maxWealth to 0.
 * 2. Iterate through each customer (outer loop 'i').
 * 3. For each customer, iterate through their bank accounts (inner loop 'j') and
 *    sum the values into currentCustomerWealth.
 * 4. Compare currentCustomerWealth to maxWealth. If it is greater, update maxWealth.
 * 5. Return maxWealth after all customers are evaluated.
 *
 * Edge Cases Handled:
 * - Empty Array: A defensive guard instantly returns 0 if the input is null or empty.
 *
 * Example:
 * Input: accounts = [[1,2,3],[3,2,1]]
 * Output: 6
 * Explanation:
 * 1st customer has wealth = 1 + 2 + 3 = 6
 * 2nd customer has wealth = 3 + 2 + 1 = 6
 * Both customers are considered the richest with a wealth of 6 each, so return 6.
 */
public class RichestCustomerWealth {

    public static void main(String[] args) {
        int[][] accounts = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Input Matrix:");
        for (int[] a : accounts) {
            System.out.println(Arrays.toString(a));
        }

        int result = maximumWealth(accounts);
        System.out.println("Richest Customer Wealth: " + result);
    }

    public static int maximumWealth(int[][] accounts) {
        // Defensive programming against null or empty inputs
        if (accounts == null || accounts.length == 0) {
            return 0;
        }

        int maxWealth = 0;

        // Outer loop iterates over each customer (row)
        for (int i = 0; i < accounts.length; i++) {
            int currentCustomerWealth = 0;

            // Inner loop iterates over each bank account for the current customer (columns)
            for (int j = 0; j < accounts[i].length; j++) {
                currentCustomerWealth += accounts[i][j];
            }

            // If this customer is richer than the current max, update the max
//            if (currentCustomerWealth > maxWealth) {
//                maxWealth = currentCustomerWealth;
//            }

            // Instead of using if condition using Math.max(a,b) to find out the maximum value.
            maxWealth = Math.max(maxWealth, currentCustomerWealth);
        }

        return maxWealth;
    }
}