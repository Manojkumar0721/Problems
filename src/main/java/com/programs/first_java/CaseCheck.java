package com.programs.first_java;

import java.util.Scanner;

/**
 * Character Case Checker
 *
 * Concept:
 * This program evaluates a single character input and determines whether it
 * is an uppercase letter or a lowercase letter based on its ASCII
 * (American Standard Code for Information Interchange) value.
 *
 * Algorithm & Logic:
 * In Java, characters are stored as numerical ASCII values behind the scenes.
 * Instead of checking every single letter, the program checks if the character
 * falls within the numerical ASCII boundaries for lowercase ('a' to 'z') or
 * uppercase ('A' to 'Z').
 *
 * Edge Cases Handled:
 * - Accidental Whitespace: Uses .trim() before .charAt(0) to ensure leading
 *   spaces don't cause the program to evaluate a blank space.
 * - Non-Alphabetical Inputs: Strict boundary checks prevent numbers (e.g., '7')
 *   or symbols (e.g., '@') from being incorrectly classified as uppercase.
 *
 * Example 1 (Lowercase):
 * Input: g
 * Output: g is Lowercase!
 *
 * Example 2 (Uppercase):
 * Input: M
 * Output: M is Uppercase!
 *
 * Example 3 (Symbol/Number):
 * Input: @
 * Output: @ is not an alphabetical letter.
 */
public class CaseCheck {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("~~~ Character Case Checker ~~~");
        System.out.print("Enter a character: ");

        // .trim() safely removes accidental leading spaces
        char ch = scanner.next().trim().charAt(0);

        checkCase(ch);

        scanner.close();
    }

    public static void checkCase(char ch) {
        // ASCII bounds check for lowercase (97 to 122)
        if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is Lowercase!");
        }
        // ASCII bounds check for uppercase (65 to 90)
        else if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is Uppercase!");
        }
        // Catch-all for numbers, punctuation, and symbols
        else {
            System.out.println(ch + " is not an alphabetical letter.");
        }
    }
}