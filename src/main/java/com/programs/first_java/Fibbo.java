package com.programs.first_java;

import java.util.Scanner;

/**
 * Fibonacci Sequence Calculator
 *
 * Concept:
 * The Fibonacci sequence is a series of numbers where each number is the sum
 * of the two preceding ones, usually starting with 0 and 1. It appears frequently
 * in mathematics, nature, and computer science algorithms.
 *
 * Algorithm & Optimization:
 * Instead of using recursion (which creates massive O(2^n) memory overhead),
 * this program uses an iterative dynamic programming approach. It strictly
 * tracks the two most recent numbers ('a' and 'b'), swapping them forward
 * in O(N) time with O(1) space complexity.
 *
 * Edge Cases Handled:
 * - Base Cases (0 and 1): Explicitly intercepted before loop execution to
 *   prevent logical errors. The 0th number correctly returns 0.
 * - Integer Overflow: The sequence grows massively. The variables are upgraded
 *   from 'int' to 'long', allowing accurate calculations up to the 92nd number.
 * - Out of Bounds: Throws an IllegalArgumentException for negative inputs or
 *   inputs greater than 92 (which would overflow even a 64-bit long).
 *
 * Example 1 (Base Case):
 * Input: 0
 * Output: 0
 *
 * Example 2 (Standard Sequence):
 * Input: 7
 * Output: 13
 * (Sequence: 0, 1, 1, 2, 3, 5, 8, 13)
 *
 * Example 3 (Massive Number):
 * Input: 50
 * Output: 12586269025
 */
public class Fibbo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("~~~ Fibonacci Sequence Calculator ~~~");
        System.out.print("Enter the position (n) in the Fibonacci sequence: ");

        int n = input.nextInt();

        long result = calculateFibonacci(n);
        System.out.println("The Fibonacci number at position " + n + " is: " + result);

        input.close();
    }

    public static long calculateFibonacci(int n) {
        // Guard clause preventing undefined math and memory overflow
        if (n < 0 || n > 92) {
            throw new IllegalArgumentException("Position must be between 0 and 92.");
        }

        // Manual handling of the base cases
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        long a = 0;
        long b = 1;
        int count = 2;

        // Iterative sliding window mechanism
        while (count <= n) {
            long temp = b;
            b = a + b;
            a = temp;
            count++;
        }

        return b;
    }
}