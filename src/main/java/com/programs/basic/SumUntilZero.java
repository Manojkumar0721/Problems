package com.programs.basic;

import java.util.Scanner;

/**
 * Continuous Summation (Sentinel Controlled Loop)
 *
 * Concept:
 * This program continuously accepts integers from the user and maintains a 
 * running total. It utilizes a "sentinel value" (0) to signal the end of the 
 * input stream and terminate the loop.
 *
 * Architecture & Optimization:
 * - Overflow Protection: The accumulator variable ('sum') is declared as a 
 *   64-bit 'long' rather than a 32-bit 'int'. This prevents integer overflow 
 *   in cases where the user inputs multiple massive numbers.
 *
 * Edge Cases Handled:
 * - Negative Numbers: The program naturally handles negative integers, simply 
 *   subtracting them from the running total as expected in algebraic addition.
 * - Immediate Quit: If the user types 0 on the very first prompt, the loop 
 *   is safely bypassed and the program outputs a total sum of 0.
 *
 * Example 1 (Standard):
 * Input: 
 *   Enter a number to sum (type 0 to quit): 50
 *   Enter next number (type 0 to quit): 25
 *   Enter next number (type 0 to quit): 0
 * Output: 
 *   Total sum: 75
 *
 * Example 2 (Negative Numbers):
 * Input:
 *   Enter a number to sum (type 0 to quit): 100
 *   Enter next number (type 0 to quit): -40
 *   Enter next number (type 0 to quit): 0
 * Output:
 *   Total sum: 60
 */
public class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("~~~ Continuous Summation ~~~");

        System.out.print("Enter a number to sum (type 0 to quit): ");
        int userInput = sc.nextInt();

        // Upgraded to 'long' to prevent silent memory overflow
        long sum = 0;

        // 0 acts as the sentinel value to break the loop
        while(userInput != 0){
            sum = sum + userInput;
            System.out.print("Enter next number (type 0 to quit): ");
            userInput = sc.nextInt();
        }

        System.out.println("Total sum: " + sum);
        sc.close();
    }
}