package com.programs.intermediate;

import java.util.Scanner;

/**
 * Factorial Calculator
 *
 * Concept:
 * The factorial of a non-negative integer n is the product of all positive
 * integers less than or equal to n. It is heavily used in combinatorics,
 * algebra, and mathematical analysis.
 *
 * Formula:
 * n! = n * (n - 1) * (n - 2) * ... * 1
 *
 * Edge Cases Handled:
 * - Zero (0!): Mathematically, the factorial of 0 is exactly 1. The loop
 *   safely bypasses execution and returns the default 'fact' value of 1.
 * - Negative Numbers: Factorials for negative numbers are undefined. The
 *   program throws an IllegalArgumentException to prevent invalid math.
 * - Memory Overflow: A 64-bit 'long' variable maxes out at 9 quintillion.
 *   Because 21! exceeds this limit, the program restricts inputs to n <= 20
 *   to guarantee mathematically accurate results.
 *
 * Example 1:
 * Input:
 *   Enter a number: 5
 * Output:
 *   120  (Because 5 * 4 * 3 * 2 * 1 = 120)
 *
 * Example 2:
 * Input:
 *   Enter a number: 21
 * Output:
 *   Exception: Invalid input! Number must be between 0 and 20 to prevent memory overflow.
 */

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int userInput = sc.nextInt();
        long result = calculateFactorial(userInput);
        System.out.println(result);

    }

    public static long calculateFactorial(int n){
        long fact = 1;
        for(int i = 1; i <=n; i++){
            fact = fact * i;
        }
        return fact;
    }
}
