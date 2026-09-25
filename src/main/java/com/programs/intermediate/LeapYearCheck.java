package com.programs.intermediate;

import java.util.Scanner;

/**
 * Leap Year Checker
 *
 * Concept:
 * To keep our calendar aligned with the Earth's revolutions around the Sun,
 * a leap year adds an extra day (February 29) almost every four years.
 * This program uses the official Gregorian calendar rules to determine validity.
 *
 * Logic Rules:
 * 1. If the year is evenly divisible by 4, it is a leap year.
 * 2. Exception: If the year is also evenly divisible by 100 (e.g., 1900),
 *    it is NOT a leap year.
 * 3. Exception to the Exception: If the century year is evenly divisible
 *    by 400 (e.g., 2000), it IS a leap year.
 *
 * Edge Cases Handled:
 * - Negative and Zero Years: Throws an IllegalArgumentException. Year 0 does
 *   not exist in the Gregorian calendar (it goes from 1 BC to 1 AD), and
 *   negative years break the standard modulo logic intended for AD years.
 *
 * Example 1 (Standard Leap Year):
 * Input: 2024
 * Output: 2024 is Leap year.
 *
 * Example 2 (Century Exception):
 * Input: 1900
 * Output: 1900 is not Leap year.
 *
 * Example 3 (400-Year Exception):
 * Input: 2000
 * Output: 2000 is Leap year.
 */

public class LeapYearCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("~~~ Leap Year Checker ~~~");
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        boolean isLeapYear = checkLeapYear(year);
        if(isLeapYear){
            System.out.println(year + " is Leap year.");
        }else{
            System.out.println(year + " is not Leap year.");
        }
        sc.close();
    }

    public static boolean checkLeapYear(int year){
        if(year <= 0){
            throw new IllegalArgumentException("Year cannot be negative please enter some valid year.");
        }
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
    }
}
