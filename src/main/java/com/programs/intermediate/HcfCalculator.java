package com.programs.intermediate;

import java.util.Scanner;

/**
 * Highest Common Factor (HCF) / Greatest Common Divisor (GCD) Calculator
 *
 * Concept:
 * The HCF of two numbers is the largest positive integer that divides both
 * numbers perfectly without leaving a remainder.
 *
 * Algorithm Used (Euclidean Algorithm):
 * Instead of checking every number from 1 up to 'a', this program uses the
 * highly efficient Euclidean Algorithm. It repeatedly replaces the larger
 * number with the remainder of the two numbers. When the remainder hits 0,
 * the last non-zero divisor is the HCF.
 *
 * Edge Cases Handled:
 * - Negative Inputs: HCF is always a positive magnitude. The method uses
 *   Math.abs() to safely convert any negative inputs into positives before
 *   doing the math.
 * - Zero Inputs: The logic naturally handles 0. The HCF of 0 and any
 *   number 'n' is simply 'n' (because 'n' perfectly divides 0).
 *
 * Example 1 (Standard):
 * Input:
 *   Enter first integer: 60
 *   Enter second integer: 36
 * Output:
 *   HCF: 12
 *
 * Example 2 (Negative Numbers):
 * Input:
 *   Enter first integer: -15
 *   Enter second integer: 20
 * Output:
 *   HCF: 5
 */

public class HcfCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two integers.");
        System.out.print("Enter first integer: ");
        int a = sc.nextInt();
        System.out.print("Enter second integer: ");
        int b = sc.nextInt();
        int result = calculateHcf(a,b);
        System.out.println(result);
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
