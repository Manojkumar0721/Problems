package com.programs.first_java;

import java.util.Scanner;

/**
 * Even or Odd Parity Checker
 *
 * Concept:
 * In mathematics, parity is the property of an integer indicating whether
 * it is even or odd. An even number is an integer that is exactly divisible
 * by 2, while an odd number leaves a remainder.
 *
 * Algorithm & Logic:
 * The program evaluates parity using the modulo operator (%). It divides the
 * input by 2 and checks the remainder. If the remainder is exactly 0, the
 * number is mathematically even.
 *
 * Edge Cases Handled:
 * - Zero (0): Mathematically, 0 is an even number because 0 divided by 2 is 0
 *   with a remainder of 0. The modulo logic perfectly accommodates this.
 * - Negative Numbers: Handled flawlessly. Because the program checks for equivalence
 *   to 0 (rather than equivalence to 1 for odd numbers), negative odds that yield
 *   a remainder of -1 correctly fall into the "Odd" branch.
 *
 * Example 1 (Standard Even):
 * Input: 24
 * Output: 24 is an Even number!
 *
 * Example 2 (Standard Odd):
 * Input: 7
 * Output: 7 is an Odd number!
 *
 * Example 3 (Negative Odd):
 * Input: -13
 * Output: -13 is an Odd number!
 */
public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("~~~ Even or Odd Parity Checker ~~~");
        System.out.print("Enter a number: ");

        int num = sc.nextInt();

        if (isEven(num)) {
            System.out.println(num + " is an Even number!");
        } else {
            System.out.println(num + " is an Odd number!");
        }

        sc.close();
    }

    public static boolean isEven(int num) {
        // Checking == 0 prevents bugs with negative odd remainders
        return num % 2 == 0;
    }
}