package com.programs.basic;

import java.util.Scanner;

/**
 * Number Factors (Divisors) Calculator
 *
 * Concept:
 * A factor (or divisor) of a number is an integer that divides the given number
 * perfectly without leaving a remainder.
 *
 * Algorithm & Optimization:
 * The program iterates through potential divisors using the modulo operator (%).
 * To optimize performance, the loop only runs up to (n / 2). Mathematically,
 * no number can have a proper divisor greater than half of its own value. The
 * original number itself is then manually appended at the end of the list.
 *
 * Edge Cases Handled:
 * - Zero: Zero is perfectly divisible by every non-zero integer, meaning it
 *   has infinite factors. The program intercepts 0 immediately to prevent an
 *   infinite loop or meaningless output.
 * - Negative Numbers: In basic number theory, the positive factors of a negative
 *   number are identical to its positive counterpart. Math.abs() converts negatives
 *   so the loop executes correctly.
 * - One: Safely bypasses the loop (since 1/2 = 0 in integer math) and simply
 *   prints '1'.
 *
 * Example 1 (Standard Number):
 * Input: 28
 * Output: 1 2 4 7 14 28
 *
 * Example 2 (Prime Number):
 * Input: 13
 * Output: 1 13
 *
 * Example 3 (Negative Number):
 * Input: -12
 * Output: 1 2 3 4 6 12
 */
public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("~~~ Factors Calculator ~~~");
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        factors(n);

        sc.close();
    }

    public static void factors(int n){
        if(n == 0){
            System.out.println("Every number is a factor of 0 (except 0).");
            return;
        }

        // Safely handles negative inputs
        n = Math.abs(n);

        // Optimized to only loop up to half the number
        for(int i = 1; i <= n / 2; i++){
            int remainder = n % i;
            if(remainder == 0){
                System.out.print(i + " ");
            }
        }

        // Print the number itself at the very end
        System.out.println(n);
    }
}