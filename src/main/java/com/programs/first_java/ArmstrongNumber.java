package com.programs.first_java;

import java.util.Scanner;

/**
 * Armstrong (Narcissistic) Number Checker
 *
 * Concept:
 * In number theory, an Armstrong number (also known as a narcissistic number)
 * is a number that is equal to the sum of its own digits, each raised to the
 * power of the total number of digits.
 *
 * Algorithm & Optimization:
 * The program first dynamically determines the total number of digits by safely
 * converting the integer to a String. It then isolates each digit using the modulo
 * operator (%), raises it to the calculated power using Math.pow(), and accumulates
 * the running total.
 *
 * Edge Cases Handled:
 * - Negative Numbers: Armstrong numbers are strictly defined for positive integers.
 *   A negative number guard immediately returns false. This also prevents a bug
 *   where String.valueOf(-153).length() would incorrectly count the '-' symbol as a digit.
 * - Single-Digit Numbers: The logic naturally handles numbers 0-9. Any single digit
 *   raised to the power of 1 is just itself, meaning all single digits are Armstrong numbers.
 *
 * Example 1 (Standard 3-Digit):
 * Input: 153
 * Output: 153 is an Armstrong Number!
 * (1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153)
 *
 * Example 2 (Standard 4-Digit):
 * Input: 1634
 * Output: 1634 is an Armstrong Number!
 * (1^4 + 6^4 + 3^4 + 4^4 = 1 + 1296 + 81 + 256 = 1634)
 *
 * Example 3 (Non-Armstrong):
 * Input: 100
 * Output: 100 is not an Armstrong Number!
 */
public class ArmstrongNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("~~~ Armstrong Number Checker ~~~");
        System.out.print("Enter a number: ");

        int num = sc.nextInt();

        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong Number!");
        } else {
            System.out.println(num + " is not an Armstrong Number!");
        }

        sc.close();
    }

    public static boolean isArmstrong(int num) {
        // Negative numbers are not Armstrong numbers, and this guard
        // prevents the '-' symbol from throwing off the string length calculation.
        if (num < 0) {
            return false;
        }

        int original = num;
        int result = 0;

        // Dynamically count digits
        int digits = String.valueOf(num).length();

        while (num > 0) {
            int remainder = num % 10;
            // Math.pow returns a double, so we cast it back to an int for accurate comparison
            result += (int) Math.pow(remainder, digits);
            num /= 10;
        }

        return result == original;
    }
}