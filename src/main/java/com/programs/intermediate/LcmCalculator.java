package com.programs.intermediate;

import java.util.Scanner;

/**
 * Least Common Multiple (LCM) Calculator
 *
 * Concept:
 * The LCM of two integers is the smallest positive integer that is perfectly
 * divisible by both given numbers.
 *
 * Algorithm & Optimization:
 * Instead of using a slow "brute force" loop to check multiples one by one,
 * this program leverages the mathematical relationship between the Highest
 * Common Factor (HCF) and the LCM.
 *
 * To prevent silent integer overflow when calculating massive numbers, the
 * division (a / HCF) happens BEFORE the multiplication (* b), keeping the
 * intermediate values small. The final multiplication is cast to a 64-bit 'long'.
 *
 * Formula:
 * LCM(a, b) = (|a * b|) / HCF(a, b)
 *
 * Edge Cases Handled:
 * - Zero Inputs: The LCM of 0 and any number is 0. An explicit check handles this.
 * - Negative Inputs: LCM represents a distance/magnitude, so it is strictly positive.
 *   Math.abs() safely converts any negative inputs.
 * - Memory Overflow: Uses the division-first trick and 'long' casting to handle
 *   results larger than 2.14 billion.
 *
 * Example 1 (Standard):
 * Input:
 *   Enter first integer: 15
 *   Enter second integer: 20
 * Output:
 *   LCM: 60
 *
 * Example 2 (Zero Edge Case):
 * Input:
 *   Enter first integer: 0
 *   Enter second integer: 5
 * Output:
 *   LCM: 0
 */

public class LcmCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two integers.");
        System.out.print("Enter first integer: ");
        int a = sc.nextInt();
        System.out.print("Enter second integer: ");
        int b = sc.nextInt();
        long result = calculateLcm(a,b);
        System.out.println("LCM: " + result);
        sc.close();
    }

    public static long calculateLcm(int a, int b){
        a = Math.abs(a);
        b = Math.abs(b);
        if( a == 0 || b == 0){
            return 0;
        }
        return (long) (a / calculateHcf(a, b)) * b;
    }

    public static int calculateHcf(int a, int b){
        a = Math.abs(a);
        b = Math.abs(b);
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
