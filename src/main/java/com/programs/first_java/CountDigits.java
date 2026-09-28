package com.programs.first_java;

import java.util.Scanner;

/**
 * Digit Occurrence Counter
 *
 * Concept:
 * This algorithm scans a given integer and counts exactly how many times a
 * specific target digit appears within it.
 *
 * Algorithm & Optimization:
 * Instead of converting the integer to a String and checking characters
 * (which consumes more memory), this program uses pure mathematics. It isolates
 * the final digit using modulo 10 (n % 10), compares it to the target, and then
 * truncates that digit using integer division (n / 10), repeating until the
 * number is reduced to 0.
 *
 * Edge Cases Handled:
 * - Negative Numbers: The digits of -555 are still just 5. Math.abs() strips
 *   the negative sign so the 'greater than 0' loop executes correctly.
 * - Absolute Zero: If the number is 0 and the target digit is 0, the loop
 *   would normally bypass. An explicit check returns 1 for this exact scenario.
 * - Invalid Targets: Throws an IllegalArgumentException if the user attempts
 *   to search for a target digit outside the valid 0-9 base-10 range.
 *
 * Example 1 (Standard):
 * Input: Number = 56565, Target = 5
 * Output: The digit 5 appears 3 times.
 *
 * Example 2 (Negative Number):
 * Input: Number = -1337, Target = 3
 * Output: The digit 3 appears 2 times.
 */
public class CountDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("~~~ Digit Occurrence Counter ~~~");

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.print("Enter the single digit you want to count: ");
        int digit = scanner.nextInt();

        int count = countOccurrences(number, digit);

        System.out.println("The digit " + digit + " appears " + count + " times.");

        scanner.close();
    }

    public static int countOccurrences(int number, int digit) {
        // Validate that the target is a single, valid base-10 digit
        if (digit < 0 || digit > 9) {
            throw new IllegalArgumentException("Target digit must be between 0 and 9.");
        }

        // Edge case: mathematically, the number 0 contains one '0'
        if (number == 0 && digit == 0) {
            return 1;
        }

        // Safely strip negative signs before processing
        number = Math.abs(number);
        int count = 0;

        // Extract, compare, and truncate loop
        while(number > 0) {
            int rem = number % 10;
            if(rem == digit) {
                count++;
            }
            number = number / 10;
        }

        return count;
    }
}