package com.programs.basic;

import java.util.Scanner;

/**
 * Largest Number Finder (Sentinel Controlled Loop)
 *
 * Concept:
 * This program continuously accepts integers from the user and tracks the
 * maximum value entered. It uses a "sentinel value" (0) to signal the end
 * of the input stream.
 *
 * Algorithm & Optimization:
 * The maximum value variable ('largest') is initialized with the very first
 * user input rather than a fixed number like 0. This ensures mathematical
 * accuracy even if the user exclusively enters negative numbers.
 *
 * Edge Cases Handled:
 * - Negative Numbers: Handled perfectly because 'largest' starts as the
 *   first input, allowing subsequent larger negative numbers to replace it.
 * - Immediate Quit: If the user types 0 on the very first prompt, the loop
 *   bypasses entirely and safely prints 0 as the largest number entered.
 *
 * Example 1 (Standard):
 * Input:
 *   Enter a number (type 0 to quit): 5
 *   Enter a next digit: 12
 *   Enter a next digit: 3
 *   Enter a next digit: 0
 * Output:
 *   Largest: 12
 *
 * Example 2 (Negative Numbers):
 * Input:
 *   Enter a number (type 0 to quit): -50
 *   Enter a next digit: -10
 *   Enter a next digit: 0
 * Output:
 *   Largest: -10
 */
public class LargestUntilZero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("~~~ Largest Number Finder ~~~");

        System.out.print("Enter a number (type 0 to quit): ");
        int userInput = sc.nextInt();

        // Initializing with the first input prevents bugs with negative numbers
        int largest = userInput;

        // 0 acts as the sentinel value to break the loop
        while(userInput != 0){
            if(userInput > largest){
                largest = userInput;
            }
            System.out.print("Enter a next digit: ");
            userInput = sc.nextInt();
        }

        System.out.println("Largest: " + largest);

        sc.close();
    }
}